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


## 许可证

见 [LICENSE](LICENSE)。
