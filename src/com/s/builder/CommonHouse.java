package com.s.builder;
/*普通房子继承建造者，重写方法*/
public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通房地基打了5米");
    }

    @Override
    public void buildWall() {
        System.out.println(" 普通房子砌墙10cm");
    }

    @Override
    public void buildroof() {
        System.out.println(" 普通房子屋顶");
    }
}
