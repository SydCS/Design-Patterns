package com.structural.decorator;


//抽象界面构件类：抽象构件类，为了突出与模式相关的核心代码，对原有控件代码进行了大量的简化
abstract class Component {
    public abstract void display();
}


//窗体类：具体构件类
class Window extends Component {
    public void display() {
        System.out.println("显示窗体！");
    }
}


//文本框类：具体构件类
class TextBox extends Component {
    public void display() {
        System.out.println("显示文本框！");
    }
}


//列表框类：具体构件类
class ListBox extends Component {
    public void display() {
        System.out.println("显示列表框！");
    }
}
