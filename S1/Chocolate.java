//2023/05/26 mip

public class Chocolate extends Product {

    int weight;

    public Chocolate (String brand, String name, double price, int weight){
        super(brand, name, price);
        this.weight = checkWeight(weight);
    }

    private int checkWeight(int weight){
        if(weight < 1) weight = 1;
        return weight;
    }
    
  
    public int getWeight() {
        return weight;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколадка] %s - %s - %f [вес: %d гр.]", brand, name, price, weight);
    }
}
