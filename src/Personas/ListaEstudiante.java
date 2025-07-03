
package Personas;

import Listas.Lista;

public class ListaEstudiante {
    
    
    public Lista find(Object nombre){
        
        return null;
    }
    public Lista add(Estudiante t){
        
        return null;
        
    }
    public Lista remove(Estudiante t){
        
        return null;
        
    }
    
    public String estudiantesCursos(Estudiante estudiantes[]) {
        Estudiante idt;
        for (int i = 0; i < 100; i++) {
            if (estudiantes[i].getCarrera().matches(estudiantes[i++].getCarrera())) {
                idt=estudiantes[i];
                estudiantes[i]=idt;
                System.out.println(estudiantes[i]);
            }
        }
        return null;
        
    }
}
