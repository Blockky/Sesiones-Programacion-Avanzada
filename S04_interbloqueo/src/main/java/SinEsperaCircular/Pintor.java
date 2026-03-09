package SinEsperaCircular;
import java.awt.Color;
import javax.swing.JButton;

/**
 * @author Blocky
 */
public class Pintor extends Thread {
    private JButton b;
    private Paleta p;
    private int numPintor;
    private Color negro = Color.black;

    public Pintor(JButton b, Paleta p, int numPintor) {
        this.b=b;
        this.p=p;
        this.numPintor = numPintor;
    }

    public void run() {
        while(true) {
            b.setBackground(negro);
            try {
                sleep((int)(200*Math.random()));
            } catch (InterruptedException e){ }

            Color uno = p.tomaColor(numPintor);
            b.setBackground(uno);
            try {
                sleep((int)(50*Math.random()));
            } catch (InterruptedException e) {}
            
            Color dos = p.tomaColor(numPintor+1);
            Color mezcla = p.mezclaColores(uno, dos);
            b.setBackground(mezcla);
            try {
                sleep((int)(100*Math.random()));
            } catch (InterruptedException e) {}

            p.dejaColor(numPintor);
            p.dejaColor(numPintor+1);
        }
    }
    
}
