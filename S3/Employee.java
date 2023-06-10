package ru.geekbrains.lesson3.task2;

public abstract class Employee implements Comparable<Employee> {
    protected String name;
    protected String surname;
    protected double salary; // Ставка заработной платы

    protected int age; // Ставка заработной платы
    protected String type;
    protected String typeSalary;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() { return age; }

    public String getType() { return type; }

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.type = "Форма договора не определенна";
        this.typeSalary = "сдельная месячная оплата";
        this.age = -1;
    }

    public Employee(String name, String surname, double salary, int age) {
        this(name, surname, salary);
        this.age = age;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int res = surname.compareTo(o.surname);
        if (res == 0)
            return Double.compare(calculateSalary(), o.calculateSalary());
        else
            return res;
    }

    @Override
    public String toString() {
        String ageString = "";
        if (age > 0) ageString = String.format(" [возраст, лет: %d]", age);
        return  String.format("%s %s%s; %s; Среднемесячная заработная плата (%s): %.2f (руб.)",
                surname, name, ageString, type, typeSalary, calculateSalary());
    }
}
