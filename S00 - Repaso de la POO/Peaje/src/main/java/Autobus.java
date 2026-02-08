public class Autobus extends Vehiculo {
    
    //Atributos
    private int pasajeros;

    //Constructor
    public Autobus(String matricula, int pesoTotal, int pasajeros) {
        super(matricula, pesoTotal);
        this.pasajeros = pasajeros;
    }

    //Métodos
    public int peaje() {
        return 1 * this.pasajeros + 5 * (super.getPesoTotal() / 1000);
    }
    
    public int getPasajeros() {
        return this.pasajeros;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s + " # Autobús - Pasajeros: " + this.pasajeros;
    }
}
