package com.structural.bridgeTest;

public class Main {
    public static void main(String[] args) {
        Image png = new PNGImage();
        ImageImp imp = new LinuxImp();
        png.setImageImp(imp);

        png.parseFile("Ye");
    }
}
