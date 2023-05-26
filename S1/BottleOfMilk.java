public class BottleOfMilk extends Bottle {

    private double volume; // объем
    private int fatСontent; // Содержание жирности


    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getFatСontent() {
        return fatСontent;
    }

    public void setFatСontent(int fatСontent) {
        this.fatСontent = fatСontent;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, int fatСontent) {
        super(brand, name, price, volume);
        //this.volume = volume;
        this.fatСontent = fatСontent;
    }

    @Override
    public String displayInfo() {
        //return String.format("[Бутылка] %s - %s - %f [объем: %f; жирность: %d]", brand, name, price, volume, fatСontent);
        return String.format(super.displayInfo() + "; жирность: %d]", fatСontent);
    }
}
