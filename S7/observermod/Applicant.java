package ru.geekbrains.lesson7.observermod;

import java.util.List;

public abstract class Applicant implements Observer {

    private String name;
    private int minSalary;
    private String typeOfApplicant;
    private List<TypeOfVacancy> vacancyListINeed;

    public Applicant(String name, int minSalary, String typeOfApplicant, List<TypeOfVacancy> vacancyListINeed) {
        this.name = name;
        this.minSalary = minSalary;
        this.typeOfApplicant = typeOfApplicant;
        this.vacancyListINeed = vacancyListINeed;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        String nameCompany = vacancy.getCompany().getNameCompany();
        int salary = vacancy.getSalary();
        TypeOfVacancy typeOfVacancy = vacancy.getTypeOfVacancy();

        //Проверяем, доступна ли еще вакансия?
        if(!vacancy.isValidFlag()){
            System.out.printf("%s Вакансия уже не доступна!!! (%s дает %f руб.)\n",
                    "", nameCompany, salary);
            return;
        }

        String prompt = String.format("%s %s (я запрашиваю %d руб.): ",
                typeOfApplicant, name, minSalary);
        System.out.print(prompt);
        prompt = " ".repeat(prompt.length()-1);


        //Проверяем, подходит ли мне Вакансия
        boolean flagINeedThisVacancy = false;
        for (TypeOfVacancy vacancyINeed : vacancyListINeed) {
            if(vacancy.getTypeOfVacancy().equals(vacancyINeed)){
                System.out.printf("Вакансия [%s] мне подходит!\n",
                        vacancy.getTypeOfVacancy());
                        flagINeedThisVacancy = true;
                break;
            }
        }
        if (!flagINeedThisVacancy){
            System.out.printf("Вакансия [%s] мне не подходит, так как я хочу работать [%s]\n",
                    vacancy.getTypeOfVacancy(), vacancyListINeed);
            return;
        }

        //Проверяем теперь зарплаты
        if (minSalary <= salary){
            System.out.printf("%s Мне нужна эта работа! (%s дает %d руб.)\n",
                    prompt, nameCompany, salary);
            minSalary = salary;
            vacancy.addApplicant(this);
                System.out.println(prompt + " Заявка подана!");
        }
        else{
            System.out.printf("%s Я найду работу получше! (%s дает только %d руб.)\n",
                    prompt, nameCompany, salary);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
