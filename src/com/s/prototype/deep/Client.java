package com.s.prototype.deep;

public class Client {
    public static void main(String[] args) throws Exception {
        DeepProtoType p = new DeepProtoType();
        p.name = "小黑子";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");
        //方式 1  完成深拷贝哈希码不一致
        //DeepProtoType p2 = (DeepProtoType) p.clone();
        //方式 2  完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.deepClone();
        System.out.println("p.name=" + p.name + p.deepCloneableTarget + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name=" + p2.name + p2.deepCloneableTarget + p2.deepCloneableTarget.hashCode());

    }
}
