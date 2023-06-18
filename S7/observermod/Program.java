//mip2023/06/18
package ru.geekbrains.lesson7.observermod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {


    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        Company geekBrains = new Company("GeekBrains", jobAgency);
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);
        Company tualeti = new Company("Совесткие туалеты", jobAgency);

        

        Master ivanov = new Master("Иванов",
            new ArrayList<TypeOfVacancy>(
                Arrays.asList(
                    TypeOfVacancy.Programmer_Middle,
                    TypeOfVacancy.Programmer_Senior
        )));

        Master petrov = new Master("Петров",
            new ArrayList<TypeOfVacancy>(
                Arrays.asList(
                    TypeOfVacancy.Programmer_Middle,
                    TypeOfVacancy.Programmer_Senior
        )));

        Master bubnov = new Master("Бубнов",
            new ArrayList<TypeOfVacancy>(
                Arrays.asList(
                    TypeOfVacancy.Programmer_Junior,
                    TypeOfVacancy.Programmer_Middle,
                    TypeOfVacancy.Programmer_Senior
        )));
        

        Student sidorov = new Student("Сидоров",
            new ArrayList<TypeOfVacancy>(
                Arrays.asList(
                    TypeOfVacancy.Programmer_Junior,
                    TypeOfVacancy.Programmer_Middle
        )));
        
        Student padavan = new Student("Падаван",
            new ArrayList<TypeOfVacancy>(
                Arrays.asList(
                    TypeOfVacancy.Programmer_Junior
        )));
        

        Student mkrtchan = new Student("Мкртчян",
            new ArrayList<TypeOfVacancy>(
                Arrays.asList(
                    TypeOfVacancy.Storog
        )));

        Director pupkov = new Director("Пупков",
            new ArrayList<TypeOfVacancy>(
                Arrays.asList(
                    TypeOfVacancy.SEO
        )));


        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(bubnov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(padavan);        
        jobAgency.registerObserver(mkrtchan);
        jobAgency.registerObserver(pupkov);


        geekBrains.needEmployee(TypeOfVacancy.Programmer_Junior, 10000);
        geekBrains.needEmployee(TypeOfVacancy.Programmer_Middle, 30000);
        google.needEmployee(TypeOfVacancy.Programmer_Middle, 50000);
        google.needEmployee(TypeOfVacancy.Programmer_Senior, 100000);
        yandex.needEmployee(TypeOfVacancy.Programmer_Senior, 100000);
        yandex.needEmployee(TypeOfVacancy.SEO, 500000);

        tualeti.needEmployee(TypeOfVacancy.Storog, 5000);


        System.out.println("\n\n---------------------------");
        System.out.println("Список Вакансий");
        System.out.println("---------------------------");
        for (Vacancy vacancy: Vacancy.getVacancies()) {
            System.out.println(vacancy);
        }
    }

}
