package ru.geekbrains.lesson3.task2;

import java.util.Comparator;

public class NameSalaryComparator implements Comparator<Employee> {
    private boolean compareFromSmallToBig = true;

    public NameSalaryComparator(){
    }

    public NameSalaryComparator(boolean compareFromSmallToBig){
        this.compareFromSmallToBig = compareFromSmallToBig;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        int returnInt = o1.surname.compareTo(o2.surname);
        if(returnInt == 0){
            returnInt = Double.compare(o1.calculateSalary(), o2.calculateSalary());
        }

        if(!compareFromSmallToBig) returnInt *= -1;
        return returnInt;
    }
}
