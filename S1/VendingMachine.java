import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private final List<Product> products;



    public VendingMachine(List<Product> products) {

        this.products = products;
    }

    public Product getBottleOfWater(double volume){

        for(Product product : products){
            if (product instanceof BottleOfWater){
               if ( ((BottleOfWater)product).getVolume()  == volume){
                   return product;
               }
            }
        }
        return null;
    }

    public Product getChocolate(int weight){

        for(Product product : products){
            if (product instanceof Chocolate){
               if ( ((Chocolate)product).getWeight()  == weight){
                   return product;
               }
            }
        }
        return null;
    }


}
