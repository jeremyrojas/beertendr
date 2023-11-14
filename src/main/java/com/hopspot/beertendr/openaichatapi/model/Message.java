package com.hopspot.beertendr.openaichatapi.model;

/**
 * Message is a property of {@link Choice}, from Open AI's Chat Completion response object
 * Message contains the actual chat text reply
 */
public class Message {

    private String role;

    private String content;

    public Message() {}

    public Message(String user, String prompt) {
        this.role = user;
        this.content = prompt;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
