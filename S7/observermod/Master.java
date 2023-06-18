package ru.geekbrains.lesson7.observermod;

import java.util.List;
import java.util.Random;

public class Master extends Applicant {

    public Master(String name, List<TypeOfVacancy> vacancyListINeed) {
        super(
                name,
                new Random().nextInt(100000, 1000000),
                "Мастер", vacancyListINeed
        );

    }
}
