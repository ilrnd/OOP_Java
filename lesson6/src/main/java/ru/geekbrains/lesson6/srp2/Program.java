package ru.geekbrains.lesson6.srp2;

public  class Program {

    /**
     * TODO: Задача 1. Домашняя работа. Оптимизировать работу класса Order в  рамках принципа SRP.
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order();
        OrderInputFromConsole orderInputFromConsole = new OrderInputFromConsole(order);
        orderInputFromConsole.inputFromConsole(order);
        OrderSaveToJson orderSaveToJson = new OrderSaveToJson(order);
        orderSaveToJson.saveToJson();
    }

}
