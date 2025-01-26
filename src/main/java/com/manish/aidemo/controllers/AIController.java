package com.manish.aidemo.controllers;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

/**
 * AIController is a REST controller for interacting with the OllamaChatModel.
 * It exposes REST endpoints for processing prompts and chatbot interactions.
 */
@RestController
@RequestMapping("/ai")
public class AIController {

    private final OllamaChatModel client;

    /**
     * Constructs a new AIController with the specified OllamaChatModel client.
     *
     * @param client the OllamaChatModel client used for processing requests
     */
    public AIController(OllamaChatModel client) {
        this.client = client;
    }

    /**
     * Handles a GET request to process a specified prompt.
     *
     * @param prompt the input prompt to be processed
     * @return a Flux stream of strings containing the response(s) to the prompt
     */
    @GetMapping("/prompt")
    public Flux<String> prompt(@RequestParam("prompt") String prompt){
        return client.stream(prompt);
    }


    /**
     * Handles a POST request to interact with the chatbot by processing the specified input.
     *
     * This method streams the chatbot's response(s) based on the input provided in the request body.
     *
     * @param prompt the input string sent in the request body for chatbot interaction
     * @return a {@code Flux<String>} representing a stream of strings containing the chatbot's response(s)
     */
    @PostMapping("/chatbot")
    public Flux<String> chatbot(@RequestBody String prompt) {
        return client.stream(prompt);
    }
}