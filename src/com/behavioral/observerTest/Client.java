package com.behavioral.observerTest;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject mySubject = new SubscriptionSubject();

        //创建微信用户
        User user1 = new User("孙悟空");
        User user2 = new User("猪悟能");
        User user3 = new User("沙悟净");

        //订阅公众号
        mySubject.attach(user1);
        mySubject.attach(user2);
        mySubject.attach(user3);

        //公众号更新发出消息给订阅的微信用户
        mySubject.notify("专栏更新了！");
    }
}

