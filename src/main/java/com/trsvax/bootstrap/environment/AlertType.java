package com.trsvax.bootstrap.environment;

public enum AlertType {

    info("alert-info"), success("alert-success"), warning("alert-warning"), error("alert-error");

    private String cssClass;

    AlertType(String cssClass) {
        this.cssClass = cssClass;
    }

    public String toString() {
        return this.cssClass;
    }
}
