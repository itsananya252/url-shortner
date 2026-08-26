package com.ananya.urlshortner.web.controllers;

import com.ananya.urlshortner.ApplicationProperties;
import com.ananya.urlshortner.domain.entites.modles.Services.ShortUrlService;
import com.ananya.urlshortner.domain.entites.modles.exceptions.ShortUrlNotFoundException;
import com.ananya.urlshortner.models.CreateShortUrlCmd;
import com.ananya.urlshortner.models.ShortUrlDto;
import com.ananya.urlshortner.web.controllers.dtos.CreateShortUrlForm;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {
    private final ShortUrlService shortUrlService;
    private final ApplicationProperties properties;

    public HomeController(ShortUrlService shortUrlService, ApplicationProperties properties) {
        this.shortUrlService = shortUrlService;
        this.properties = properties;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<ShortUrlDto> shortUrls = shortUrlService.findAllPublicShortUrls();
        model.addAttribute("shortUrls", shortUrls);
        model.addAttribute("baseUrl", properties.baseUrl());
        model.addAttribute("createShortUrlForm", new CreateShortUrlForm(""));
        return "index";
    }

    @PostMapping("/short-urls")
    String createShortUrl(@ModelAttribute("createShortUrlForm") @Valid CreateShortUrlForm form,
                          BindingResult bindingResult,
                          RedirectAttributes redirectAttributes,
                          Model model) {
        if(bindingResult.hasErrors()) {
            List<ShortUrlDto> shortUrls = shortUrlService.findAllPublicShortUrls();
            model.addAttribute("shortUrls", shortUrls);
            model.addAttribute("baseUrl", properties.baseUrl());
            return "index";
        }

        try {
            CreateShortUrlCmd cmd = new CreateShortUrlCmd(form.originalUrl());
            var shortUrlDto = shortUrlService.createShortUrl(cmd);
            redirectAttributes.addFlashAttribute("successMessage", "Short URL created successfully "+
                    properties.baseUrl()+"/s/"+shortUrlDto.shortKey());
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("errorMessage", "Failed to create short URL");

        }
        return "redirect:/";
    }
    @GetMapping("/s/{shortKey}")
    String redirectToOriginalUrl(@PathVariable String shortKey) {
        Optional<ShortUrlDto>shortUrlDtoOptional=shortUrlService.accessShortUrl(shortKey);
        if (shortUrlDtoOptional.isEmpty()) {
            throw new ShortUrlNotFoundException("Invalid short key: "+shortKey);
        }
        ShortUrlDto shortUrlDto=shortUrlDtoOptional.get();
        return "redirect:"+shortUrlDto.originalUrl();
    }

}