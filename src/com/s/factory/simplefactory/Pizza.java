package com.s.factory.simplefactory;

public abstract class Pizza {
    private String name;
    //准备原材料，不同材料可以制作不同披萨，所以定义成抽象方法
    public abstract void prepare();
    public Pizza() {
    }
    //烘焙披萨
    public void bake(){
        System.out.println(name+"烘焙");
    }
    //装箱
    public void box(){
        System.out.println(name+"烘焙");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
