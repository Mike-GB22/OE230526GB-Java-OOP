package ru.geekbrains.lesson6.srp2mod;

public class Program {


    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        Order order = OrderFactory.createOrder();
        order.saveToJson();

    }

}
