/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cursos;

import Docentes.Docentes;

/**
 *
 * @author Farid
 */
public class Curso {
    public int codigo;
    public String nombre;
    public String grupo;
    public Docentes Docentes;

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public Docentes getDocente() {
        return Docentes;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Curso(int codigo, String nombre, String grupo, Docentes Docentes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.grupo = grupo;
        this.Docentes = Docentes;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + ", grupo=" + grupo + ", Docente=" + Docentes + '}';
    }
    
}
