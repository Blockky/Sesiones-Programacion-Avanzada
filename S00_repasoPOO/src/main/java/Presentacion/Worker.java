package Presentacion;

public abstract class Worker {
    
    // Attributes
    private String id;
    private String fullName;
    private int totalHours;
    
    // Constructor
    public Worker(String id, String fullName){
        this.id = id;
        this.fullName = fullName;
        this.totalHours = 0;
    }
    
    // Methods
    public void increaseHours(int hours){
        this.totalHours += hours;
    }
    
    public String getId(){
        return this.id;
    }

    // Abstract method
    public abstract double calculateCost(int numHours);
    
    @Override
    public String toString(){
        return this.id + " ; " + this.fullName + " ; " + this.totalHours;
    }
}
