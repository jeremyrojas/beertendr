package com.hopspot.beertendr.openaichatapi.model;

/**
 * Choice is a property of Open AI's Chat Completion response object
 * Choice contains {@link Message}, which contains the actual text reply
 */
public class Choice {

    private int index;
    private Message message;

    public Choice() {}

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

}
