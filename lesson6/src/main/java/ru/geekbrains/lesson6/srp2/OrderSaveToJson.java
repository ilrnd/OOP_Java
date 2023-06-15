package ru.geekbrains.lesson6.srp2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OrderSaveToJson {
    private final Order order;

    public OrderSaveToJson(Order order) {
        this.order = order;
    }

    public void saveToJson(){

    String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
            writer.write("\"qnt\":" + order.getQnt() + ",\n");
            writer.write("\"price\":" + order.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
