package assignments.abstractinterfaces;

public class Computer implements Auctionable {
	
    private String brand, chip;
    private int condition;
    private String description = "No Description Available";

    public Computer (String brand, String chip) {
        this.brand = brand;
        this.chip = chip;
    }
    
    public String getBrand() { 
    	return brand; 
    	}
    
    public String getChip()  { 
    	return chip;
    	}
    
    public String toString(){
        return brand + " " + chip;
    }
    
    public void setDescription(String s){
        description = s;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setCondition(int c){
        condition = c;
    }
    
    public int getCondition(){
        return condition;
    }
    
}