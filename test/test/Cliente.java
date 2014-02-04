/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author pciscflo
 */
class Cliente {
   private String nombre;
   private String ruc;
   private String domicilio;
   
    Cliente(String nombre, String ruc, String domicilio) {
       this.nombre = nombre;
       this.domicilio=domicilio;
       this.ruc=ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    
}
