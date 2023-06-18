package ru.geekbrains.lesson7.observermod;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(Vacancy vacancy) {
        System.out.println("\n--------");
        System.out.println("Вакансия " +
                vacancy.getTypeOfVacancy() +
                ", от " + vacancy.getCompany().getNameCompany() +
                " [" + + vacancy.getSalary() + "руб.]:");
        System.out.println("--------");
        for (Observer observer: observers) {
            observer.receiveOffer(vacancy);
        }
    }

    @Override
    public String toString() {
        return "JobAgency [observers=" + observers + "]";
    }
    
}
