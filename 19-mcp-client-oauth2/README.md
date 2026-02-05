# 19-mcp-client-oauth2：MCP 客户端（OAuth 2.1）

使用 **Spring AI 1.1.x** 的 MCP 客户端（Streamable HTTP），通过 **OAuth 2.0/2.1 Client Credentials** 向 **17-mcp-authorization-server** 获取 JWT，并携带 JWT 访问 **18-mcp-server-oauth2**。Web 问答页使用 DeepSeek（需设置 `DEEPSEEK_API_KEY`）。

**参考**：[Spring AI MCP Security](https://docs.spring.io/spring-ai/reference/api/mcp/mcp-security.html)（MCP Client Security）、[mcp-security/samples](https://github.com/spring-ai-community/mcp-security/tree/main/samples)。

## 运行

1. 先启动 **17-mcp-authorization-server**（端口 9000）。
2. 再启动 **18-mcp-server-oauth2**（端口 8090）。
3. 设置 `DEEPSEEK_API_KEY` 后启动本模块：

```bash
export DEEPSEEK_API_KEY=your-api-key
cd 19-mcp-client-oauth2 && ../mvnw spring-boot:run
```

服务监听 **8081**。打开 http://localhost:8081 可使用 Web 问答页调用 MCP 工具（greet 等）。

## 认证方式

- **OAuth 2.0 Client Credentials**：使用 `mcp-client` / `mcp-client-secret` 向 18 获取 access_token，通过 `OAuth2ClientCredentialsSyncHttpRequestCustomizer` 在请求 19 时附加 `Authorization: Bearer <token>`。

## 文档

详见 [1.md](1.md)。
