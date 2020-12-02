package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTestSuite {

    Bank bank = new Bank();
    CashMachine atm1 = new CashMachine();
    CashMachine atm2 = new CashMachine();

    @Test
    public void calculateTotalBalance(){
        atm1.transaction(100);
        atm1.transaction(-200);
        atm1.transaction(200);
        atm1.transaction(-100);
        atm2.transaction(200);
        atm2.transaction(-100);
        atm2.transaction(-200);
        atm2.transaction(100);
        assertEquals(400,bank.totalBalance(atm1, atm2));
    }
    @Test
    public void countTotalIns(){
        atm1.transaction(100);
        atm1.transaction(-200);
        atm1.transaction(200);
        atm1.transaction(-100);
        atm2.transaction(200);
        atm2.transaction(-100);
        atm2.transaction(-200);
        atm2.transaction(100);
        assertEquals(4,bank.inTransactionsCount(atm1, atm2));
    }

    @Test
    public void countTotalOuts(){
        atm1.transaction(100);
        atm1.transaction(-200);
        atm1.transaction(200);
        atm1.transaction(-100);
        atm2.transaction(200);
        atm2.transaction(-100);
        atm2.transaction(-200);
        atm2.transaction(100);
        assertEquals(2,bank.outTransactionsCount(atm1, atm2));
    }

    @Test
    public void countTotalInsAverage(){
        atm1.transaction(100);
        atm1.transaction(-200);
        atm1.transaction(200);
        atm1.transaction(-100);
        atm2.transaction(300);
        atm2.transaction(-100);
        atm2.transaction(-200);
        atm2.transaction(200);
        assertEquals(200,bank.totalAverageIn(atm1, atm2));
    }
    @Test
    public void countTotalOutsAverage(){
        atm1.transaction(100);
        atm1.transaction(-200);
        atm1.transaction(200);
        atm1.transaction(-100);
        atm2.transaction(300);
        atm2.transaction(-100);
        atm2.transaction(-200);
        atm2.transaction(200);
        assertEquals(-133.33,bank.totalAverageOut(atm1, atm2),0.01);
    }
}
