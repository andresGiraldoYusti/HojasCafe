/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author andres.giraldoy
 */
public class Empleado extends Persona{
    private String cargo;
    private LocalDate fechaInicio;
    private double calificacion;

    public Empleado(String cargo, LocalDate fechaInicio, double calificacion, String nombre, String email, String celular, String id) {
        super(nombre, email, celular, id);
        this.cargo = cargo;
        this.fechaInicio = fechaInicio;
        this.calificacion = calificacion;
    }

    public String getCargo() {
        return cargo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public double getCalificacion() {
        return calificacion;
    }
    
    
    
}
