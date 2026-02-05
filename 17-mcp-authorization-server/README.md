# 17-mcp-authorization-server：OAuth 2.1 授权服务器

基于 **Spring Authorization Server** 的 OAuth 2.0/2.1 授权服务器，作为 JWT issuer 供 **18-mcp-server-oauth2**（资源服务器）校验令牌、供 **19-mcp-client-oauth2**（客户端）通过 Client Credentials 获取 JWT。本模块不依赖 Spring AI，仅提供标准 OAuth2 协议端点。

**参考**：[Spring Authorization Server](https://docs.spring.io/spring-authorization-server/reference/)、[Spring AI MCP Security](https://docs.spring.io/spring-ai/reference/api/mcp/mcp-security.html)（OAuth 2.0 Configuration）、[mcp-security/samples](https://github.com/spring-ai-community/mcp-security/tree/main/samples)。

## 运行

```bash
cd 17-mcp-authorization-server && ../mvnw spring-boot:run
```

服务监听 **9000**。需先启动本服务，再启动 18-mcp-server-oauth2 与 19-mcp-client-oauth2。

## 注册客户端

- **client-id**：`mcp-client`
- **client-secret**：`mcp-client-secret`
- **授权类型**：`client_credentials`、`authorization_code`（可选，需配置 redirect-uri）
- **scope**：`openid`

19-mcp-client-oauth2 使用上述 client 通过 Client Credentials 向本服务获取 JWT，并携带 JWT 访问 18-mcp-server-oauth2。

## 文档

详见 [1.md](1.md)。
