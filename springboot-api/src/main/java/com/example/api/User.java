package com.example.api;

import java.math.BigDecimal;

public class User {
    private String username;
    private BigDecimal balance;
    
    public User(String username) {
        this.username = username;
        this.balance = BigDecimal.ZERO;
    }

    public User(String username, BigDecimal balance) {
        this.username = username;
        this.balance = balance;
    }
    
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public BigDecimal getBalance() { return balance; }
    public void setBalance(BigDecimal balance) { this.balance = balance; }
}
