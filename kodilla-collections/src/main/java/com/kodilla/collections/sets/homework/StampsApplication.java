package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {

        Set<Stamp> stampSet = new HashSet<>();
        stampSet.add(new Stamp("jedynka", "25x25", true));
        stampSet.add(new Stamp("dwojka","25x32", false));
        stampSet.add(new Stamp("trojka", "25x25",true));
        stampSet.add(new Stamp("jedynka", "25x25",true));


        for (Stamp stamp : stampSet             ) {
            System.out.println(stamp);
        }

    }
}
