package com.example.RestAlgorithms.model;

import java.util.List;

public class SortResult {

    private final long id;
    private List<String> result;
    private long runtime;

    public SortResult(long id, List<String> result, long runtime) {
        this.id = id;
        this.result = result;
        this.runtime = runtime;
    }

    public long getId() {
        return id;
    }

    public List<String> getResult() {
        return result;
    }

    public void setResult(List<String> result) {
        this.result = result;
    }

    public long getRuntime() {
        return runtime;
    }

    public void setRuntime(long runtime) {
        this.runtime = runtime;
    }
}
