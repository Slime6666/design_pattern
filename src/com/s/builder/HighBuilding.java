package com.s.builder;
/*大厦房子继承建造者，重写方法*/
public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("大厦地基打了20米");
    }

    @Override
    public void buildWall() {
        System.out.println(" 大厦砌墙20cm");
    }

    @Override
    public void buildroof() {
        System.out.println(" 大厦屋顶");
    }
}
