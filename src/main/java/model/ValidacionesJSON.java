/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import org.json.JSONArray;
import java.util.ArrayList;

import controller.ValidacionesJSONIF;
import java.time.LocalDate;

/**
 *
 * @author yusti
 */
public class ValidacionesJSON implements ValidacionesJSONIF {
    JSONArray jsonArrayUsuarios;
    JSONArray jsonArrayEmpleados;

    public ValidacionesJSON(JSONArray jsonArrayUsuarios, JSONArray jsonArrayEmpleados) {
        this.jsonArrayUsuarios = jsonArrayUsuarios;
        this.jsonArrayEmpleados = jsonArrayEmpleados;
    }
    
    @Override
    public int validar(String usuario, String llave, String tipoUsuario) {
        if (tipoUsuario.equals("propietario")) {
            for (int i = 0; i < jsonArrayUsuarios.length(); i++) {
                if (jsonArrayUsuarios.getJSONObject(i).get(llave).equals(usuario)) return i;
            }
        } else {
            for (int i = 0; i < jsonArrayEmpleados.length(); i++) {
                if (jsonArrayEmpleados.getJSONObject(i).get(llave).equals(usuario)) return i;
            }
        }
        return -1;
    }
    
    @Override
    public Propietario modelarUsuario(String usuario, String contraseña) {
        int user = validar(usuario, "usuario", "propietario");
        int pw = validar(contraseña, "contraseña", "propietario");
        
        if ( user != -1 && pw != -1) {
            JSONArray multas = jsonArrayUsuarios.getJSONObject(user).getJSONArray("multas");
            ArrayList<Multa> listaMultas = new ArrayList<Multa>();
            if (multas.length() > 0) {
                for (int i = 0; i < multas.length(); i++) {
                    listaMultas.add(new Multa(
                        multas.getJSONObject(i).getString("idMulta"),
                        LocalDate.parse(multas.getJSONObject(i).getString("fechaMulta")),
                        LocalDate.parse(multas.getJSONObject(i).getString("fechaEvento")),
                        multas.getJSONObject(i).getString("lugar"),
                        multas.getJSONObject(i).getString("descripcion"),
                        multas.getJSONObject(i).getDouble("valor"),
                        multas.getJSONObject(i).getString("mensaje"),
                        multas.getJSONObject(i).getString("evidencia")
                    ));
                }
            }
            return new Propietario(
                jsonArrayUsuarios.getJSONObject(user).getDouble("salario"),
                jsonArrayUsuarios.getJSONObject(user).getString("profesion"),
                jsonArrayUsuarios.getJSONObject(user).getString("nombre"),
                jsonArrayUsuarios.getJSONObject(user).getString("email"),
                jsonArrayUsuarios.getJSONObject(user).getString("celular"),
                jsonArrayUsuarios.getJSONObject(user).getString("id"),
                listaMultas);
        }
        return null;
    }
    
    @Override
    public Empleado modelarEmpleado(String usuario, String contraseña) {
        int user = validar(usuario, "usuario", "empleado");
        int pw = validar(contraseña, "contraseña", "empleado");
        if ( user != -1 && pw != -1) return new Empleado(
                jsonArrayEmpleados.getJSONObject(user).getString("cargo"),
                LocalDate.parse(jsonArrayEmpleados.getJSONObject(user).getString("fechaInicio")),
                jsonArrayEmpleados.getJSONObject(user).getDouble("calificacion"),
                jsonArrayEmpleados.getJSONObject(user).getString("nombre"),
                jsonArrayEmpleados.getJSONObject(user).getString("email"),
                jsonArrayEmpleados.getJSONObject(user).getString("celular"),
                jsonArrayEmpleados.getJSONObject(user).getString("id"));
        return null;
    }
    
    
}
