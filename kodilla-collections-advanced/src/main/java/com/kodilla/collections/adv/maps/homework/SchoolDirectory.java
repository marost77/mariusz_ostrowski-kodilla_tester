package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal , School> schoolDirectory = new HashMap<>();

        Principal iksinksi = new Principal("Iksinski", "SP Jeden");
        Principal kowalski = new Principal("Kowalski", "SP Dwojka");
        Principal nowak = new Principal("Nowak", "SP Trojka");

        School spJedynka = new School(30,25,24,28,22);
        School spDwojka = new School(22,30,29,31,28);
        School spTrojka = new School(19,22,20,20,21);

        schoolDirectory.put(iksinksi, spJedynka);
        schoolDirectory.put(kowalski , spDwojka);
        schoolDirectory.put(nowak , spTrojka);

        for (Map.Entry<Principal , School> schoolEntry : schoolDirectory.entrySet()          ) {
            System.out.println("dyr "+schoolEntry.getKey().getName() + " " +
                    schoolEntry.getKey().getSchoolName()
                    + " " + schoolEntry.getValue().schoolSum()+ " students");
        }


    }
}
