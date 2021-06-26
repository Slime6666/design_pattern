package com.s.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        //有选择的重写方法m1
        AbsAdapter adapter = new AbsAdapter(){
            @Override
            public void m1() {
                System.out.println("只执行m1方法");
            }
        };
        adapter.m1();
    }
}
