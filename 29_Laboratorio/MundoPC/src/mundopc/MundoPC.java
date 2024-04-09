package mundopc;

import es.gonzalo.mundopc.Computadora;
import es.gonzalo.mundopc.Monitor;
import es.gonzalo.mundopc.Orden;
import es.gonzalo.mundopc.Raton;
import es.gonzalo.mundopc.Teclado;

public class MundoPC {
    public static void main(String[] args) throws Exception {
        // CREAR COMPUTADORA TOSHIBA
        Monitor monitorToshiba = new Monitor("Toshiba", 13);
        Teclado tecladoToshiba = new Teclado("bluetooth", "Toshiba");
        Raton ratonToshiba = new Raton("bluetooth", "Toshiba");
        Computadora computadoraToshiba = new Computadora(
                "Computadora Toshiba", monitorToshiba, tecladoToshiba, ratonToshiba);

        // crear computadora dell
        Monitor monitorDell = new Monitor("Dell", 16);
        Teclado tecladoDell = new Teclado("USB", "Dell");
        Raton ratonDell = new Raton("USB", "Dell");
        Computadora computadoraDell = new Computadora(
                "Computadora Dell", monitorDell, tecladoDell, ratonDell);

        // CREAR COMPUTADOORA PEERSDONALIZADA
        Computadora computadoraPersonalizada = new Computadora(
                "Computadora Personalizada", monitorToshiba, tecladoDell, ratonDell);

        // crear orden 1
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraToshiba);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraPersonalizada);

        orden1.mostrarOrden();

    }

}
