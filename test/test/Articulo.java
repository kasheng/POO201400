/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author pciscflo
 */
class Articulo {
    private String codigo;
    private String descripcion;
    private double precioUnitario;

    Articulo(String codigo, String descripcion, double precioUnitario) {
       this.codigo = codigo;
       this.descripcion = descripcion;
       this.precioUnitario = precioUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
}
