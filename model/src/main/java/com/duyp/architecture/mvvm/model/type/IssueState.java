package com.duyp.architecture.mvvm.model.type;

public enum IssueState {
    open("Opened"),
    closed("Closed"),
    all("All");

    String status;

    IssueState(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}