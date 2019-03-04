package com.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/3/4.
 */
public class Product implements Serializable{
    private String name;
    private Double privice;

    public Product() {
    }

    public Product(String name, Double privice) {
        this.name = name;
        this.privice = privice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrivice() {
        return privice;
    }

    public void setPrivice(Double privice) {
        this.privice = privice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", privice=" + privice +
                '}';
    }
}
