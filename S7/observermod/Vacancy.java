package ru.geekbrains.lesson7.observermod;

import java.util.ArrayList;
import java.util.List;

public class Vacancy {
    private Company company;
    private int salary;
    private TypeOfVacancy typeOfVacancy;
 
    private boolean validFlag;
    private List<Applicant> applicants;
    private static List<Vacancy> vacancies = new ArrayList<>();
    
    /**
     * @param company - компания
     * @param salary - зарплата
     * @param typeOfVacancy - тип вакансии
     */
    public Vacancy(Company company, int salary, TypeOfVacancy typeOfVacancy) {
        this.company = company;
        this.salary = salary;
        this.typeOfVacancy = typeOfVacancy;
        this.validFlag = true;
        this.applicants = new ArrayList<>();
        this.vacancies.add(this);
    }

    public Company getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    public TypeOfVacancy getTypeOfVacancy() {
        return typeOfVacancy;
    }

    public boolean isValidFlag() {
        return validFlag;
    }

    public List<Applicant> getApplicants() {
        return applicants;
    }

    public void addApplicant(Applicant applicant) {
        applicants.add(applicant);
    }

    public static List<Vacancy> getVacancies(){
        return vacancies;
    }

    @Override
    public String toString() {
        return "Вакансия от " +
                "" + company.getNameCompany() +
                ", ЗП " + salary +
                " руб., тип вакансии " + typeOfVacancy +
                ", доступна=" + (validFlag ? "да":"нет") +
                ", заявки от " + applicants;
    }
}