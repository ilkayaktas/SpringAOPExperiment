package com.ilkayaktas.springexperiment.model;

/**
 * Created by iaktas on 18.01.2019 at 15:17.
 */

public class ModelImpl implements Model {
    private String str;

    public ModelImpl(String str) {
        this.str = str;
    }

    @Override
    public String out() {
        return getName();
    }

    public String getName() {
        return str;
    }
}
