package com.rd.model;

public record Transaction(int walletId, String type, double amount) { }