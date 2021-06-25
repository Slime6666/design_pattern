package com.s.builder;
//抽象建造者
public abstract class  HouseBuilder {
    House  house = new House();
    //建造者（盖房）的流程
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildroof();
    //盖房
    public House buildHouse(){
        return house;
    }
}
