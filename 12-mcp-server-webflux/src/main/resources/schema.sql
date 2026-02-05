-- Video catalog table (H2; used when schema is initialized via schema.sql)
CREATE TABLE IF NOT EXISTS yt_videos
(
    id    BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    title VARCHAR(255) NOT NULL UNIQUE,
    url   VARCHAR(500) NOT NULL
);

INSERT INTO yt_videos (title, url)
VALUES
    ('Introduction to Spring Boot', 'https://example.com/spring-boot-intro'),
    ('Java 21 New Features', 'https://example.com/java-21-features'),
    ('Building REST APIs with Spring Web', 'https://example.com/spring-rest-api'),
    ('Spring Boot and Docker', 'https://example.com/spring-boot-docker'),
    ('Testing Spring Boot Applications', 'https://example.com/spring-boot-testing'),
    ('Spring Data JPA Tutorial', 'https://example.com/spring-data-jpa'),
    ('Microservices with Spring Cloud', 'https://example.com/spring-cloud-microservices');
