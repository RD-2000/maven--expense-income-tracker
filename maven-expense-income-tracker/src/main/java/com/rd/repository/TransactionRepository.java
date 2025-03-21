package com.rd.repository;


import com.rd.model.Transaction;
import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {
    private final List<Transaction> transactions = new ArrayList<>();

    public void save(Transaction transaction) { transactions.add(transaction); }
    public List<Transaction> findAll() { return transactions; }
}

