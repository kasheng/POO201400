/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pciscflo
 */
public class TestFacturas {
    
    public TestFacturas() {
    }
    @Test
    public void testSubtotal()
    {
        Articulo articulo = new Articulo("A2330","Laptop Toshiba 3455X",1280.00);
        FacturaDetalle facturaDetalle = new FacturaDetalle(1,10,articulo);
        double subtotal = 0;
        subtotal = facturaDetalle.calcularSubTotal();
        assertEquals(1280*10, subtotal,0.00);        
    }
    @Test
    public void crearFacturaCabecera()
    {
        Cliente cliente = new Cliente("Pedro Perez", "10075770251","San Isidro");
        
        FacturaCabecera facturaCabecera = new 
                FacturaCabecera("Atenea S.A.", "2025478888", new Date(), "003", cliente);
        
         Articulo articulo = new Articulo("A2330","Laptop Toshiba 3455X",1280.00);
         
        FacturaDetalle facturaDetalle = new FacturaDetalle(1,10,articulo);
        
        facturaCabecera.adicionarDetalle(facturaDetalle);
        
        //verifica que adiciono un detalle al arreglo de DetalleFactura
        assertEquals(1, facturaCabecera.getFacturaDetalles().size());
        
        //muestra los detalles(items) de la factura
        ArrayList<FacturaDetalle> detalles = facturaCabecera.getFacturaDetalles();
        for(FacturaDetalle p:detalles)
        {
            System.out.println(p.getNroItem()+"   "+p.getArticulo().getDescripcion()+"  " +p.getCantidad());
        }
        //busca datos del articulo dado un codigo de  articulo
        Articulo articulo1 = facturaCabecera.buscaArticulo("A2330");
        
        System.out.println("Articulo:" + articulo1.getDescripcion());
        
    }
}