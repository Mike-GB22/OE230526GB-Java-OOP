package ru.geekbrains.lesson7.observermod;

import java.util.Random;

public class Company {

    private static Random random = new Random();

    private String nameCompany;
    private Publisher jobAgency;

    public Company(String nameCompany, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(TypeOfVacancy typeOfVacancy, int maxSalary){
        int salary = random.nextInt(maxSalary/2, maxSalary*2);
        Vacancy vacancy = new Vacancy(this, salary, typeOfVacancy);
        jobAgency.sendOffer(vacancy);
    }

    public String getNameCompany() {
        return nameCompany;
    }

    @Override
    public String toString() {
        return "Company [nameCompany=" + nameCompany + ", jobAgency=" + jobAgency + "]";
    }
}
