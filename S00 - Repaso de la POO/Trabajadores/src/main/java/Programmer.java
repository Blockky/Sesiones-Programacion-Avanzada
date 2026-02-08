public class Programmer extends Worker {
    
    // Attributes
    private String language;
    private static int numberOfProgrammers = 0;
    
    // Constructor
    public Programmer(String ID, String fullName, String language) {
        super(ID, fullName);
        this.language = language;
        Programmer.increaseProgrammers();
    }

    // Methods
    public double calculateCost(int numHours) {
        super.increaseHours(numHours);
        return numHours*50;
    }
    
    private static void increaseProgrammers() {
        numberOfProgrammers++;
    }
    
    public static int getProgrammers() {
        return numberOfProgrammers;
    }
    
    @Override
    public String toString() {
        return "Programmer: " + super.toString() + " ; " + this.language;
    }
}
