package com.trsvax.bootstrap.environment;

public enum LabelType {
    success("label-success"), warning("label-warning"), important("label-important"), info("label-info");

    private String cssClass;

    LabelType(String cssClass) {
        this.cssClass = cssClass;
    }

    public String toString() {
        return this.cssClass;
    }
}
