package com.structural.adapterTest;

public class Main {
    public static void main(String[] args) {
        DataOperation op = new OperationAdapter();
        System.out.println(op.encrypt("ye"));
    }
}
