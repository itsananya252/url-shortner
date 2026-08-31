INSERT INTO users (email, password, name, role)
VALUES ('admin@gmail.com', 'admin', 'Administrator', 'ROLE_ADMIN'),
       ('ananya@gmail.com', 'secret', 'Ananya', 'ROLE_USER');

INSERT INTO short_urls (short_key, original_url, created_by, created_at, expires_at, is_private, click_count)
VALUES
    ('rs1Aed', 'https://www.sivalabs.in/code-offline-with-local-ai-ollama', 1, CURRENT_TIMESTAMP, NULL, FALSE, 0),
    ('juiFDF', 'https://www.sivalabs.in/run-spring-boot-testcontainers-tests-at-jet-speed', 1, TIMESTAMP '2024-07-16', NULL, FALSE, 0),
    ('ertcbl', 'https://www.sivalabs.in/running-custom-spring-initializr', 1, CURRENT_TIMESTAMP, NULL, FALSE, 0),
    ('sqdrftg', 'https://www.sivalabs.in/an-email-template-of-asking-for-technical-help', 1, CURRENT_TIMESTAMP, NULL, TRUE, 0),
    ('ybtayh', 'https://www.sivalabs.in/mastering-spring-boot-in-5-stages', 1, CURRENT_TIMESTAMP, NULL, FALSE, 0),
    ('yrtfvob', 'https://www.sivalabs.in/thymeleaf-layouts-using-fragment-expressions', 1, CURRENT_TIMESTAMP, NULL, FALSE, 0),
    ('rtvbop', 'https://www.sivalabs.in/spring-ai-rag-using-embedding-models-vector-databases', 1, TIMESTAMP '2024-07-26', NULL, FALSE, 0),
    ('2wedfg', 'https://www.sivalabs.in/getting-started-with-spring-ai-and-open-ai', 1, CURRENT_TIMESTAMP, NULL, TRUE, 0),
    ('6yfrd4', 'https://www.sivalabs.in/langchain4j-retrieval-augmented-generation-tutorial', 1, TIMESTAMP '2024-07-28', NULL, FALSE, 0),
    ('r5t4tt', 'https://www.sivalabs.in/langchain4j-ai-services-tutorial', 1, CURRENT_TIMESTAMP, NULL, FALSE, 0),
    ('ffr4rt', 'https://www.sivalabs.in/generative-ai-conversations-using-langchain4j-chat-memory', 1, TIMESTAMP '2024-08-10', NULL, FALSE, 0),
    ('9ou17u', 'https://www.sivalabs.in/getting-started-with-generative-ai-using-java-langchain4j', 1, TIMESTAMP '2024-08-11', NULL, FALSE, 0),
    ('cybg5t', 'https://www.sivalabs.in/go-for-java-springboot-developers', 1, CURRENT_TIMESTAMP, NULL, FALSE, 0),
    ('nbm6yf', 'https://www.sivalabs.in/spring-boot-jooq-tutorial-fetching-many-to-many-associations', 1, TIMESTAMP '2024-08-13', NULL, FALSE, 0),
    ('tt5y6r', 'https://www.sivalabs.in/spring-boot-jooq-tutorial-fetching-one-to-many-associations', 1, TIMESTAMP '2024-08-14', NULL, FALSE, 0),
    ('f9ghty', 'https://www.sivalabs.in/spring-boot-jooq-tutorial-fetching-one-to-one-associations', 1, TIMESTAMP '2024-08-15', NULL, FALSE, 0),
    ('r45tne', 'https://www.sivalabs.in/spring-boot-jooq-tutorial-crud', 1, CURRENT_TIMESTAMP, NULL, FALSE, 0),
    ('54rt54', 'https://www.sivalabs.in/spring-boot-jooq-tutorial-getting-started', 1, CURRENT_TIMESTAMP, NULL, FALSE, 0);