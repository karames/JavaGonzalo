public class ImplementacionMySql implements AccesoDatos {
    private boolean simularError;

    @Override
    public void insertar() throws AccesoDatosEx {
        if (simularError) {
            throw new EscrituraDatosEx("error de escritura de datos");
        } else {
            System.out.println("insertar datos desde mySQL");
        }
    }

    public void listar() throws AccesoDatosEx {
        if (simularError) {
            throw new LecturaDatosEx("error de lectura de datos");
        } else {
            System.out.println("insertar datos desde mySQL");
        }
    }

    public boolean isSimularError() {
        return simularError;
    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }
}
