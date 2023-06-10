package ru.geekbrains.lesson3.task2;

public class SelfEmployee extends Employee {

    public SelfEmployee(String name, String surname, double salary, int age) {
        super(name, surname, salary,age);
    }
    public SelfEmployee(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    {
        this.type = "Самозанятый (ИП)";
        this.typeSalary = "месячный доход";
    }
    @Override
    public double calculateSalary() {
        return salary;
    }


}
