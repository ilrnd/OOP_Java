package lesson2;

public class Cat {
    private String name;
    private int appetite;

    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public String info() {
        String status;
        if (satiety){
            status = " cыт";
        } else {
            status = " голоден";
        }
        return name + " c апетитом " + appetite + status;
    }

}
