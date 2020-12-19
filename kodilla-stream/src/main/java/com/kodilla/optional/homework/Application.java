package com.kodilla.optional.homework;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", new Teacher("Mr Smith")));
        students.add(new Student("Anna", null));
        students.add((new Student("Merry", new Teacher("Ms Green"))));
        students.add(new Student("Kevin", new Teacher("Mr House")));
        students.add(new Student("Mike",null));

        for (Student student : students) {
            //Optional<Teacher> optionalTeacher = Optional.ofNullable(student.teacher);
            //optionalTeacher.ifPresent( teacher -> System.out.println("Student: "+student.name +",Teacher: "+ teacher.name));
            //optionalTeacher.orElse(new Teacher("<undefined>"));
            //System.out.println("Student: "+student.name+" ,teacher: "+optionalTeacher);
            //optionalTeacher.ifPresent(teacher -> System.out.println(student.name +teacher.name));

            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.teacher);
            Teacher teacher = optionalTeacher.orElse(new Teacher("<undefined>"));
            System.out.println("Student: "+student.name +", teacher: " +teacher.name);
        }

    }
}
