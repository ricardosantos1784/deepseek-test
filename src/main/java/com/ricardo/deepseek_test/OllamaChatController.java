package com.ricardo.deepseek_test;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/deepseek")
public class OllamaChatController {

    private final ChatClient chatClient;

    @Value("classpath:/prompts/templatefaq.prt")
    private Resource template;
    @Value("classpath:/prompts/piedpiperfaq.prt")
    private Resource faq;

    public OllamaChatController(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @GetMapping("/faq")
    public Flux<String> faq(@RequestParam(value = "message", defaultValue = "what is Pied Piper?") String message) {

        PromptTemplate promptTemplate = new PromptTemplate(template);
        Map<String, Object> map = new HashMap<>();
        map.put("input", message);
        map.put("documents", faq);

        Prompt prompt = promptTemplate.create(map);
        return chatClient.prompt(prompt).stream().content();
    }

    @GetMapping("/simpleMessage")
    public String simpleMessage(@RequestParam(value = "message", defaultValue = "How many R letters are in the word strawberry?") String message) {

        ChatResponse chatResponse = chatClient.prompt(message).call().chatResponse();
        return chatResponse.getResult().getOutput().getContent();
    }

}