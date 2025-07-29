package org.example.service;

import java.io.File;
import java.util.Optional;

public class FindRouterDict {
    private String rout;

    public FindRouterDict(String rout) {
        this.rout = rout;
    }

    public Optional<String> findAndReturn() {
        File dir = new File(rout);
        return (dir.exists() && dir.isDirectory()) ? Optional.of(rout) : Optional.empty();
    }
}
