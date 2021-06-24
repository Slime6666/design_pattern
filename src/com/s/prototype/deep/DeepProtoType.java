package com.s.prototype.deep;

import java.io.Serializable;

public class DeepProtoType implements Serializable,Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;// 引用类型

    public DeepProtoType() {
        super();
    }
    //深拷贝方式1:使用 clone 方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //完成基本数据类型的克隆
        deep = super.clone();
        //单独处理引用数据类型
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }
}
