public class StaticTest {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona();
        p1.setNombre("gonzalo");
        p1.setApellido1("rodriguez de dios cabrera");
        p1.setApellido2("cabrera");
        System.out.println("persona p1: " + p1);

        Persona p2 = new Persona("nono", "ortiz", "carames");
        System.out.println("persona p2: " + p2);

        System.out.println("total personas : " + Persona.getContPersonas());
    }
}
