/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.ModificarCSVIF;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yusti
 */
public class ModificarCSV implements ModificarCSVIF {
    
    
    @Override
    public List<String[]> leerArchivo() {
        try (CSVReader csvReader = new CSVReader(new FileReader("DataBase/DBZonasComunes.csv"))){
            List<String[]> registros = csvReader.readAll();
            return registros;
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + e);
        } catch (CsvException ex) {
            Logger.getLogger(ModificarCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
