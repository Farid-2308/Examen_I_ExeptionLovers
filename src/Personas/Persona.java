/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author Student
 */
public abstract class Persona {
    protected String cedula;
    public String nombre;

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{"+" nombre=" + nombre + '}';
    }
    
}
