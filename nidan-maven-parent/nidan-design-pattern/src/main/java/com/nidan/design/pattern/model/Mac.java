package com.nidan.design.pattern.model;

/**
 * Created by nzqbe on 2018/3/20.
 */
public class Mac implements ED{

    private String name="MacBook Pro";
    private String color="银灰色";
    private String size="15.4英寸";

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
        return "Mac{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
