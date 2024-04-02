public class ManejoExceptionArg {

    public static void main(String[] args) throws OperationException {
        try {
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);
            Division division = new Division(op1, op2);
            division.visualizarOperacion();

        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("ocurrion una excepcion");
            System.out.println("error al haceder ha un elemento fuera de rango");
            aie.printStackTrace();

        } catch (NumberFormatException nbe) {
            System.out.println("ocurrion una excepcion");
            System.out.println("uno de los argumentos no es entero");
            nbe.printStackTrace();

        } catch (OperationException oe) {
            System.out.println("ocurrio una exceotion ");
            System.out.println("se trato de realizar una operacion erronea");
            oe.printStackTrace();

        } finally {
            System.out.println("se revisaron todas las excepciones");
        }
    }

}
