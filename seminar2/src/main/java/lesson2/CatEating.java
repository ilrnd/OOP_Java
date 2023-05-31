package lesson2;

import java.util.ArrayList;
import java.util.List;

public class CatEating {
    private List<Cat> catList;
    private int food;
    public CatEating(List<Cat> catList){
        this.catList = catList;
    }
    public List<Cat> catEating(List<Cat> catList, int food){
        this.catList = catList;
        List<Cat> catsResult = new ArrayList<>();
        for(Cat cat: catList){
            if (food - cat.getAppetite() >= 0){
                food -= cat.getAppetite();
                cat.setSatiety(true);
                catsResult.add(cat);
            } else {
                cat.setSatiety(false);
                catsResult.add(cat);
            }
        }
        this.food = food;
        return catsResult;
    }

    public int getFood() {
        return food;
    }
}
