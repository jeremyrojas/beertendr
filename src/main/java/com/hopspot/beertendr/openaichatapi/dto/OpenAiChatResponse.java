package com.hopspot.beertendr.openaichatapi.dto;

import com.hopspot.beertendr.openaichatapi.model.Choice;

import java.util.List;

public class OpenAiChatResponse {

    private List<Choice> choices;

    public OpenAiChatResponse() {};

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

}
