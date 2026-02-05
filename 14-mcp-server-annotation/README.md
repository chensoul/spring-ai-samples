# 14-mcp-server-annotation：MCP Annotations 服务端

使用 Spring AI **MCP Annotations** 以声明式方式实现 MCP 服务端：通过 **@McpTool**、**@McpToolParam** 定义工具方法，由注解扫描自动注册并生成 JSON Schema，无需手动注册 `ToolCallback`。本模块使用 **Spring AI 1.1.2**（MCP Annotations 在 1.1.x 引入），STDIO 传输。

## 运行

无 HTTP 端口，通过标准输入/输出与 MCP 客户端通信（与 10-mcp-server-stdio 类似）：

```bash
cd 14-mcp-server-annotation && ../mvnw spring-boot:run
```

需在 `mcp-servers.json` 中配置本服务命令后，由 11-mcp-client-stdio 等客户端连接。

## 工具

- **add**：两数相加  
- **subtract**：两数相减  
- **multiply**：两数相乘  
- **divide**：两数相除（除数为 0 抛异常）

## 文档

详见 [1.md](1.md)。
