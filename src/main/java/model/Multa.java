/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author yusti
 */
public class Multa {
    private String idMulta;
    private LocalDate fechaMulta;
    private LocalDate fechaEvento;
    private String lugar;
    private String descripcion;
    private double valor;
    private LocalDate fechaMaxima;
    private String mensaje;
    private String evidencia;

    public Multa(String idMulta, LocalDate fechaMulta, LocalDate fechaEvento, String lugar, String descripcion, double valor, String mensaje, String evidencia) {
        this.idMulta = idMulta;
        this.fechaMulta = fechaMulta;
        this.fechaEvento = fechaEvento;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.valor = valor;
        this.mensaje = mensaje;
        this.evidencia = evidencia;
        
        
    }

    public String getIdMulta() {
        return idMulta;
    }

    public LocalDate getFechaMulta() {
        return fechaMulta;
    }

    public LocalDate getFechaEvento() {
        return fechaEvento;
    }

    public String getLugar() {
        return lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getFechaMaxima() {
        return fechaMaxima;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getEvidencia() {
        return evidencia;
    }
    
}
