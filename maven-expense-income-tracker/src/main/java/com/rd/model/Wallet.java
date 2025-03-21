package com.rd.model;

public class Wallet {
    private final int id;
    private final String name;
    private double balance;

    public Wallet(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int id() { return id; }
    public String name() { return name; }
    public double balance() { return balance; }
    public void updateBalance(double amount) { this.balance += amount; }
}
