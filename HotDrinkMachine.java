public class HotDrinkMachine implements VendingMachine { 
    @Override 
    public void getProduct() { 
    } 
    public HotDrinkTemperature getProduct(String название, int объём, int температура) {    
        return new HotDrinkTemperature(название, объём, температура);
    }
}

