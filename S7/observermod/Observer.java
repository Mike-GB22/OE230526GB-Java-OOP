package ru.geekbrains.lesson7.observermod;

public interface Observer {

    //void receiveOffer(String nameCompany, double salary);
    void receiveOffer(Vacancy Vacancy);
}
