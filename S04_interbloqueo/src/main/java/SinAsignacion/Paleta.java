package SinAsignacion;
import java.awt.Color;

/**
 * @author Blocky
 */
public class Paleta {
    private Color[] colores = new Color[4];
    private boolean[] ocupado = new boolean[4];
    
    public Paleta() {
        colores[0] = new Color(128,0,0,255);
        colores[1] = new Color(128,0,128,255);
        colores[2] = new Color(0,0,128,255);
        colores[3] = new Color(128,128,0,255);
        
        for(int i=0; i<4; i++) {
            ocupado[i] = false;
        }
    }
    
    public synchronized Color tomaColor(int n) {
        int i=n%4;
        while(ocupado[i]) {
            try {
                wait();
            } catch(InterruptedException e) {}
        }
        ocupado[i]=true;

        return colores[i];
    }
    
    public synchronized void dejaColor(int n) {
        int i=n%4;
        ocupado[i] = false;
        notifyAll();
    }
    
    public Color mezclaColores(Color x, Color y) {
        Color colorMezclado;
        
        int mezclaRojo = x.getRed()+y.getRed();
        int mezclaVerde = x.getGreen()+y.getGreen();
        int mezclaAzul = x.getBlue()+y.getBlue();
        
        if(mezclaRojo>255)
            mezclaRojo=255;
        if(mezclaVerde>255)
            mezclaVerde=255;
        if(mezclaAzul>255)
            mezclaAzul=255;
        
        colorMezclado = new Color (mezclaRojo, mezclaVerde, mezclaAzul, 255);
        return colorMezclado;
    }
}