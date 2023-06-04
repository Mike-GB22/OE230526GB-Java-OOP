package S2;

import javax.swing.text.html.HTMLDocument.BlockElement;

public class Plate {
    private int food;

    public Plate(int food) {
        if (food < 0) food = 0;
        this.food = food;
    }
 
    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood(){
        return food;
    }

    public boolean getFood(int weEat){
        if (weEat > food) return false;
        food -= weEat;
        return true;
    }

    public void addFood(int weAddedFood){
        if (weAddedFood > 0) 
            food += weAddedFood;
    }
}
