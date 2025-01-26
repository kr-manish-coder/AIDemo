package com.manish.aidemo.controllers;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/ai")
public class AIController {

    private final OllamaChatModel client;

    public AIController(OllamaChatModel client) {
        this.client = client;
    }

    @GetMapping("/prompt")
    public Flux<String> chatbot(@RequestParam("prompt") String prompt){
        return client.stream(prompt);
    }
}
