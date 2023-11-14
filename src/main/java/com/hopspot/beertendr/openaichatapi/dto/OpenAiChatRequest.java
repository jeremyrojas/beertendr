package com.hopspot.beertendr.openaichatapi.dto;

import com.hopspot.beertendr.openaichatapi.model.Message;

import java.util.ArrayList;
import java.util.List;

public class OpenAiChatRequest {

    private String model;
    private List<Message> messages;

    public OpenAiChatRequest(String model, String prompt) {
        this.model = model;
        this.messages = new ArrayList<>();
        this.messages.add(new Message("user", prompt));
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

}
