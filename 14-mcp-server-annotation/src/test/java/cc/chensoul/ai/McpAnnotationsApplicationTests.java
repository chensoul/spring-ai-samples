package cc.chensoul.ai;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
        "spring.ai.mcp.server.protocol=STDIO",
        "spring.main.web-application-type=none"
})
class McpAnnotationsApplicationTests {

    @Test
    void contextLoads() {
    }
}
