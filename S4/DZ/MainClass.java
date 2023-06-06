package S4.DZ;

public class MainClass {
    public static final String  TASK = """
        2023/06/06 Домашняя задача

        Урок 4. ООП: Обобщения. ч1
        a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
        поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        c. Для хранения фруктов внутри коробки можно использовать ArrayList;
        d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
        вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
        подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
        Можно сравнивать коробки с яблоками и апельсинами;
        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
        Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
        Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
        g. Не забываем про метод добавления фрукта в коробку.
           """;

    public static void main(String[] args) {
        System.out.println(TASK);

        Box<Apple> boxOfApple = new Box<>();
        Box<Orange> boxOfOrange = new Box<>();

        for(int i = 0; i < 10; i++){
            boxOfApple.putAFruit(new Apple());
        }

        for(int i = 0; i < 10; i++){
            boxOfOrange.putAFruit(new Orange());
        }

        System.out.println("Сранвим вес коробок:\nкоробки равны по весу? " + boxOfApple.compare(boxOfOrange));
        System.out.println("Коробка яблок весит: " + boxOfApple.getWeight());
        System.out.println("Коробка апельсин весит: " + boxOfOrange.getWeight());

        
        System.out.println("\n--- перекладываем фрукты в новые коробки ---");
        Box<Apple> newBoxOfApple = boxOfApple.getAllFruit();
        Box<Orange> newBoxOfOrange = boxOfOrange.getAllFruit();

        System.out.println("\nСранвим вес СТАРЫХ коробок:\nкоробки равны по весу? " + boxOfApple.compare(boxOfOrange));
        System.out.println("Коробка яблок весит: " + boxOfApple.getWeight());
        System.out.println("Коробка апельсин весит: " + boxOfOrange.getWeight());
        System.out.println("Новая коробка яблок весит: " + newBoxOfApple.getWeight());
        System.out.println("Новая коробка апельсин весит: " + newBoxOfOrange.getWeight());

        //System.out.println("\n--- перекладываем фрукты в одну общую коробку ---");
        //Box<Fruit> newBoxOfFruit = new Box<>();
        //newBoxOfFruit.putAllFruit(newBoxOfApple);
        //newBoxOfFruit.putAllFruit(newBoxOfOrange);
        //System.out.println("Общая коробка фруктов весит: " + newBoxOfFruit.getWeight());
    }

}
