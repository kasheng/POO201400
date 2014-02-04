/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author pciscflo
 */
class FacturaDetalle {
    private int nroItem;
    private int cantidad;
    private Articulo articulo;
    
    FacturaDetalle(int nroItem, int cantidad, Articulo articulo) {
        this.nroItem = nroItem;
        this.cantidad=cantidad;
        this.articulo = articulo;
    }

    double calcularSubTotal() {
       return (cantidad*articulo.getPrecioUnitario());
    }

    public int getNroItem() {
        return nroItem;
    }

    public void setNroItem(int nroItem) {
        this.nroItem = nroItem;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    
    
}
