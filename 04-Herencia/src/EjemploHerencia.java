/**
 * uso de herencia
 *
 * @author Gonzalo Rodriguez de dios
 */
public class EjemploHerencia {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona();
        System.out.println(p1);
        p1.setNombre("Gonzalo");
        p1.setGenero('M');
        p1.setEdad(27);
        p1.setDireccion("Av.ruiz");
        System.out.println(p1);

    }
}
