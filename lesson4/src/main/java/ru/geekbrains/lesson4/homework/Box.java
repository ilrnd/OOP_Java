package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;
import java.util.Collection;

public class Box <T extends Fruit>{
    private float boxWeight;

    private ArrayList<T> fruits;

    public Box(){
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit){
        fruits.add(fruit);
    }

    public float getBoxWeight() {
        boxWeight = 0.0f;
        for (T fruit: fruits){
             boxWeight += fruit.getWeight();
        }
        return boxWeight;
    }

    protected boolean compare(Box box){
        return this.getBoxWeight() == box.getBoxWeight();
    }

    protected void overflow(Box<T> boxOverflow){
        boxOverflow.fruits.addAll(fruits);
        fruits.clear();
    }
}
