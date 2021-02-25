/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.RepasoPOO;

/**
 *
 * @author Gerardo
 */
public class Cuenta {
    private String titular;
    private double cantidad;
    
    public String toString(){
        return "Titular: "+titular+" Cantidad: "+cantidad;
    } 
    
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular= titular;
    }
    
    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(double cantidad){
        this.cantidad= cantidad;
    }
       
    public Cuenta(String t, double c){
        titular=t;
        cantidad =c;
    }
    
    public double Ingresar(double cantidad){
        if(cantidad<0){
            System.out.println("Igresa algo...");
        }else{
            this.cantidad= cantidad;
        }
        return this.cantidad;
    }
    
    public double Retirar(double cantidad){
        double retirado= this.cantidad - cantidad;
        
        if(retirado<0){
            retirado = 0; 
            return retirado;
        }else{
            return retirado;
        }
    }
}
