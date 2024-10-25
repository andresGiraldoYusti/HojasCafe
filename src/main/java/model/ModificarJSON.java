/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import controller.ModificarJSONIF;

/**
 *
 * @author yusti
 */
public class ModificarJSON implements ModificarJSONIF {
    private String file;
    private JSONArray jsonPropietarios;

    public ModificarJSON(String file) {
        this.file = file;
    }
    
    
    
    @Override
    public JSONArray leerJSON(String llave) {
        try {
            String content = Files.readString(Paths.get(file));
            JSONObject json = new JSONObject(content);
            jsonPropietarios = json.getJSONArray(llave);
            System.out.println("El archivo se leyo de manera correcta.");
            return jsonPropietarios;
        } catch (IOException e){
            System.out.println("Ocurrio un error: " + e);
        }
        return null;
    }
    
    @Override
    public void escribirJSON(JSONArray propietarios, JSONArray empleados) {
        try {
            JSONArray p = new JSONArray();
            JSONArray e = new JSONArray();
            JSONObject jsonFinal = new JSONObject();
            p.put(propietarios);
            e.put(empleados);
            jsonFinal.put("propietarios", propietarios).put("empleados", empleados);
            Files.write(Paths.get(file), jsonFinal.toString(2).getBytes());
            System.out.println("Archivo JSON creado exitosamente en " + file);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo " + e);
        }
    }
}

