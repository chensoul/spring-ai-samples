# 16-mcp-client-api-key：MCP 客户端（API Key 认证）

连接使用 **API Key** 保护的 MCP 服务端（15-mcp-server-api-key）。使用 **Spring AI 1.1.2** 的 Streamable HTTP MCP 客户端，通过 **McpSyncHttpClientRequestCustomizer**（MCP Java SDK 接口）在每次请求上添加 `X-API-key` 请求头。

**参考**：[Spring AI MCP Security](https://docs.spring.io/spring-ai/reference/api/mcp/mcp-security.html)（MCP Client Security：HttpClient-Based Clients 中通过 `McpSyncHttpClientRequestCustomizer` Bean 定制请求；本示例用于 API Key 头而非 OAuth2）、[mcp-security/samples](https://github.com/spring-ai-community/mcp-security/tree/main/samples)（如 [sample-mcp-client](https://github.com/spring-ai-community/mcp-security/tree/main/samples/sample-mcp-client) 使用 OAuth2 定制器）。

## 前置条件

1. 先启动 **15-mcp-server-api-key**（默认端口 8080）。
2. 设置 `DEEPSEEK_API_KEY`（或配置其他 OpenAI 兼容模型）用于对话模型。

## 运行

```bash
export DEEPSEEK_API_KEY=your-key
cd 16-mcp-client-api-key && ../mvnw spring-boot:run
```

默认连接 `http://localhost:8080/mcp`，API Key 为 `api01.mycustomapikey`（与 15 中配置一致）。可通过 `spring.ai.mcp.client.streamable-http.connections.mcp-server-api-key.url` 与 `mcp.security.api-key` 覆盖。

## 接口

- **POST /ask**：请求体 `{"question": "..."}`，返回 AI 回答（可调用 MCP 工具 greet 等）。示例：

```bash
curl -s -X POST http://localhost:8080/ask -H "Content-Type: application/json" -d '{"question":"Use the greet tool with language chinese"}'
```

## 文档

详见 [1.md](1.md)。
