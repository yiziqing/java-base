package com.nidan.design.pattern.model;

/**
 * Created by nzqbe on 2018/3/20.
 */
public class Phone implements ED{

    private String name="iPhone8 Plus";
    private String color="玫瑰金";
    private String size="5.6英寸";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "PhoneFactory{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
