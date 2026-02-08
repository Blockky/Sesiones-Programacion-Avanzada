public class PruebaCabinaPeaje {

    public static void main(String args[]) {
        //Crea el agente
        Agente agente1 = new Agente("12345678Z", "Juan García");
        Agente agente2 = new Agente("23456789D", "María Perez");
        //Crea las cabinas
        CabinaPeaje cabina1 = new CabinaPeaje("C1", agente1);               
        CabinaPeaje cabina2 = new CabinaPeaje("C2", agente2);
        //Crea distintos vehículos
        Vehiculo v1 = new Camion("1234-BCD", 10000, 3);
        Vehiculo v2 = new Camion("2345-CDF", 15500, 4);
        Vehiculo v3 = new Autobus("5678-CFG", 7000, 35);
        Vehiculo v4 = new Autobus("6789-DTD", 8000, 50);

        //Cobra peajes
        cabina1.calculaPeaje(v1);
        cabina1.calculaPeaje(v3);
        cabina1.muestraDatos();
        cabina2.calculaPeaje(v2);
        cabina2.calculaPeaje(v4);
        cabina2.muestraDatos();
        //Recauda
        cabina1.recaudar();
        cabina1.muestraDatos();
        cabina2.recaudar();
        cabina2.muestraDatos();
        System.out.println("Total vehículos de todas las cabinas: " + Vehiculo.getCantidad());
        Vehiculo.borraCantidad();
    }
}
