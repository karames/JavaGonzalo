package es.gonzalo.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadoresOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        idOrden = ++contadoresOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        if (contadorComputadoras < MAX_COMPUTADORAS) {
            computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("se ha superado el maximo de productos: " + MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden # " + idOrden + " #");
        System.out.println("computadoras de esta orden");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }

}
