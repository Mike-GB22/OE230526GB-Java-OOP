package ru.geekbrains.lesson3.task2;

public class Worker extends Employee {

    public Worker(String name, String surname, double salary, int age) {
        super(name, surname, salary,age);
    }
    public Worker(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    {
        this.type = "Рабочий (ТК)";
        this.typeSalary = "фиксированная месячная оплата";
    }
    @Override
    public double calculateSalary() {
        return salary;
    }


}
