package com.example.model;

public class Payload {
	
	private String name;

    private String id;

    private Boolean validated;
    
    public Payload(String name, String id, Boolean validated) {
        this.name = name;
        this.id = id;
        this.validated = validated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getValidated() {
        return validated;
    }

    public void setValidated(Boolean validated) {
        this.validated = validated;
    }

}
