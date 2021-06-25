package com.s.adapter.classadapter;
/*类适配器转换电压*/
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        //src插座电压
        int srcV  = output220V();
        //让电压适合手机使用
        int dstV = srcV/44;
        return dstV;
    }
}
