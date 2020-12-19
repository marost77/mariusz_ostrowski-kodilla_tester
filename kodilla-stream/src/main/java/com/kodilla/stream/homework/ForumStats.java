package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgAbove40 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge()>=40)
                .map(User::getNumberOfPost)
                .mapToInt(value -> value)
                .average()
                .getAsDouble();
        System.out.println("Average posts age 40 and above: "+avgAbove40);

        double avgBelow40 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge()<40)
                .map(User::getNumberOfPost)
                .mapToInt(value -> value)
                .average()
                .getAsDouble();
        System.out.println("Average posts age below 40: "+avgBelow40);
    }
}
