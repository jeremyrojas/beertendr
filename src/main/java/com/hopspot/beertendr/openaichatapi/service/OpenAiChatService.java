package com.hopspot.beertendr.openaichatapi.service;

import com.hopspot.beertendr.openaichatapi.dto.OpenAiChatRequest;
import com.hopspot.beertendr.openaichatapi.dto.OpenAiChatResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OpenAiChatService {

    Logger logger = LoggerFactory.getLogger(OpenAiChatService.class);
    @Qualifier("openaiRestTemplate")
    @Autowired
    private RestTemplate openaiRestTemplate;

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String apiUrl;

    public void sendMessageToOpenAIChat(String prompt) {

        OpenAiChatRequest openAiChatRequest = new OpenAiChatRequest(model, prompt);

        OpenAiChatResponse openAiChatResponse = openaiRestTemplate.postForObject(apiUrl, openAiChatRequest, OpenAiChatResponse.class);

        saveOpenAIChatResponse(openAiChatResponse);

    }

    private void saveOpenAIChatResponse(OpenAiChatResponse openAiChatResponse) {
        if (isValidOpenAIChatResponse(openAiChatResponse)) {
            logger.info("Valid OpenAIChatResponse received: " + openAiChatResponse.getChoices().get(0).getMessage().getContent());
            // save to response data to database
            // put on rabbit MQ for consumption by beer rating microservice
        }
    }

    private boolean isValidOpenAIChatResponse(OpenAiChatResponse openAiChatResponse) {
        boolean invalidResponse = (openAiChatResponse == null || openAiChatResponse.getChoices() == null || openAiChatResponse.getChoices().isEmpty());
        return !invalidResponse;
    }

}
