package ContarPrimos;

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
        for (int i = x; i <= y; i++) {
            if (esPrimo(i))
                n++;
        }
    }
    
    public int cuantos() {
        return n;
    }
}
