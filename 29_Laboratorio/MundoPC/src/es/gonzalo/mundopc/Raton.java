package es.gonzalo.mundopc;

public class Raton extends DispositivoEntrada {
    private int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton [idRaton=" + idRaton + "]" + " " + super.toString();
    }

    public int getIdRaton() {
        return idRaton;
    }

    public static int getContadorRatones() {
        return contadorRatones;
    }

}
