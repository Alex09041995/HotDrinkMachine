import HotDrinkTemperature.java;
import HotDrinkMachine.java;

public static void main(String[] args) { 
    HotDrinkTemperature горячийНапиток1 = new HotDrinkTemperature("Кофе", 52, 31); 
    HotDrinkTemperature горячийНапиток2 = new HotDrinkTemperature("Чай", 15, 22);
    HotDrinkTemperature горячийНапиток3 = new HotDrinkTemperature("Какао", 48, 27);
    HotDrinkTemperature горячийНапиток4 = new HotDrinkTemperature("Глинтвейн", 68, 38);

    HotDrinkMachine горячихНапитковАвтомат = new HotDrinkMachine(); 
    HotDrinkTemperature продукт1 = горячихНапитковАвтомат.getProduct("Кофе", 52, 31);
    HotDrinkTemperature продукт2 = горячихНапитковАвтомат.getProduct("Чай", 15, 22);
    HotDrinkTemperature продукт3 = горячихНапитковАвтомат.getProduct("Какао", 48, 27);
    HotDrinkTemperature продукт4 = горячихНапитковАвтомат.getProduct("Глинтвейн", 68, 38);

}


