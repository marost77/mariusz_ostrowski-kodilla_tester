package com.kodilla.jacoco;

public class Year {

    int sampleYear;

    public Year(int year) {
        this.sampleYear = year;
    }

    public boolean isLeap() {
        if (this.sampleYear % 4 == 0) {
            if (this.sampleYear % 100 == 0) {
                if (this.sampleYear % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
