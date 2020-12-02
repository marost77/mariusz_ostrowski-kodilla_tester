package com.kodilla.bank.homework;

public class Bank {
    CashMachine atm1;
    CashMachine atm2;

    public int totalBalance(CashMachine atm1, CashMachine atm2){

            int totalBalance = atm1.balance()+atm2.balance();

            return totalBalance;
    }


    public int inTransactionsCount(CashMachine atm1, CashMachine atm2){
        int totalInTransactionsCount = atm1.inValuesCount()+atm2.inValuesCount();

        return totalInTransactionsCount;
    }

    public int outTransactionsCount(CashMachine atm1, CashMachine atm2){
        int totalOutTransactionCount = atm1.outValuesCount()+atm2.outValuesCount();

        return totalOutTransactionCount;
    }

    public double totalAverageIn(CashMachine atm1, CashMachine atm2){
        double totalAverageIn = (atm1.inValueSum()+atm2.inValueSum())/(atm1.inValuesCount()+atm2.inValuesCount());

        return totalAverageIn;
    }

    public double totalAverageOut(CashMachine atm1, CashMachine atm2){
        double totalAverageOut = (atm1.outValueSum()+atm2.outValueSum())/(atm1.outValuesCount()+atm2.outValuesCount());

        return totalAverageOut;
    }

}
