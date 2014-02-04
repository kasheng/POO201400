/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pciscflo
 */
class FacturaCabecera {
    private String nombreEmpresa;
    private String rucEmpresa;
    private Date fechaEmision;
    private String nroFactura;
    private Cliente cliente;
    private ArrayList<FacturaDetalle> facturaDetalles = new ArrayList<>();
    
    public FacturaCabecera(String nombreEmpresa, String rucEmpresa, Date fecha, 
                                 String nroFactura, Cliente cliente) {
        this.nombreEmpresa = nombreEmpresa;
        this.rucEmpresa = rucEmpresa;
        this.fechaEmision = fecha;
        this.nroFactura = nroFactura;
        this.cliente = cliente;
    }

    public void adicionarDetalle(FacturaDetalle facturaDetalle) {
        this.facturaDetalles.add(facturaDetalle);
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRucEmpresa() {
        return rucEmpresa;
    }

    public void setRucEmpresa(String rucEmpresa) {
        this.rucEmpresa = rucEmpresa;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(String nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<FacturaDetalle> getFacturaDetalles() {
        return facturaDetalles;
    }

    public void setFacturaDetalles(ArrayList<FacturaDetalle> facturaDetalles) {
        this.facturaDetalles = facturaDetalles;
    }

    public Articulo buscaArticulo(String codigo) {
        for(FacturaDetalle p:this.facturaDetalles)
        {
            if(p.getArticulo().getCodigo().equals(codigo))
            {
                return p.getArticulo();                
            }
        }
        return null;
    }
    
    
}
