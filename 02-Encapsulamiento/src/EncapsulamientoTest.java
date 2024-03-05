public class EncapsulamientoTest {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona("Gonzalo", "Rodriguez de dios", false);
        System.out.println("estado objeto p1: " + p1);
        System.out.println("nombre objeto p1: " + p1.getNombre());

        Persona p2 = new Persona("Nono", "Karames", false);
        System.out.println("estado objeto p2: " + p2);
        p2.setBorrado(true);
        System.out.println("estado objeto p2: " + p2);

        Persona p3 = new Persona();
        System.out.println("estado objeto p3: " + p3);

    }
}
