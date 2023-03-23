package com.ignatev.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public University() {
        Student s1 = new Student("Kostya", "Ignatev", 21);
        Student s2 = new Student("Professor", "Popov", 21);
        Student s3 = new Student("Noname", "Usov", 21);

        students.add(s1);
        students.add(s2);
        students.add(s3);
    }

    public List<Student> getStudents() {
        System.out.println("Start of get Students");
        students.get(2);
        System.out.println("Information from getStudents: ");
        System.out.println(students);
        return students;
    }
}
