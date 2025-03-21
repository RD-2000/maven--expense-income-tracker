package com.rd.repository;


import com.rd.model.Wallet;
import java.util.ArrayList;
import java.util.List;

public class WalletRepository {
    private final List<Wallet> wallets = new ArrayList<>();
    private int nextId = 1;

    public void save(Wallet wallet) { wallets.add(wallet); }
    public List<Wallet> findAll() { return wallets; }
    public Wallet findById(int id) { return wallets.stream().filter(w -> w.id() == id).findFirst().orElse(null); }
}
