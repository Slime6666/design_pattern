package com.s.adapter.objectadapter;

/*对象适配器转换电压*/
public class VoltageAdapter implements IVoltage5V {
    //将原来的继承改为组合方式
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        //src插座电压
        int srcV  = voltage220V.output220V();
        //让电压适合手机使用
        int dstV = srcV/44;
        return dstV;
    }
}
