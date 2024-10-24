/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import org.json.JSONArray;

import controller.ValidacionesJSONIF;

/**
 *
 * @author yusti
 */
public class ValidacionesJSON implements ValidacionesJSONIF {
    JSONArray jsonArray;

    public ValidacionesJSON(JSONArray jsonArray) {
        this.jsonArray = jsonArray;
    }
    
    @Override
    public int validar(String usuario, String llave) {
        for (int i = 0; i < jsonArray.length(); i++) {
            if (jsonArray.getJSONObject(i).get(llave).equals(usuario)) return i;
        }
        return -1;
    }
    
    @Override
    public Propietario modelarUsuario(String usuario, String contraseña) {
        int user = validar(usuario, "usuario");
        int pw = validar(contraseña, "contraseña");
        if ( user != -1 && pw != -1) return new Propietario(
                jsonArray.getJSONObject(user).getDouble("salario"),
                jsonArray.getJSONObject(user).getString("profesion"),
                jsonArray.getJSONObject(user).getString("nombre"),
                jsonArray.getJSONObject(user).getString("email"),
                jsonArray.getJSONObject(user).getString("celular"),
                jsonArray.getJSONObject(user).getString("id"));
        return null;
    }
    
    
}
