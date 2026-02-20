package Peaje;

public abstract class Vehiculo {
    
    //Atributos
    private String matricula;
    private int pesoTotal;
    private static int cantidad = 0;

    //Constructor
    public Vehiculo(String matricula, int pesoTotal) {
        this.matricula = matricula;
        this.pesoTotal = pesoTotal;
        Vehiculo.incrementaCantidad();
    }
    
    //Métodos
    private static void incrementaCantidad() {
        Vehiculo.cantidad++;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public int getPesoTotal() {
        return this.pesoTotal;
    }

    public static int getCantidad() {
        return Vehiculo.cantidad;
    }

    public static void borraCantidad() {
        Vehiculo.cantidad = 0;
    }

    @Override
    public String toString() {
        return "Vehículo con matrícula: " + this.matricula + " Peso total: " + this.pesoTotal;
    }
    
    //Método abstracto
    public abstract int peaje();
}
