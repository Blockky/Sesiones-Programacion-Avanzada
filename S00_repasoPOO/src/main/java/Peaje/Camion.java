package Peaje;

public class Camion extends Vehiculo {
    
    //Atributos
    private int ejes;

    //Constructor
    public Camion(String matricula, int pesoTotal, int ejes) {
        super(matricula, pesoTotal);
        this.ejes = ejes;
    }
    
    //Métodos
    public int peaje() {
        return 5 * this.ejes + 2 * (super.getPesoTotal() / 1000);
    }
    
    public int getEjes() {
        return this.ejes;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s + " # Camión - Ejes: " + this.ejes;
    }
}
