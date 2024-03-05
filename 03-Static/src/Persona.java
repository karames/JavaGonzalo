public class Persona {

    // Atributos
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int id;
    private static int contPersonas;

    public Persona() {
        contPersonas++;
        id = contPersonas;
    }

    public Persona(String nombre, String apellido1, String apellido2) {
        contPersonas++;
        id = contPersonas;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getId() {
        return id;
    }

    public static int getContPersonas() {
        return contPersonas;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", id=" + id
                + "]";
    }

}
