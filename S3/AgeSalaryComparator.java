package ru.geekbrains.lesson3.task2;

import java.util.Comparator;

public class AgeSalaryComparator implements Comparator<Employee> {
    private boolean compareFromSmallToBig = true;

    public AgeSalaryComparator(){
    }

    public AgeSalaryComparator(boolean compareFromSmallToBig){
        this.compareFromSmallToBig = compareFromSmallToBig;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        int returnInt = Integer.compare(o1.age, o2.age);
        if(returnInt == 0){
            returnInt = Double.compare(o1.calculateSalary(), o2.calculateSalary());
        }

        if(!compareFromSmallToBig) returnInt *= -1;
        return returnInt;
    }
}
