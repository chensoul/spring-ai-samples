# 21-model-evaluation：模型评估（Model Evaluation）

使用 Spring AI 的 **Evaluator** 接口对 LLM 回复做**相关性**与**事实核查**评估，常用于 RAG 流程与集成测试，减少幻觉、保证回复与上下文一致。

## 运行

需配置 **DEEPSEEK_API_KEY** 或 **OPENAI_API_KEY**（评估器内部用 ChatModel 做“用模型评模型”）：

```bash
export DEEPSEEK_API_KEY=your-api-key
cd 21-model-evaluation && ../mvnw spring-boot:run
```

## 接口

- **POST /api/evaluate/relevancy**  
  请求体：`{"userText":"用户问题","context":"检索到的上下文","responseContent":"模型回复"}`  
  返回：`pass`（是否通过）、`feedback`、`metadata`。用于判断回复是否与问题和上下文一致。

- **POST /api/evaluate/fact-check**  
  请求体同上。返回：`pass`、`feedback`、`metadata`。用于判断回复中的陈述是否被上下文支持（事实核查）。

## 文档

详见 [1.md](1.md)。
