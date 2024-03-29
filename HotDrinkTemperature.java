public class HotDrinkTemperature extends HotDrink { 
    private int HotDrinkTemperature;

    public HotDrinkTemperature (String название, int объем, int температура) {
    super(название, объем); 
    this.HotDrinkTemperature = температура; 
    }

    public int getТемпература() { 
        return HotDrinkTemperature; 
    } 

    public void setТемпература(int температура) { 
        this.HotDrinkTemperature = температура; 
    }
}
