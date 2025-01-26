package com.manish.aidemo.controllers;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/ai")
public class AIController {

    private final OllamaChatModel client;

    public AIController(OllamaChatModel client) {
        this.client = client;
    }

    @GetMapping("/prompt")
    public Flux<String> prompt(@RequestParam("prompt") String prompt){
        return client.stream(prompt);
    }

    @PostMapping("/chatbot")
    public Flux<String> chatbot(@RequestBody String prompt){
        return client.stream(prompt);
    }


}
