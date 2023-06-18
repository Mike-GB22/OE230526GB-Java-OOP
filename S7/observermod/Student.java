package ru.geekbrains.lesson7.observermod;

import java.util.List;
import java.util.Random;

public class Student extends Applicant {

    public Student(String name, List<TypeOfVacancy> vacancyListINeed) {
        super(
                name,
                new Random().nextInt(2000, 3000),
                "Студент",
                vacancyListINeed);

    }
}
