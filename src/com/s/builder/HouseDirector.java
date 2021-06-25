package com.s.builder;
//盖房的具体实现交给指挥者处理
public class HouseDirector {
    HouseBuilder houseBuilder;
    //构造器传入 houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过seter传入 houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    //盖房流程实现
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.buildroof();
        return houseBuilder.buildHouse();
    }
}
