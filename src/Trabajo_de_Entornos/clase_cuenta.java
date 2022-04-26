/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo_de_Entornos;

/**
 *Clase Cuenta
 * @author ediso
 * @version 1.0
 * @since 21/04/2022
 */
public class clase_cuenta {
    private String titular;
    private double cantidad;

    public clase_cuenta(String titular, double cantidad) {
        this.titular = titular;
         if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
         
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    /**
     * Ingresa dinero en la cuenta, 
     * solo si es positivo la cantidad
     *
     * @param cantidad
     */
    public void ingresar(double cantidad) {
        if(cantidad > 0){
            this.setCantidad(this.getCantidad() + cantidad);   
        }
    }
     /**
     * Retira una cantidad en la cuenta, si se quedara en negativo se quedaria
     * en cero
     *
     * @param cantidad
     */
    public void retirar(double cantidad) {
        if (this.getCantidad() - cantidad < 0) {
            this.setCantidad(0);
        } else {
            this.setCantidad(this.getCantidad() - cantidad);
        }
    }
    
     /**
     * Devuelve el estado del objeto
     *
     * @return
     */
    @Override
    public String toString() {
        return "El titular " + getTitular() + " tiene " + getCantidad() + " euros en la cuenta";
    }
 
}
