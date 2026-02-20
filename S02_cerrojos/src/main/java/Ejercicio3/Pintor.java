package Ejercicio3;
import java.awt.Color;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.*;

/**
 *
 * @author Blocky
 */
public class Pintor extends Thread {
    //Atributos
    private JButton b;
    private Paleta p;
    private Color negro = Color.black;
    Lock cerrojo = new ReentrantLock();
    
    //Constructor
    public Pintor(JButton b, Paleta p) {
        this.b = b;
        this.p = p;
    }
    
    //Métodos
    public void run() {
        long tiempoEnNegro = 0;
        long tiempoEnColor = 0;
        
        while(true) {
            tiempoEnNegro = (long) 2000 + (int)((4000-2000)*Math.random());
            tiempoEnColor = (long) 3000 + (int)((5000-3000)*Math.random());
            b.setBackground(negro);
            try {
                sleep(tiempoEnNegro);
            } catch(InterruptedException e) {}
            cerrojo.lock();
            try {
                b.setBackground(p.tomaColor());
                try {
                    sleep(tiempoEnColor);
                } catch(InterruptedException e){}
            } finally {
                cerrojo.unlock();
            }
        }
    }
}
