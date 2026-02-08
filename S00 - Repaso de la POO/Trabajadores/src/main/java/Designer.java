/**
 * @author Blocky
 */
public class Designer extends Worker {
    
    // Attributes
    private static int numberOfDesigners = 0;
    
    // Constructor
    public Designer(String ID, String fullName) {
        super(ID, fullName);
        Designer.increaseDesigners();
    }

    // Methods
    public double calculateCost(int numHours) {
        super.increaseHours(numHours);
        return numHours*100;
    }
    
    private static void increaseDesigners() {
        numberOfDesigners++;
    }
    
    public static int getDesigners() {
        return numberOfDesigners;
    }
    
    @Override
    public String toString() {
        return "Designer: " + " ; "+ super.toString();
    }
}
