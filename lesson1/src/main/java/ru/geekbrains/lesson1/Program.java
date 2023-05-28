package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        int a = 1;
        Product product1;

        product1 = new Product("ООО Лучшая вода", "Бу", -100.12);

        Product bottleOfWater1 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [1]", 115, 1);
        Product bottleOfWater2 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [2]", 215, 1.5);
        BottleOfWater bottleOfWater3 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [3]", 1115, 1.5);
        Product bottleOfWater4 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [4]", 55, 2);
        Product bottleOfMilk1 = new BottleOfMilk("ООО Чистый источник", "Бутылка с молоком", 115, 1.5, 10);
        Product chocolate1 = new Chocolate("Марс", "Сникерс", 150, 1200, 100);
        Product chocolate2 = new Chocolate("Cadberry", "Picnic", 150, 1000, 100);
        Product chocolate3 = new Chocolate("Победа", "Горький", 100, 900, 90);



        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater4);
        products.add(bottleOfWater3);
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);

        System.out.println(chocolate1.displayInfo());
        System.out.println(chocolate2.displayInfo());
        System.out.println(chocolate3.displayInfo());

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(2);
        if (bottleOfWaterResult != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        Chocolate chocolateResult = vendingMachine.getChocolate(1000);
        if (chocolateResult != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateResult.displayInfo());
        }
        else {
            System.out.println("Такой шоколадки нет");
        }
    }

}
