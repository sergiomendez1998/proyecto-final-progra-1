package com.mycompany.emsa.project.util;

public enum EventStatus {
    DEFEATED("Defeated"),
    ACTIVE("Active"),
    PUBLISHED("Published"),
    UNPUBLISHED("Unpublished");
    private String name;

    EventStatus(String displayName) {
        this.name = displayName;
    }

    public String getName() {
        return name;
    }
}
