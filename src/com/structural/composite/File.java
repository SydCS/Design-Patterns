package com.structural.composite;

import java.util.ArrayList;

//抽象文件类：抽象构件
abstract class File {
    public abstract void add(File file);

    public abstract void remove(File file);

    public abstract File getChild(int i);

    public abstract void killVirus();
}

//图像文件类：叶子构件
class ImageFile extends File {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    public void add(File file) {
        System.out.println("对不起，不支持该方法！");
    }

    public void remove(File file) {
        System.out.println("对不起，不支持该方法！");
    }

    public File getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    public void killVirus() {
        //模拟杀毒
        System.out.println("----对图像文件'" + name + "'进行杀毒");
    }
}

//文本文件类：叶子构件
class TextFile extends File {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public void add(File file) {
        System.out.println("对不起，不支持该方法！");
    }

    public void remove(File file) {
        System.out.println("对不起，不支持该方法！");
    }

    public File getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    public void killVirus() {
        //模拟杀毒
        System.out.println("----对文本文件'" + name + "'进行杀毒");
    }
}

//视频文件类：叶子构件
class VideoFile extends File {
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    public void add(File file) {
        System.out.println("对不起，不支持该方法！");
    }

    public void remove(File file) {
        System.out.println("对不起，不支持该方法！");
    }

    public File getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    public void killVirus() {
        //模拟杀毒
        System.out.println("----对视频文件'" + name + "'进行杀毒");
    }
}

//文件夹类：容器构件
class Folder extends File {
    //定义集合fileList，用于存储AbstractFile类型的成员
    private ArrayList<File> fileList = new ArrayList<File>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    public void add(File file) {
        fileList.add(file);
    }

    public void remove(File file) {
        fileList.remove(file);
    }

    public File getChild(int i) {
        return (File) fileList.get(i);
    }

    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");  //模拟杀毒

        //递归调用成员构件的killVirus()方法
        for (File f : fileList) {
            f.killVirus();
        }
    }
}