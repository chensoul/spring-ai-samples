#!/usr/bin/env bash

# 1. Chat
curl -s -X POST http://localhost:8080/api/chat -H "Content-Type: application/json" -d '{"prompt":"What is Spring Boot?"}'

# 2. Suggest Titles
curl -s -X POST http://localhost:8080/api/suggest-titles -H "Content-Type: application/json" -d '{"topic":"Spring Boot Tips and Tricks","count":5}'

# 3. Get Programming Languages
curl -s http://localhost:8080/api/langs

# 4. Generate Tweet
curl -s -X POST http://localhost:8080/api/gen-tweet -H "Content-Type: application/json" -d '{"prompt":"IntelliJ IDEA 2025.2 is released with Java 25 EA, Maven 4, Spring Debugger plugin."}'

# 5. Get Embedding
curl -s "http://localhost:8080/api/embedding"

# 6. Search Vector Store
curl -s "http://localhost:8080/api/search?query=how%20to%20contact%20admin"

# 7. Chat (contact)
curl -s -X POST http://localhost:8080/api/chat -H "Content-Type: application/json" -d '{"prompt":"How to contact admin?"}'
