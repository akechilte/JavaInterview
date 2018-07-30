package com.Interview.blackrock.bankaccountprob1.bankprob1;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mbiswas on 6/5/18.
 */


//Problem : Complete the code by adding classes based on main method calls
public class BankAccountProblem {

    private static final String TEXT = "I am a {0} account with {1,number,#} units of {2} currency";

    public static void main(String args[]) throws Exception {

        List<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new SavingsAccount("USD", 3));//Savings
        accounts.add(new SavingsAccount("EUR", 2));//Savings
        accounts.add(new CheckingAccount("HUF", 100));//Checking
        accounts.add(new CheckingAccount("COP", 10000));//Checking
        accounts.add(new BrokerageAccount("GBP", 2));//Brokerage
        accounts.add(new BrokerageAccount("INR", 600));//Brokerage

        accounts.stream().forEach(
                account -> System.out.println(
                        MessageFormat.format(TEXT,
                                new Object[]{
                                        account.getAccountType().getName(),//make this work
                                        account.getUnits(),//make this work
                                        account.getCurrency()//make this work
                                })));
    }
}


class AccountType{
    String name;

    public AccountType(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}


class BankAccount{

    AccountType accountType;
    String currency;
    int units;

    public BankAccount(String name){
        this.accountType = new AccountType(name);
    }

    public AccountType getAccountType(){
        return accountType;
    }

    public void setCurrency(String currency){
        this.currency = currency;
    }

    public String getCurrency(){
        return currency;
    }


    public void setUnits(int units){
        this.units = units;
    }

    public int getUnits(){
        return units;
    }

}


class SavingsAccount extends BankAccount {

    public SavingsAccount() {
        super("Savings");
    }

    public SavingsAccount(String currency, int units){
        this();
        super.setCurrency(currency);
        super.setUnits(units);
    }
}


class CheckingAccount extends BankAccount {

    public CheckingAccount() {
        super("Checking");
    }

    public CheckingAccount(String currency, int units){
        this();
        super.setCurrency(currency);
        super.setUnits(units);
    }
}


class BrokerageAccount extends BankAccount {

    public BrokerageAccount() {
        super("Brokerage");
    }

    public BrokerageAccount(String currency, int units){
        this();
        super.setCurrency(currency);
        super.setUnits(units);
    }
}



