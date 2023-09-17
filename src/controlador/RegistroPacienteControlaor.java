package controlador;

import modelo.Paciente;
import vista.FormularioPaciente;
import vista.Home;

/**
 *
 * @author igorr
 */
public class RegistroPacienteControlaor {
    private Home home;
    private FormularioPaciente formularioPaciente;
    
    public RegistroPacienteControlaor(Home home, FormularioPaciente formularioPaciente){
        this.home = home;
        this.formularioPaciente = formularioPaciente;
        
        //eventos
        home.getAgregarBtn().addActionListener((e) -> {
            formularioPaciente.setLocationRelativeTo(home);
            formularioPaciente.setVisible(true);         
        });
        
        formularioPaciente.getAceptarBtn().addActionListener((e) -> {
            agregarPaciente(home, formularioPaciente);
        });
        
        
    }
    
    private void agregarPaciente(Home home, FormularioPaciente formularioPaciente){
        Paciente paciente = formularioPaciente.getDatoPaciente();
        // control de datos vacios
        home.insertarDatoTabla(paciente);
        formularioPaciente.limpiarFormulario();
        formularioPaciente.closeFormulario();
        
    }
    
    
    
    
}
