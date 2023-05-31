package lesson2;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("В миске " + food + " корма.");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int addFood(int addingFood){
        int totalFood = getFood() + addingFood;
        return totalFood;
    }
}
