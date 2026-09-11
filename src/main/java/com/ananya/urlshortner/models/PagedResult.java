package com.ananya.urlshortner.models;

import org.springframework.data.domain.Page;

import java.util.List;

public record PagedResult<T>(
    List<T> data,
    int pageNumber,
    int totalPage,
    long totalElements,
    boolean isFirst,
    boolean isLast,
    boolean hasNext,
    boolean hasPrevious){

    public static <T> PagedResult<T> from(Page<T> page){
        return new PagedResult<>(
                page.getContent(),
                page.getNumber() +1,
                page.getTotalPages(),
                page.getTotalElements(),
                page.isFirst(),
                page.isLast(),
                page.hasNext(),
                page.hasPrevious());
    }

}
