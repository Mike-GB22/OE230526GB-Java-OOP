package ru.geekbrains.lesson6.srp2mod;

import java.util.Scanner;

public class OrderFactory {
    private static Scanner scanner = new Scanner(System.in);

    public static Order createOrder(){
        String clientName = prompt("Имя клиента: ");
        String product = prompt("Продукт: ");
        int qnt = promptInt("Кол-во: ");
        int price = promptInt("Цена: ");
        return new Order(clientName, product, qnt, price);
    }

    private static String prompt(String message){
        System.out.print(message);
        return scanner.nextLine();
    }

    private static int promptInt(String message){
        try{
            return Integer.parseInt(prompt(message));
        } catch (Exception e) {
            System.out.println("Необходимо ввести число! ");
            return promptInt(message);
        }
    }
    
}
