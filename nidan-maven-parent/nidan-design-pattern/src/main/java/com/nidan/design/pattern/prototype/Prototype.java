package com.nidan.design.pattern.prototype;

/**
 * 原型模式
 * Created by Nidan on 2018年04月02 上午 10:21
 */
public class Prototype implements Cloneable {

    private Long id;

    private String name;

    private int age;

    public Prototype() {}

    public Prototype(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Prototype prototype1=new Prototype(1L,"小明",156);
        Prototype prototype2=prototype1;

        Prototype prototype3=(Prototype)prototype1.clone();

        System.out.println(prototype1==prototype2);
        System.out.println(prototype1.equals(prototype2));

        System.out.println(prototype1==prototype3);
        System.out.println(prototype1.equals(prototype3));

        System.out.println(prototype1.hashCode());

        System.out.println(prototype2.hashCode());

        System.out.println(prototype3.hashCode());

    }

}
