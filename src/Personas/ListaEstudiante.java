
package Personas;

import Listas.Lista;

public class ListaEstudiante implements Lista{
    
    
    @Override
    public boolean find(Object nombre){
        
        
        return false;
        
        
    }
    @Override
    public boolean add(Object t){
        
        return false;
        
    }
    @Override
    public boolean remove(Object t){
        
        return false;
        
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
