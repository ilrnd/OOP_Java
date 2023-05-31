package lesson2;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 5);
        Cat cat2 = new Cat("Persik", 50);
        Cat cat3 = new Cat("Pushok", 50);
        Plate plate = new Plate(100);
        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        plate.info();
        CatEating catEating = new CatEating(cats);
        List<Cat> catResult = catEating.catEating(cats, plate.getFood());
        for (Cat catsResult: catResult){
            System.out.println(catsResult.info());
        }
        plate.setFood(catEating.getFood());
        plate.info();
        System.out.println("Добавляем корма: ");
        int addFood = plate.addFood(200);
        plate.setFood(addFood);
        plate.info();
        catResult = catEating.catEating(cats, plate.getFood());
        for (Cat catsResult : catResult){
            System.out.println(catsResult.info());
        }

    }

}
