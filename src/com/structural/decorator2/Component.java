package com.structural.decorator2;

public abstract class Component {
    public abstract void show();
}

class Tree extends Component {

    @Override
    public void show() {
        System.out.println("圣诞树！");
    }
}

class Decorator extends Component {
    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void show() {
        component.show();
    }
}

class Bulb extends Decorator {
    public Bulb(Component component) {
        super(component);
    }

    @Override
    public void show() {
        System.out.println("灯泡！");
        super.show();
    }
}