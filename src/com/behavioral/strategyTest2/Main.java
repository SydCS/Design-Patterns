package com.behavioral.strategyTest2;

public class Main {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.setPrice(50);
        ticket.setDiscount(new StudentDiscount());

        System.out.println(ticket.getPrice());
    }
}
