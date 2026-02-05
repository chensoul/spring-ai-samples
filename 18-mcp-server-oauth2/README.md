# 18-mcp-server-oauth2：MCP 服务端（OAuth 2.1）

使用 **Spring AI 1.1.x** 的 Streamable HTTP MCP 服务端（WebMVC），配合 [mcp-server-security](https://github.com/spring-ai-community/mcp-security) 的 **OAuth 2.0/2.1** 配置，以 **JWT 资源服务器** 方式保护 MCP 端点。所有请求需携带由 **17-mcp-authorization-server** 签发的有效 JWT（Bearer Token）。

**参考**：[Spring AI MCP Security](https://docs.spring.io/spring-ai/reference/api/mcp/mcp-security.html)（OAuth 2.0 Configuration）、[mcp-security/samples](https://github.com/spring-ai-community/mcp-security/tree/main/samples)。

## 运行

1. 先启动 **17-mcp-authorization-server**（端口 9000）。
2. 再启动本模块：

```bash
cd 18-mcp-server-oauth2 && ../mvnw spring-boot:run
```

服务监听 **8090**，MCP 端点为 **/mcp**。客户端 **19-mcp-client-oauth2** 通过 Client Credentials 向 17 获取 JWT 后访问本服务。

## 认证方式

- **OAuth 2.0 JWT**：请求头 `Authorization: Bearer <access_token>`，access_token 由 17 签发，本服务通过 `spring.security.oauth2.resourceserver.jwt.issuer-uri=http://localhost:9000` 校验。

## 工具

- **greet**：按语言返回问候语（参数：language，如 english、french、chinese）。

## 文档

详见 [1.md](1.md)。
