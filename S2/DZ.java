package S2;

public class DZ {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(20);
        plate.info();
        

        cat.eat(plate);

        Cat[] cats = new Cat[]{
            new Cat("Marsik", 7),
            new Cat("Dimochka", 9),
            new Cat("Bimochka", 5),
            new Cat("Kotik", 1),
            new Cat("Obormotik", 2),
            new Cat("Lokki", 3),
            new Cat("Bagsik", 4),
            new Cat("Marusa", 5),
            new Cat("Princesa", 6),
            new Cat("Barmaleika", 6)
        };

        for (Cat catElement : cats) {
            catElement.eat(plate);
        }

        
        System.out.println("\nПроверяем сытость котов\n");        
        for (Cat catElement : cats) {
            catElement.ObWeHaveHunger();
        }
        
        System.out.println("\nДобавляем еды в тарелку, еще 100 штук\n");
        plate.addFood(100);

        for (Cat catElement : cats) {
            catElement.eat(plate);
        }

        System.out.println("\nПроверяем сытость котов\n");        
        for (Cat catElement : cats) {
            catElement.ObWeHaveHunger();
        }

  
    }    
}