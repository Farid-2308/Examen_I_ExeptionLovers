package Docentes;
import Personas.Persona;

  public class Docentes extends Persona {
    private String departamento;
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Docentes(int cedula, String nombre, String departamento) {
        
        this.nombre = nombre;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Docentes{" + "departamento=" + departamento + '}';
    }
    
    
    }  
