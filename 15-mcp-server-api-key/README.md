# 15-mcp-server-api-key：MCP 服务端（API Key 认证）

使用 **Spring AI 1.1.x** 的 Streamable HTTP MCP 服务端（WebMVC），配合社区项目 [spring-ai-community/mcp-security](https://github.com/spring-ai-community/mcp-security) 的 **mcp-server-security**，以 **API Key** 方式保护 MCP 端点。所有请求需在请求头 `X-API-key` 中携带 `id.secret`（示例：`api01.mycustomapikey`）方可访问。

**参考**：[Spring AI MCP Security](https://docs.spring.io/spring-ai/reference/api/mcp/mcp-security.html)（MCP Server Security / API Key Authentication）、[mcp-security/samples](https://github.com/spring-ai-community/mcp-security/tree/main/samples)（如 [sample-mcp-server-api-key](https://github.com/spring-ai-community/mcp-security/tree/main/samples/sample-mcp-server-api-key)）。

## 运行

```bash
cd 15-mcp-server-api-key && ../mvnw spring-boot:run
```

服务监听 **8080**，MCP 端点为 **/mcp**。客户端需先启动本服务，再运行 16-mcp-client-api-key 并配置相同 API Key。支持 [MCP Inspector](https://modelcontextprotocol.io/docs/tools/inspector) 等浏览器端连接（已配置 CORS）。

## 认证方式

- **API Key**：请求头 `X-API-key: api01.mycustomapikey`（与 `McpServerSecurityConfig` 中配置的 id.secret 一致）。
- 生产环境应实现自己的 `ApiKeyEntityRepository`（如数据库）。官方文档指出：`InMemoryApiKeyEntityRepository` 使用 bcrypt 存储 API Key，计算开销大，不适合高并发生产环境。

## 工具

- **greet**：按语言返回问候语（参数：language，如 english、french、chinese）。

## 文档

详见 [1.md](1.md)。
