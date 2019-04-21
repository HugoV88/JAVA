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
public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private int contadorEmpleados;
    
    Empleado(){}
    
    Empleado(String nombre, double sueldo) {
        super(nombre); // super debe ser la primera linea
        this.idEmpleado = ++contadorEmpleados;
        this.sueldo = sueldo;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }
    
    public double getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + "}"; 
    }
    
}
