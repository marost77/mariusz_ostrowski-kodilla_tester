package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks(){
        List<Task> taskList = new ArrayList<>();

        taskList.add(new Task("Meet John", LocalDate.of(2020,12,15),LocalDate.of(2020,12,31)));
        taskList.add(new Task("Go to Italy", LocalDate.of(2020,11,15), LocalDate.of(2020,11,30)));
        taskList.add(new Task("Buy gifts",LocalDate.of(2020,12,21),LocalDate.of(2020,12,23)));
        taskList.add((new Task("Plan holidays",LocalDate.of(2020,12,01),LocalDate.of(2020,12,31))));

        return taskList;

    }
}
