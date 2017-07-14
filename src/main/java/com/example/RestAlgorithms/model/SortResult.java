package com.example.RestAlgorithms.model;

import java.util.List;

/**
 * Created by chris on 7/14/17.
 */
public class SortResult {

    private final long id;
    private List<?> result;
    private long runtime;

    public SortResult(long id, List<?> result, long runtime) {
        this.id = id;
        this.result = result;
        this.runtime = runtime;
    }

    public long getId() {
        return id;
    }

    public List<?> getResult() {
        return result;
    }

    public void setResult(List<?> result) {
        this.result = result;
    }

    public long getRuntime() {
        return runtime;
    }

    public void setRuntime(long runtime) {
        this.runtime = runtime;
    }
}
