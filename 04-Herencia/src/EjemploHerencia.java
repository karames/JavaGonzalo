import java.time.LocalDate;

/**
 * uso de herencia
 *
 * @author Gonzalo Rodriguez de Dios
 */
public class EjemploHerencia {
    public static void main(String[] args) throws Exception {
        // Objeto persona1 - constructor vacío
        Persona persona1 = new Persona();
        System.out.println("Estado inicial Persona1");
        System.out.println(persona1);
        persona1.setNombre("Gonzalo");
        persona1.setGenero('M');
        persona1.setEdad(27);
        persona1.setDireccion("Avda Ruiz Jiménez, 7");
        System.out.println("Estado actualización Persona1");
        System.out.println(persona1);

        // Objeto persona2 - constructor con todos los parámetros
        Persona persona2 = new Persona("Cristina", 'M', 33, "Fuente del Alamillo, 19");
        System.out.println("\nEstado inicial Persona2");
        System.out.println(persona2);

        // Objeto empleado1 - constructor vacío
        Empleado empleado1 = new Empleado();
        System.out.println("\nEstado inicial Empleado1");
        System.out.println(empleado1);
        empleado1.setNombre("Armando");
        empleado1.setGenero('H');
        empleado1.setEdad(50);
        empleado1.setDireccion("C/ Melancolía, 13");
        empleado1.setSueldo(25000);
        System.out.println("Estado actualización Empleado1");
        System.out.println(empleado1);

        // Objeto empleado2 - constructor con todos los argumentos
        Empleado empleado2 = new Empleado("Mario", 'H', 30, "C/ Sega", 15000);
        System.out.println("\nEstado inicial Empleado2");
        System.out.println(empleado2);

        // Total empleados
        System.out.println("\nTotal Empleados: " + Empleado.getContadorEmpleados());

        // Cliente cliente1 = new Cliente(new Date(), false);
        Cliente cliente1 = new Cliente(LocalDate.now(), false);
        System.out.println("\nEstado actual Cliente1");
        System.out.println(cliente1);
        cliente1.setNombre("Gustavo");
        cliente1.setEdad(22);
        cliente1.setGenero('H');
        cliente1.setDireccion("C/ Salsipuedes, 13");
        System.out.println("\nEstado actualización Cliente1");
        System.out.println(cliente1);

        // Total clientes
        System.out.println("\nTotal Clientes: " + Cliente.getContadorClientes());
    }
}
