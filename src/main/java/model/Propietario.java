/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;


/**
 *
 * @author yusti
 */
public class Propietario extends Persona{
    private double salario;
    private String profesion;
    private ArrayList<Multa> multas;

    public Propietario(double salario, String profesion, String nombre, String email, String celular, String id) {
        super(nombre, email, celular, id);
        this.salario = salario;
        this.profesion = profesion;
    }
    
    
}
