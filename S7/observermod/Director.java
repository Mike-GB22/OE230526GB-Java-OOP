package ru.geekbrains.lesson7.observermod;

import java.util.List;
import java.util.Random;

public class Director extends Applicant {
    public Director(String name, List<TypeOfVacancy> vacancyListINeed) {
        super(
                name,
                new Random().nextInt(100000, 1000000),
                "Директор", vacancyListINeed
        );

    }
}
