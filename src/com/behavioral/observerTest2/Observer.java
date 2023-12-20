package com.behavioral.observerTest2;

interface Observer {
    void update();
}

class SMSSender implements Observer {
    private Account account;

    public SMSSender(Account a) {
        this.account = a;
    }

    @Override
    public void update() {
        System.out.println("短信发送: " + account.getLastIP());
    }
}

class EmailSender implements Observer {
    private Account account;

    public EmailSender(Account a) {
        this.account = a;
    }

    @Override
    public void update() {
        System.out.println("邮件发送: " + account.getLastIP());
    }
}

