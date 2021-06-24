package com.s.prototype;

public class Monkey implements Cloneable{
    private String name;
    private Integer age;
    private String color;

    public Monkey() {
    }

    public Monkey(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    //克隆该实例,使用默认方法
    @Override
    protected Object clone()  {
        Monkey monkey = null;
        try {
            monkey = (Monkey)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return monkey;
    }
}
