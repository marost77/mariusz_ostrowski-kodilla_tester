package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> classes = new ArrayList<>();

    public School(Integer ... classes) {
        for (Integer students : classes){
            this.classes.add(students);
        }
    }

    public int schoolSum (){
        int schoolSum = 0;
        for(int students : classes){
            schoolSum += students;

        }
        return schoolSum;
    }

    public List<Integer> getClasses() {
        return classes;
    }
}
