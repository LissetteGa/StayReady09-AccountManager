package com.codedifferently.bankaccountlab;

public class Checkings extends BankAccount{
    private Double rate;
    
    public Checkings(Integer accountNum, String name, Double fees, Integer pin, Double balance, Double rate){
        super(accountNum, name, fees, pin, balance);
        this.rate = rate;
    }

    public Checkings() {
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