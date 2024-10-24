/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yusti
 */
public class Persona {
    private String nombre;
    private String email;
    private String celular;
    private String id;

    public Persona(String nombre, String email, String celular, String id) {
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public String getId() {
        return id;
    }
    
    
    
    
}
