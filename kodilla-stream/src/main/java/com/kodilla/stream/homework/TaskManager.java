package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {

    public static void main(String[] args) {
        List<LocalDate> pending = TaskRepository.getTasks()
                .stream()
                .filter(d -> LocalDate.now().isBefore(d.deadline))
                .map(dl -> dl.getDeadline())
                .collect(Collectors.toList());
        System.out.println(pending);

    }
}
