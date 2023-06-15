package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class OrderInputFromConsole {
    private Order order;
    Scanner scanner = new Scanner(System.in);

    public OrderInputFromConsole(Order order) {
        this.order = order;
    }

    private String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

    public void inputFromConsole(Order order){
        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Продукт: "));
        order.setQnt(Integer.parseInt(prompt("Кол-во: ")));
        order.setPrice(Integer.parseInt(prompt("Цена: ")));
    }
}
