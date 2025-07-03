package Cursos;
//Debe retornar la lista de cursos impartidos por un docente especifico.

import Listas.Lista;
public class ListaCurso implements Lista {

    @Override
    public boolean find(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean add(Object t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean remove(Object t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
     
      String[] cursos;
      String docente;
      
      public String[] CursosDocente(String docentes){
      if (docente.equals(docentes) ){
          return cursos;
    }   
     return null;
      }
}