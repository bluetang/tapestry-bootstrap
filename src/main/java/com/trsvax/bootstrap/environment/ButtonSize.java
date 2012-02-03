package com.trsvax.bootstrap.environment;

public enum ButtonSize {
    large("btn-large"), small("btn-small");

    private String cssClass;

    ButtonSize(String cssClass) {
        this.cssClass = cssClass;
    }

    public String toString() {
        return this.cssClass;
    }
}
