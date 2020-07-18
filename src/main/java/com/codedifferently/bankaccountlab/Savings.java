package com.codedifferently.bankaccountlab;

public class Savings extends BankAccount{
    private Double rate;
    
    public Savings(Integer accountNum, String name, Double fees, Integer pin, Double balance, Double rate){
        super(accountNum, name, fees, pin, balance);
        this.rate = rate;
    }

    public Savings() {
        super();
        rate = 0.0;
    }

    public void setRate(Double rate){
        this.rate = rate;
    }
    public Double getRate(){
        return rate;
    }
}