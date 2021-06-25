package com.s.builder;

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        //创建盖房指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //指挥者提交成品房
        House house = houseDirector.constructHouse();
        //盖高楼
        HighBuilding highBuilding = new HighBuilding();
        //重置建造者
        houseDirector.setHouseBuilder(highBuilding);
        //完成盖房子，返回产品(高楼)
        houseDirector.constructHouse();
    }
}
