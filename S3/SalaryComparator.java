package ru.geekbrains.lesson3.task2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    private boolean compareFromSmallToBig = true;

    public  SalaryComparator(){
    }

    public  SalaryComparator(boolean compareFromSmallToBig){
        this.compareFromSmallToBig = compareFromSmallToBig;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        // 1 0 -1
        if(compareFromSmallToBig) return Double.compare(o1.calculateSalary(), o2.calculateSalary());
        return Double.compare(o2.calculateSalary(), o1.calculateSalary());
        //return o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);

    }
}
