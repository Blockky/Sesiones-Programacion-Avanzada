package Ejercicio3;
import java.util.Date;

/**
 * @author Blocky
 */
public class Sumador extends Thread {
    private char tarea;
    private int suma = 0, i = 0;;
    private long t0 = 0, t1 = 0;
    
    public Sumador(char tarea) {
        this.tarea = tarea;
    }
    
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
        switch(tarea) {
            case 'A':
                t0 = (new Date()).getTime();
                i = 7;
                while(i <= 10000) {
                    suma += i;
                    i += 7;
                }
                t1 = (new Date()).getTime();
                System.out.println("La suma A da: " + suma + "; y tarda "
                + (t1-t0) + " milisegundos");
                break;
                
            case 'B':
                t0 = (new Date()).getTime();
                for(i = 1; i <= 10000; i++) {
                    if(i%10==3 || i%10==5)
                        suma += i;
                }
                t1 = (new Date()).getTime();
                System.out.println("La suma B da: " + suma + "; y tarda "
                + (t1-t0) + " milisegundos");
                break;
                
            case 'C':
                t0 = (new Date()).getTime();
                    for(i = 1; i <= 10000; i++) {
                        if (esPrimo(i))
                            suma += i;
                    }
                t1 = (new Date()).getTime();
                System.out.println("La suma C da: " + suma + "; y tarda "
                + (t1-t0) + " milisegundos");
                break;
        }
    }
    
    public int resultado() {
        return suma;
    }
}
