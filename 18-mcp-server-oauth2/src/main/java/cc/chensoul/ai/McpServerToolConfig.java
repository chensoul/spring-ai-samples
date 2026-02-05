package cc.chensoul.ai;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class McpServerToolConfig {

    @Bean
    ToolCallbackProvider greeterToolCallbackProvider(GreeterTools greeterTools) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(greeterTools)
                .build();
    }
}
