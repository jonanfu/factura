/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

import java.util.Date;

/**
 *
 * @author Jonathan
 */
public class DatosComprador {
    private String numeroFactura;
    private String nombreCliente;
    private String Direccion;
    private String fecha;
    private String identificacion;

    public DatosComprador() {
    }

    public DatosComprador(String numeroFactura, String nombreCliente, String Direccion, String fecha, String identificacion) {
        this.numeroFactura = numeroFactura;
        this.nombreCliente = nombreCliente;
        this.Direccion = Direccion;
        this.fecha = fecha;
        this.identificacion = identificacion;
    }

   
    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

       
}
