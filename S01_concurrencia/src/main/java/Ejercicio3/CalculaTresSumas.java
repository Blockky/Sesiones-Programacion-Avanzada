package Ejercicio3;
import java.util.Date;

/**
 * @author Blocky
 */
public class CalculaTresSumas {
    public static void main(String[] args) {
        
        long t0 = (new Date()).getTime();
        
        Sumador a = new Sumador('A');
        Sumador b = new Sumador('B');
        Sumador c = new Sumador('C');

        a.start();
        b.start();
        c.start();
        
        try {
            a.join(); b.join(); c.join();
        } catch (InterruptedException e) {}
        
        int n = a.resultado() + b.resultado() + c.resultado();
        
        long t1 = (new Date()).getTime();
           System.out.println("Suma de los tres resultados de A, B y C: " + n
            + " calculado en " + (t1-t0) + " milisegundos.");
    }
        
}
