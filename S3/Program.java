//2023/06/10 mip
package ru.geekbrains.lesson3.task2;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     *
     * @return
     */
    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(20000, 80000);
        String name = names[random.nextInt(names.length)];
        String surname = surnames[random.nextInt(3)];
        int age = random.nextInt(20,60);


        switch (random.nextInt(0,2)){
            case 0: return new SelfEmployee(name, surname, salary, age);
            case 1: return new Freelancer(name, surname, salary, age);
            default: return new Worker(name, surname, salary, age);
        }
    }


    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *  Придумать несколько Comparator'ов для сортировки сотрудников
     *  по фамилии + имени или по возрасту и уровню ЗП.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[20];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }


        System.out.println("\n---------------------------");
        System.out.println("Сортировка по Фамилиии и Зарплате (возрастание)");
        System.out.println("---------------------------");
        Arrays.sort(employees, new NameSalaryComparator(true)); // new SalaryComparator()
        for(Employee employee : employees){
            System.out.println(employee);
        }

        System.out.println("\n---------------------------");
        System.out.println("Сортировка по Возрасту и Зарплате (убывание)");
        System.out.println("---------------------------");
        Arrays.sort(employees, new AgeSalaryComparator(false)); // new SalaryComparator()
        for(Employee employee : employees){
            System.out.println(employee);
        }

    }

}
