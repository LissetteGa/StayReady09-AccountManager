package com.codedifferently.bankaccountlab;

public abstract class BankAccount {

    private Integer accountNumber; 
    private Double fees; 
    private String name;
    private Integer pin;
    private Double balance; 
    private Double withdraw;
    private Double deposit;
    
    public BankAccount(Integer accountNum, String name, Double fees, Integer pin, Double balance){
        this.accountNumber = accountNum; 
        this.name = name;
        this.fees = fees;
        this.pin = pin;
        this.balance = balance;
    }
    
    public BankAccount() {
        accountNumber = 0;
        name = "";
        fees = 0.0;
        pin = 0;
        balance = 0.0;

    }

    public Integer getAccountNumber(){
        return accountNumber;
    }

    public Double getFees(){
        return fees;
    }

    public void setFees(Double fee) {
        fees = fee;
    }

    public String getName(){
        return name;
    }

    public void setName(String userName){
        name = userName;
    }

    public Integer getPin(){
        return this.pin;
    }

    public void setPin(int userPin){
        pin = userPin;
    }

    public Double getBalance(){
        return this.balance; 
    }
    
    public void setBalance(Double userBalance){
       balance = userBalance; 
    }

    public void deposit(Double money){
        this.setBalance(this.getBalance() + money);
    }
    
    public void withdraw(Double money){
        this.setBalance(this.getBalance() - money);
    }
    
    public Double getdeposit(){
        return this.deposit;
    }
    
    public Double getWithdraw(){
        return this.withdraw;
    }

}

