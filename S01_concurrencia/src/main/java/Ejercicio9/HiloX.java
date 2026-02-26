package Ejercicio9;

/**
 * @author Blocky
 */
public class HiloX extends Thread {
    private int id;
    
    public HiloX(int identificador) {
        this.id = identificador;
    }
    
    public void run() {
        System.out.println("Hilo con id " + id + " ejecutandose.");
    }
}
