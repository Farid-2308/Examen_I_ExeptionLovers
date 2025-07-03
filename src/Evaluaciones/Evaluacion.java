/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Evaluaciones;

/**
 *
 * @author Farid
 */
public class Evaluacion {
    public Docente Docente;
    public String curso;
    public int nota;
    public String observaciones;
    
    public String EvaluacionSatisfactoria() {
         if (nota > 8){
             return "La evaluacion se considera satisfactoria";
         }
         return "La evaluacion no es satisfactoria";
    } 

    public Docente getDocente() {
        return Docente;
    }

    public String getCurso() {
        return curso;
    }

    public int getNota() {
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

    public Evaluacion(Docente Docente, String curso, int nota, String observaciones) {
        this.Docente = Docente;
        this.curso = curso;
        this.nota = nota;
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Evaluacion{" + "Docente=" + Docente + ", curso=" + curso + ", nota=" + nota + ", observaciones=" + observaciones + '}';
    }
    
}
