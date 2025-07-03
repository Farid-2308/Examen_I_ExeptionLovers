/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Evaluaciones;

import Docentes.Docentes;

/**
 *
 * @author Farid
 */
public class Evaluacion {
    public Docentes Docente;
    public String curso;
    public int nota[];
    public String observaciones;
    
    public String EvaluacionSatisfactoria() {
        for (int i = 0; i < 100; i++) {
            if (nota[i] > 8){
                 return "La evaluacion se considera satisfactoria";
            }
         }
        return "La evaluacion no es satisfactoria";
    } 

    public Docentes getDocente() {
        return Docente;
    }

    public String getCurso() {
        return curso;
    }

    public int[] getNota() {
        return nota;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


    

    public Evaluacion(Docentes Docente, String curso, int nota, String observaciones) {

        this.Docente = Docente;
        this.curso = curso;
       
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Evaluacion{" + "Docente=" + Docente + ", curso=" + curso + ", nota=" + nota + ", observaciones=" + observaciones + '}';
    }
    
}
