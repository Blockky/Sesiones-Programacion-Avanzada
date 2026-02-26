package VentanaColores;
import java.awt.Color;
import javax.swing.JButton;

/**
 * @author Blocky
 */
public class Pintor extends Thread {
    //Atributos
    JButton b;
    Color paleta[] = new Color[5];
    
    //Constructor
    public Pintor(JButton b) {
        this.b = b;
        paleta[0] = Color.BLACK;
        paleta[1] = Color.RED;
        paleta[2] = Color.GREEN;
        paleta[3] = Color.BLUE;
        paleta[4] = Color.YELLOW;
    }
    
    //Métodos
    public void run() {
        while (true) {
            b.setBackground(paleta[0]);
            int t = (int)(2000. * Math.random()) + 2000;
            try {
                sleep(t);
            } catch (Exception e) {}
            int i = (int)(5. * Math.random());
            b.setBackground(paleta[i]);
            int t2 = (int)(2000. * Math.random()) + 3000;
            try {
                sleep(t2);
            } catch (Exception e) {}
        }
    }
}
