# 📌 Deepseek FAQ Chatbot Experiment

This repository contains the experiment described in the article **"Is Deepseek a Good Option for Startups?"**. The goal is to evaluate whether a locally hosted Deepseek model can effectively power a simple FAQ chatbot for a fictional startup, **Pied Piper** from *Silicon Valley*.

## 🚀 Project Overview
- **Purpose**: Test Deepseek's smallest model for a lightweight, local FAQ chatbot.
- **Stack**:
  - 🧠 **Deepseek** (smallest model)
  - ⚡ **Ollama** (local AI runtime)
  - 🏗 **Spring AI** (orchestration)
- **Dataset**: A structured FAQ document for chatbot responses.

## 🛠 Setup & Installation
###Prerequisites
Ensure you have the following installed:
- [Ollama](https://ollama.ai/) for running the Deepseek model
- Java 23 for Spring Boot
- Maven

## 🎯 Testing the Chatbot
Once the application is running, you can test it via a local API or a simple UI interface. Try asking questions from the predefined FAQ dataset and see how Deepseek performs.
- example >>> http://localhost:8080/deepseek/faq?message=How can I work at Pied Piper?

## 📊 Results & Insights
- ✅ Successfully answered FAQ-style questions using structured data.
- ❓ Open questions about handling multi-step conversations and executive-level queries.
- ⚖️ Trade-offs between **cost (API usage) vs. privacy (self-hosting)**.

## 📌 Next Steps
- Improve multi-turn conversation capabilities.
- Expand dataset for complex queries.
- Compare performance with cloud-hosted models.

## 📜 License
This project is licensed under the MIT License.

---

📝 **Read the full article here:** [LinkedIn Post Link]

💬 **Join the discussion!** Feel free to open issues or contribute to improve this experiment.

