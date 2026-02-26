package Ejercicio1;
import java.util.Date;

/**
 * @author Blocky
 */
public class PrimosThread extends Thread {
    //Atributos
    private int x, y, n=0;
    
    //Constructor
    public PrimosThread(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //Métodos
    private boolean esPrimo(int n) {
        int raiz = (int) Math.sqrt((double) n);
        boolean primo = true;
        int i = 2;
        while (primo && i <= raiz) {
            if (n % i == 0) 
                primo = false;
            i++;
        }
        return primo;
    }
    
    public void run() {
        long t0 = (new Date()).getTime();
        for (int i = x; i <= y; i++) {
            if (esPrimo(i))
                n++;
        }
        long t1 = (new Date()).getTime();
        System.out.println("El hilo que calcula de " + x + " a " + y + " tarda "
                + (t1-t0) + " milisegundos");
    }
    
    public int cuantos() {
        return n;
    }
}
