package com.ilkayaktas.springexperiment.model;

/**
 * Created by iaktas on 18.01.2019 at 11:56.
 */

public class ItemImpl implements Item {
    private String name;

    public ItemImpl(String name) {
        this.name = name;
    }

    @Override
    public String out() {
        return getName();
    }

    public String getName() {
        return name;
    }
}
