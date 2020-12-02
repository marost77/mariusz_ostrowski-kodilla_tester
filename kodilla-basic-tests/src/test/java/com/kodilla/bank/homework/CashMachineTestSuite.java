package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

public class CashMachineTestSuite {

    private CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldReturnBalance(){

        cashMachine.transaction(100);
        cashMachine.transaction(-200);
        cashMachine.transaction(100);
        cashMachine.transaction(-200);
        assertEquals(0,cashMachine.balance());
    }

    @Test
    public void countIns(){
        cashMachine.transaction(100);
        cashMachine.transaction(-200);
        cashMachine.transaction(100);
        cashMachine.transaction(-200);
        cashMachine.transaction(50);
        assertEquals(3,cashMachine.inValuesCount());
    }

    @Test
    public void countOuts(){
        cashMachine.transaction(100);
        cashMachine.transaction(-50);
        cashMachine.transaction(100);
        cashMachine.transaction(-50);
        cashMachine.transaction(50);
        assertEquals(2,cashMachine.outValuesCount());
    }

    @Test
    public void avarageIns(){
        cashMachine.transaction(100);
        cashMachine.transaction(-50);
        cashMachine.transaction(100);
        cashMachine.transaction(-50);
        cashMachine.transaction(100);
        assertEquals(100,cashMachine.averageInValue());
    }

    @Test
    public void averageOuts(){
        cashMachine.transaction(100);
        cashMachine.transaction(-200);
        cashMachine.transaction(100);
        cashMachine.transaction(-10);
        cashMachine.transaction(100);
        cashMachine.transaction(-20);
        assertEquals(-15,cashMachine.averageOutValue());
    }

    @Test
    public void calculateInsSum(){
        cashMachine.transaction(100);
        cashMachine.transaction(-200);
        cashMachine.transaction(200);
        cashMachine.transaction(-100);
        cashMachine.transaction(300);
        cashMachine.transaction(-100);
        cashMachine.transaction(-200);
        cashMachine.transaction(200);
        assertEquals(800,cashMachine.inValueSum());
    }

    @Test
    public void calculateOutsSum(){
        cashMachine.transaction(100);
        cashMachine.transaction(-200);
        cashMachine.transaction(100);
        cashMachine.transaction(-10);
        cashMachine.transaction(100);
        cashMachine.transaction(-20);
        assertEquals(-30,cashMachine.outValueSum());
    }
}
