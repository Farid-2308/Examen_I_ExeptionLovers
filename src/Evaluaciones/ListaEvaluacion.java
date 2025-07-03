/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Evaluaciones;
import Docentes.Docentes;
import Listas.Lista;

/**
 *
 * @author Farid
 */
public class ListaEvaluacion implements Lista {
    
    public int notas[];
    
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

    public int PromedioDocente(Docentes Docentes) {
        for (int i = 0; i < 100; i++) {
            return notas[i];
            }
        return notas[1];
    }
    
}