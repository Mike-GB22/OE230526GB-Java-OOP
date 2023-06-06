package S4.DZ;

import java.util.LinkedList;

public class Box<T extends Fruit> {
    private LinkedList<T> boxList = new LinkedList<>();

    public float getWeight(){
        float weight = 0;
        for (T fruit : boxList) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> otherBox){
        if(this.getWeight() == otherBox.getWeight()) return true;
        return false;
    }

    public T getAFruit(){
        return boxList.pop();
    }

    public void putAFruit(T aFruit){
        boxList.push(aFruit);
    }

    public boolean isEmpty(){
        if(boxList.size() > 0) return false;
        return true;
    }

    public Box<T> getAllFruit(){
        Box<T> tempBox = new Box<>();
        while(!this.isEmpty()){
            tempBox.putAFruit(this.getAFruit());
        }
        return tempBox;
    }

    public void putAllFruit(Box<T> tempBox){
        while(!tempBox.isEmpty()){
            this.putAFruit(tempBox.getAFruit());
        }
    }

}
