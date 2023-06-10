package ru.geekbrains.lesson3.task2;

public class Freelancer extends Employee {

    public Freelancer(String name, String surname, double salary, int age) {
        super(name, surname, salary,age);
    }
    public Freelancer(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    {
        this.type = "Фрилансер";
        this.typeSalary = "доход от заказов";
    }
    @Override
    public double calculateSalary() {
        return salary;
    }


}
