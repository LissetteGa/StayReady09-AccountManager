package com.codedifferently.bankaccountlab;

public class Business extends BankAccount{
    private Integer taxId;
    private String company; 
    

    Business(Integer accountNum, String name, Double fees, Integer pin, Double balance, Integer taxID, String company){
        super(accountNum, name, fees, pin, balance);
        //this.setRate(1.00);
        taxId = taxID;
        this.company = company;
        
    }

    public Business() {
        super();
        taxId = 0;
        company = "";
    }
    
    public Integer getTaxId(){
        return this.taxId;
    }
    
    public String getCompany(){
        return this.company;
    }
    
    public void setCompany(String companyName){
        company = companyName; 
    }
}