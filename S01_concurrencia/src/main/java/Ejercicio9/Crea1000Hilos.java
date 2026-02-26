package Ejercicio9;

/**
 * @author Blocky
 */
public class Crea1000Hilos {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            new HiloX(i).start();
        }
    }
}
