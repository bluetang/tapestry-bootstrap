package com.trsvax.bootstrap.environment;

public enum BlockMessageType {

    info("alert-info"), success("alert-success"), warning("alert-warning"), error("alert-error");

    private String cssClass;

    BlockMessageType(String cssClass) {
        this.cssClass = cssClass;
    }

    public String toString() {
        return this.cssClass;
    }
}
