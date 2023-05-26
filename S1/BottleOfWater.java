public class BottleOfWater extends Bottle {

    public BottleOfWater(String brand, String name, double price, double volume) {
        super(brand, name, price, volume);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String displayInfo() {
        return String.format(super.displayInfo() + "]");
    }
}
