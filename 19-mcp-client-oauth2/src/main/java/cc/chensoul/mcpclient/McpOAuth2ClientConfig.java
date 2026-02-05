package cc.chensoul.mcpclient;

import io.modelcontextprotocol.client.transport.customizer.McpSyncHttpClientRequestCustomizer;
import org.springaicommunity.mcp.security.client.sync.AuthenticationMcpTransportContextProvider;
import org.springaicommunity.mcp.security.client.sync.oauth2.http.client.OAuth2ClientCredentialsSyncHttpRequestCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.AuthorizedClientServiceOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientProvider;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientProviderBuilder;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.ai.mcp.customizer.McpSyncClientCustomizer;

/**
 * MCP 客户端 OAuth 2.0/2.1 配置：使用 Client Credentials 向授权服务器获取 JWT，并在请求 19-mcp-server-oauth2 时携带。
 * 参考：<a href="https://docs.spring.io/spring-ai/reference/api/mcp/mcp-security.html">Spring AI MCP Security</a> - MCP Client Security, HttpClient-Based Clients
 */
@Configuration
public class McpOAuth2ClientConfig {

    private static final String REGISTRATION_ID = "mcp-client";

    @Bean
    McpSyncHttpClientRequestCustomizer oauth2RequestCustomizer(
            AuthorizedClientServiceOAuth2AuthorizedClientManager authorizedClientManager) {
        return new OAuth2ClientCredentialsSyncHttpRequestCustomizer(authorizedClientManager, REGISTRATION_ID);
    }

    @Bean
    McpSyncClientCustomizer syncClientCustomizer() {
        return (name, syncSpec) -> syncSpec.transportContextProvider(new AuthenticationMcpTransportContextProvider());
    }

    @Bean
    AuthorizedClientServiceOAuth2AuthorizedClientManager authorizedClientManager(
            ClientRegistrationRepository clientRegistrationRepository,
            OAuth2AuthorizedClientService authorizedClientService) {
        OAuth2AuthorizedClientProvider provider = OAuth2AuthorizedClientProviderBuilder.builder()
                .clientCredentials()
                .build();
        AuthorizedClientServiceOAuth2AuthorizedClientManager manager =
                new AuthorizedClientServiceOAuth2AuthorizedClientManager(clientRegistrationRepository, authorizedClientService);
        manager.setAuthorizedClientProvider(provider);
        return manager;
    }
}
