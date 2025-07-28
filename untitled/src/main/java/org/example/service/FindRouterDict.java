package org.example.service;

import java.io.File;

public class FindRouterDict {
    private String rout;

    public FindRouterDict(String rout) {
        this.rout = rout;
    }

    public boolean find() {
        File dir = new File(rout);
        return dir.exists() && dir.isDirectory();
    }
}
