# 20-moderation：内容审核（Moderation）

使用 Spring AI 的 **ModerationModel** 对文本进行内容安全检测（仇恨、骚扰、暴力、自伤、色情等）。支持 **OpenAI** 与 **Mistral AI** 两种后端，通过配置或 Profile 切换。

## 运行

**默认（OpenAI）**：需配置 `OPENAI_API_KEY`。

```bash
export OPENAI_API_KEY=your-openai-api-key
cd 20-moderation && ../mvnw spring-boot:run
```

**使用 Mistral**：需先带 profile 打包以加入 Mistral 依赖，再激活 Spring profile `mistral` 并配置 `MISTRAL_AI_API_KEY`。

```bash
export MISTRAL_AI_API_KEY=your-mistral-api-key
cd 20-moderation && ../mvnw spring-boot:run -Pmistral -Dspring.profiles.active=mistral
```

## 接口

- **POST /api/moderate**  
  请求体：`{"text": "待审核文本"}`  
  返回：`id`、`model`、`flagged`、`results`（每段结果的 `categories` 与 `categoryScores`）。

## 文档

详见 [1.md](1.md)。
