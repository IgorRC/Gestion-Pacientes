package modelo;

/**
 *
 * @author igorr
 */
public class Paciente {
    private String DNI;
    private String nombre;
    private String apellido;
    private Integer edad;

    public Paciente() {
    }

    public Paciente(String DNI, String nombre, String apellido, Integer edad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Paciente{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    
}
