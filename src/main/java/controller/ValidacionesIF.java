/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import org.json.JSONArray;

/**
 *
 * @author andres.giraldoy
 */
public interface ValidacionesIF {
    public boolean comprarRegistroPropietario();
    public boolean compararRegistroMulta();
    public int buscarUsuario(JSONArray propietarios);
}
