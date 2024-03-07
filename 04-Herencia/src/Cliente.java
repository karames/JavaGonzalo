import java.time.LocalDate;

public class Cliente extends Persona {
    private int idCliente;
    private LocalDate fechaRegistro;
    private boolean vip;
    private static int contadorClientes;

    public Cliente(LocalDate fechaRegistro, boolean vip) {
        this.idCliente = ++contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getContadorClientes() {
        return contadorClientes;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Cliente [idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + "]";
    }
}
