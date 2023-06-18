package ru.geekbrains.lesson7.observermod;

public enum TypeOfVacancy {
    Storog ("Сторож"),
    Programmer_Junior ("Программист (джуниор)"),
    Programmer_Middle ("Программист (миддл)"),
    Programmer_Senior ("Программист (сеньер)"),
    SEO ("Управляющий");

    private String titel;

    TypeOfVacancy(String titel){
        this.titel = titel;
    }

    @Override
    public String toString() {
        return this.titel;
    }
}
