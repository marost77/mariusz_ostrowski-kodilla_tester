package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transaction;
    private int size;

    public CashMachine(){
        this.size=0;
        this.transaction=new int[0];
    }

    public void transaction(int value) {
        if (balance()+value >= 0) {
            this.size++;
            int[] newTransaction = new int[size];
            System.arraycopy(transaction, 0, newTransaction, 0, transaction.length);
            newTransaction[this.size - 1] = value;
            this.transaction = newTransaction;
        }
        else{
            return;
        }
    }



    public int balance(){
        if (this.transaction.length==0){
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < this.transaction.length; i++) {
            sum =sum+ this.transaction[i];
        }
        return sum;
    }

    public int inValuesCount (){
        int inValueCount = 0;
        for (int i = 0; i < this.transaction.length; i++) {
            if(this.transaction[i]>0){
                inValueCount++;
            }
        }
        return inValueCount;
    }

    public double inValueSum(){
        double inValueSum = 0;
        for (int i = 0; i < transaction.length; i++) {
            if (transaction[i]>0){
                inValueSum = inValueSum + transaction[i];
            }
        }
        return inValueSum;
    }

    public int outValuesCount (){
        int outValueCount = 0;
        for (int i = 0; i < this.transaction.length; i++) {
            if(this.transaction[i]<0){
                outValueCount++;
            }
        }
        return outValueCount;
    }

    public double outValueSum(){
        double outValueSum=0;
        for (int i = 0; i < transaction.length; i++) {
            if(transaction[i]<0){
                outValueSum=outValueSum+transaction[i];
            }
        }
        return outValueSum;
    }

    public double averageOutValue(){
        double sumOutValue = 0;
        for (int i = 0; i < this.transaction.length; i++) {
            if(this.transaction[i]<0){
                sumOutValue=sumOutValue+this.transaction[i];

            }
        }
        return sumOutValue/outValuesCount();
    }

    public double averageInValue(){
        double sumInValue = 0;
        for (int i = 0; i < this.transaction.length; i++) {
            if(this.transaction[i]>0){
                sumInValue = sumInValue+this.transaction[i];
            }
        }
        return sumInValue/inValuesCount();
    }
}
