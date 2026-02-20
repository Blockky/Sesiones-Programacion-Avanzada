package Ejercicio2;
import java.math.BigInteger;
import java.util.concurrent.locks.*;

/**
 *
 * @author Blocky
 */
public class Resultado {
    //Atributos
    private BigInteger suma = new BigInteger("0");
    Lock cerrojo = new ReentrantLock();
    
    //Métodos
    public BigInteger getSuma() {
        return suma;
    }
    
    public void sumar(int n) {
        cerrojo.lock();
        try {
            BigInteger bn = new BigInteger(String .valueOf(n));
            suma = suma.add(bn);
        } finally {
            cerrojo.unlock();
        }
    }
}
