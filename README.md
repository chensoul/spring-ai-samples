# Spring AI Samples

基于 [Spring AI](https://spring.io/projects/spring-ai) 的示例项目，涵盖对话、提示词模板、结构化输出、对话记忆、RAG、工具调用与 MCP 等能力。各模块可独立运行。

## 环境要求

- **Java 21**
- **Maven 3.9+**（或使用仓库根目录的 `./mvnw`）

## 快速开始

### 1. 克隆并编译

```bash
git clone https://github.com/chensoul/spring-ai-samples.git
cd spring-ai-samples
./mvnw -q install -DskipTests
```

### 2. 运行单个模块

进入对应目录并启动（多数模块需先设置 API Key）：

```bash
export DEEPSEEK_API_KEY=your-api-key
cd 01-chat-openai && ../mvnw spring-boot:run
```

## 文章说明

- [Spring AI 和 Open AI 入门指南](https://blog.chensoul.cc/posts/2025/09/18/spring-ai/)
- [Spring AI ChatClient API 介绍](https://blog.chensoul.cc/posts/2025/09/19/spring-ai-chat-client-api/)
- [OpenAI API 接口与 Spring AI 对应关系](https://blog.chensoul.cc/posts/2025/09/22/openai-api-with-spring-ai/)
- [Spring AI 提示词模版](https://blog.chensoul.cc/posts/2026/01/01/spring-ai-prompt-template/)
- [Spring AI 结构化输出](https://blog.chensoul.cc/posts/2026/01/02/spring-ai-structured-output/)
- [Spring AI 对话记忆](https://blog.chensoul.cc/posts/2026/01/03/spring-ai-chat-memory/)
- [Spring AI 对话记忆 + SSE 流式回复](https://blog.chensoul.cc/posts/2026/01/04/spring-ai-chat-memory-sse/)
- [Spring AI RAG 与向量存储](https://blog.chensoul.cc/posts/2026/02/01/spring-ai-rag-vector-store/)
- [Spring AI 工具调用](https://blog.chensoul.cc/posts/2026/02/02/spring-ai-tool-calling/)

## 许可证

见 [LICENSE](LICENSE)。
