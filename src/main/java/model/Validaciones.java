/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.ValidacionesIF;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author andres.giraldoy
 */
public class Validaciones implements ValidacionesIF {

    ArrayList<String> datos;

    public Validaciones(ArrayList<String> datos) {
        this.datos = datos;
    }

    public boolean compararStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public boolean comprarStringVacio(String str) {
        return str.equals("");
    }

    @Override
    public boolean comprarRegistroPropietario() {
        System.out.println("Comenzaron las validaciones.");
        for (int i = 0; i < datos.size(); i++) {
            if (comprarStringVacio(datos.get(i))) {
                JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
        if (!compararStrings(datos.get(7), datos.get(8))) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }
}
