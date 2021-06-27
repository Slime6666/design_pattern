package com.s.bridge;

import java.util.logging.XMLFormatter;

public class Client {
    public static void main(String[] args) {
        FoldedPhone xiaomi = new FoldedPhone(new XiaoMi());
        xiaomi.open();
        xiaomi.playgame();
        xiaomi.watchTV();
        System.out.println("-------------");
        UpRightPhone vivo = new UpRightPhone(new VIVO());
        vivo.open();
        vivo.playgame();
        vivo.watchTV();
    }
}
