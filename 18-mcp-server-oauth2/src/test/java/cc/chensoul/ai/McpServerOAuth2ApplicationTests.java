package cc.chensoul.ai;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootTest(properties = {
        "spring.security.oauth2.resourceserver.jwt.issuer-uri=http://localhost:9000"
}, classes = { McpServerOAuth2Application.class, McpServerOAuth2ApplicationTests.TestSecurityConfig.class })
class McpServerOAuth2ApplicationTests {

    @Test
    void contextLoads() {
    }

    /** 测试用：不解析 issuer，避免连接 localhost:9000 */
    @Configuration
    static class TestSecurityConfig {
        @Bean
        SecurityFilterChain testSecurityFilterChain(HttpSecurity http) throws Exception {
            return http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll()).build();
        }
    }
}
