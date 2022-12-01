package com.project.mytaxapp.mytaxapp.models;

public enum Role {
    USER("User"),
    ACCOUNTANT("Accountant");

    private final String value;

    private Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
