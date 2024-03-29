public class HotDrink {   // Создали класс "Горячий напиток" с полями - названиями и целочисленным типом данных
    private String название; 
    private int объем; 
    public HotDrink(String название, int объем) { 
        this.название = название; 
        this.объем = объем; 
    }

    public String getНазвание() { 
        return название; 
    }  
    public void setНазвание(String название) { 
        this.название = название; 
    }
    public int getОбъем() { 
        return объем; 
    }
    public void setОбъем(int объем) { 
        this.объем = объем; 
    }
}
