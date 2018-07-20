package assignments.abstractinterfaces;

public class Car implements Auctionable{
	
    private String make, model;
    
    public Car (String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    public String getMake() { return make;  }
    public String getModel(){ return model; }
    public String toString(){
        return make + " " + model;
    }
    
    public String getDescription() {
        return "Low Mileage, New tires, AM/FM/CD";
        
    }
    public int getCondition(){
        return LIKE_NEW;
    }
}