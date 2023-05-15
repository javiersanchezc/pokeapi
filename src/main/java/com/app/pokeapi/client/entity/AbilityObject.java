package com.app.pokeapi.client.entity;

public class AbilityObject {
    private String name;
    private String url;

    public AbilityObject() {
    }

    public AbilityObject(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "AbilityObject{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
