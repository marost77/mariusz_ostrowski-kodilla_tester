package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] atmList;

    public double totalBalance(CashMachine[] atmList){
        double sum =0;
        for (CashMachine atm :atmList) {
            sum = sum + atm.balance();
        }
            return sum;
    }


    public double inTransactionsCount(CashMachine[] atmList){
        double sum = 0;
        for (CashMachine atm : atmList) {
            sum = sum + atm.inValuesCount();
        }
        return sum;
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
