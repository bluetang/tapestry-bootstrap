package com.trsvax.bootstrap.environment;

public enum ButtonType {
    primary("btn-primary"), info("btn-primary"), success("btn-success"), danger("btn-danger");

    private String cssClass;

    ButtonType(String cssClass) {
        this.cssClass = cssClass;
    }

    public String toString() {
        return this.cssClass;
    }
}
