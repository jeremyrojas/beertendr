package com.hopspot.beertendr.openaichatapi.model;

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
