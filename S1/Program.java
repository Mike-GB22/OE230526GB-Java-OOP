import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        int a = 12;

        System.out.println("\n- Список товаров в автомате-----------");

        Product product1 = new Product();
        //product1.brand = "ООО Чистый Источник";
        //product1.name = "Бутылка с водой";
        //product1.price = 125.15;
        System.out.println(product1.displayInfo());

        Product product2 = new Product("ООО Чистый Источник", "Бутылка с водой #2", -90.15);
        //product2.brand = "ООО Чистый Источник";
        //product2.name = "__";
        //product2.price = -15;
        product2.setPrice(-30);
        System.out.println(product2.displayInfo());

        BottleOfWater bottleOfWater1 =
                new BottleOfWater("ООО Чистый Источник", "Бутылка с водой #3", -90.15, 1.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk
                = new BottleOfMilk("ООО Чистый Источник", "Бутылка с молоком #1", -90.15, 1.5, 10);

        System.out.println(bottleOfMilk.displayInfo());

        Product schokolad = new Chocolate("ООО Марс Россия", "Сникерс", 50, 100);
        System.out.println(schokolad.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(bottleOfWater1);
        products.add(bottleOfMilk);
        products.add(schokolad);


        System.out.println("\n- Совершаем покупки -----------");

        VendingMachine vendingMachine = new VendingMachine(products);
        //BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(1.5);
        List<Product> bought = new ArrayList<>();
        bought.add(vendingMachine.getBottleOfWater(1.5));
        bought.add(vendingMachine.getChocolate(100));
        bought.add(vendingMachine.getChocolate(150));

        for (Product product : bought) {
            if (product != null){
                System.out.print("Вы купили: ");
                System.out.println(product.displayInfo());
            }
            else {
                System.out.println("Такого товара нет в автомате.");
            }
        }

    }

}
