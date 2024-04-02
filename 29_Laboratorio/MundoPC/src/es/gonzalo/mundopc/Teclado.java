package es.gonzalo.mundopc;

public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idTeclado = ++contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado [idTeclado=" + idTeclado + "]" + " " + super.toString();
    }

    public int getidTeclado() {
        return idTeclado;
    }

    public static int getcontadorTeclados() {
        return contadorTeclados;
    }
}
