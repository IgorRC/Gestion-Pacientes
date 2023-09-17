package aplicacion;

import controlador.RegistroPacienteControlaor;
import vista.FormularioPaciente;
import vista.Home;

/**
 *
 * @author igorr
 */
public class App {
    public static void main(String[] args) {
        Home home = new Home();
        FormularioPaciente formularioPaciente = new FormularioPaciente();
        
        RegistroPacienteControlaor registroPaciente = new RegistroPacienteControlaor(home, formularioPaciente);
    }
}
