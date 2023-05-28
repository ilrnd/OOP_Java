package ru.geekbrains.lesson1;

public class Chocolate extends Product {
    private double calories;
    private double weight;

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Chocolate(String brand, String name, double price, double calories, double weight){
        super(brand, name, price);
        this.calories = calories;
        this.weight = weight;
    }

    @Override
    public String displayInfo(){
        return String.format("[Шоколадка]%s - %s - %f - [калорийность: %f] - [вес: %f]", brand, name, price, calories, weight);
    }
}
