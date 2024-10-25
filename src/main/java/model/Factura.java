/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yusti
 */
public class Factura {
    private String idFactura;
    private double valorAdministracion;
    private Propietario propietario;
    private String informacion;

    public Factura(String idFactura, Propietario propietario, String informacion) {
        this.idFactura = idFactura;
        this.propietario = propietario;
        this.informacion = informacion;
        this.valorAdministracion = this.propietario.getSalario()*0.2;
    }
    
    public String generarFactura() {
        String multasString = "";
        double totalValorMultas = 0;
        for (int i = 0; i < propietario.getMultas().size(); i++) {
            multasString += "\nLa multa con id: " + propietario.getMultas().get(i).getIdMulta() + " con motivo: "
                    + propietario.getMultas().get(i).getDescripcion() + " Tiene un precio a pagar de: "
                    + propietario.getMultas().get(i).getValor() + "\n\n";
            totalValorMultas += propietario.getMultas().get(i).getValor();
        }
        return "Señor propietari@ " + propietario.getNombre() + "\nSe le informa que debe de pagar " + valorAdministracion + " Por la administracion\n\nTambien se le notifica que tiene " + propietario.getMultas().size()
                + " multas pendientes por pagar y son:\n" + multasString + "\n\nEn resumen su total a pagar es de: "
                + (valorAdministracion + totalValorMultas);
    }
    
    
}
