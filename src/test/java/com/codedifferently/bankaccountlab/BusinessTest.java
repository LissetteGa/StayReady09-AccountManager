package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BusinessTest {
    Business bAccount;

    @Before
    public void initial() {
        bAccount = new Business(12345678, "Rhino", 50.00, 1234, 50.00, 123, "Code Diff.");
    }
     

    @Test
    public void getTaxIdTest(){
        //Given
        Integer expected = 123;

        //When 
        Integer actual = bAccount.getTaxId();
        
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFeesTest() {
        //Given
        Double expected = 50.00;

        //When 
        Double actual = bAccount.getFees();
        
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCompNameTest(){
        //Given
        String expected = "Code Diff.";

        //When 
        String actual = bAccount.getCompany();
        
        //Then
        Assert.assertEquals(expected, actual);
    }


    
}