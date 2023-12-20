package com.behavioral.observerTest2;


public class Main {
    public static void main(String[] args) {
        Account account = new Account("192.168.31.1");

        Observer sms = new SMSSender(account);
        Observer email = new EmailSender(account);

        account.attach(sms);
        account.attach(email);

        account.notifyOb();
    }
}

