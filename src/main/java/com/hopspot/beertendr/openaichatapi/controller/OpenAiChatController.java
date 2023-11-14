package com.hopspot.beertendr.openaichatapi.controller;

import com.hopspot.beertendr.openaichatapi.service.OpenAiChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenAiChatController {

    @Autowired
    public OpenAiChatService openAiChatService;

    @GetMapping("/chat")
    public void chat(@RequestParam String prompt) {
        //TODO: create String template for prompt and concatenate with beer input from frontend
        openAiChatService.sendMessageToOpenAIChat(prompt);
    }

}
