/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import model.Propietario;
import model.Empleado;

/**
 *
 * @author yusti
 */
public interface ValidacionesJSONIF {
    public int validar(String usuario, String llave, String tipoUsuario);
    public Propietario modelarUsuario(String usuario, String contraseña);
    public Empleado modelarEmpleado(String usuario, String contraseña);
}
