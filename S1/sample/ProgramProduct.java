package S1.sample;

//import S1;

public class ProgramProduct {

    public static void main(String[] args) {
        Product product1 = new Product();
        //product1.brand = "ООО Чистый Источник";
        //product1.name = "Бутылка с водой";
        //product1.price = 125.15;
        System.out.println(product1.displayInfo());

        Product product2 = new Product("ООО Чистый Источник", "Бу", -90.15);
        //product2.brand = "ООО Чистый Источник";
        //product2.name = "__";
        //product2.price = -15;

        System.out.println(product2.displayInfo());
    }

}
