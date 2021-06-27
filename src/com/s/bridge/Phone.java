package com.s.bridge;

public class Phone {
    private Brand brand;//组合品牌

    public Phone(Brand brand) {
        this.brand = brand;
    }
    protected void open(){
        //通过组合品牌调用它的开机方法
        this.brand.open();
    }
    protected void playgame(){
        this.brand.playgame();
    }
    protected void watchTV(){
        this.brand.watchTV();
    }
}
