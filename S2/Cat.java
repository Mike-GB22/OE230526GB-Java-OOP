package S2;

import javax.swing.plaf.metal.MetalBorders.PaletteBorder;

public class Cat {
    private String name;
    private int appetite;
    private boolean weHaveHunger = true;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.weHaveHunger = true;
    }
    
    public void eat(Plate plate) {
        int weHaveFood = plate.getFood();

        if(!willWeEatSeeAndDiceidAndSpeak(weHaveFood)) return;
        
        System.out.print(getOfficialNameTitle() + " ");
        if(plate.getFood(appetite)){
            System.out.println("Мы поели!!! Ура!");
            weHaveHunger = false;
        } else {
            System.out.println("Тарелка убежала... мы не поели ;(");                
        }
        System.out.println("");            
        return;
    }

    public int getAppetite(){
        return appetite;
    }

    public String getName(){
        return name;
    }

    public boolean willWeEatSeeAndDiceid(int weHaveFood){
        if (appetite <= weHaveFood) return true;
        return false;
    }

    public boolean willWeEatSeeAndDiceidAndSpeak(int weHaveFood){
        String officialName = getOfficialNameTitle();
        System.out.printf("%s Смотрит на еду. Его аппетит [%d], в тарелке еды [%d], голодны ли мы %b.\n", 
        officialName, appetite, weHaveFood, weHaveHunger);

        System.out.print(officialName + " ");

        if(!weHaveHunger){
            System.out.println("Мы сытые. Зачем нам еще раз есть?");
            return false;
        }

        boolean willWeEat = willWeEatSeeAndDiceid(weHaveFood);
        if(willWeEat)
            System.out.println("Мы голодные. Еды достаточно. Принято решение поесть!");
        else 
            System.out.println("Мы голодные, но обидка - еды мало! Есть не будем!");
        return willWeEat;
    }

    public String getOfficialNameTitle(){
        return String.format("Кот [%s].", name);
    }

    public void ObWeHaveHunger(){
        System.out.print(getOfficialNameTitle() + " ");
        if(weHaveHunger) System.out.println("Голодный и злой!");
        else System.out.println("Сытый и довольный!");
    }


}
