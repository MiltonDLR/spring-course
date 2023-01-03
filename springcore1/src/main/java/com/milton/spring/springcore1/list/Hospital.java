package com.milton.spring.springcore1.list;

import java.util.List;

public class Hospital {
    private String name;
    private List<String> departaments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDepartaments() {
        return departaments;
    }

    public void setDepartaments(List<String> departaments) {
        this.departaments = departaments;
    }
}
