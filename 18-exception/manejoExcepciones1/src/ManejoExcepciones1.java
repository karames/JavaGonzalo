public class ManejoExcepciones1 {
    public static void main(String[] args) {
        try {
            Division division = new Division(10, 0);
            division.visualizarOperacion();
        } catch (OperationException oe) {
            System.out.println("ocurrio un error");
            oe.printStackTrace();
        }
        // System.out.println("");
    }
}
