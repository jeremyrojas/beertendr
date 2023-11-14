package com.hopspot.beertendr.openaichatapi.model;

/**
 * Beer is an entity to save OpenAI's beer recommendations
 * TODO: Build out persistence entities with Spring Data JPA
 */
public class Beer {

    String breweryName;
    String beerName;
    String description;

    public String getBreweryName() {
        return breweryName;
    }

    public void setBreweryName(String breweryName) {
        this.breweryName = breweryName;
    }

    public String getBeerName() {
        return beerName;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
