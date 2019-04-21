/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

/**
 *
 * @author USUARIO
 */
public class Cliente extends Persona{
    private int idCliente;
    private java.util.Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;
    
    Cliente(){}
    
    Cliente(java.util.Date fechaRegistro, boolean vip) {
        this.idCliente = contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }
    
    public int getIdCliente(){
        return idCliente;
    }
    
    public java.util.Date getFechaRegistro() {
        return fechaRegistro;
    }
    
    public boolean isVip() {
        return vip;
    }
    
    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Cliente{" + "idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + "}";
    }
    
    
}
