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
public class TestCuenta {
    public void main (String[] args){
        
        
        Cuenta pedro = new Cuenta("Pedro", 300);
        Cuenta fernando = new Cuenta("Fernando",300);
        
        double depositoPedro= 300;
        double depositoFernando= 400;
        
        pedro.Ingresar(depositoPedro);
        fernando.Ingresar(depositoFernando);
        
        System.out.println("Saldo vigente de " +
                pedro.getTitular()+ " $"+pedro.getCantidad());
        System.out.println("Saldo vigente de " +
                fernando.getTitular()+ " $"+fernando.getCantidad());
        
        double retiroPedro=500;
        double retiroFernando=100;
        
        System.out.println("Se retiro $"+retiroPedro+ " de la cuenta de pedro. El saldo actual es de $"+pedro.Retirar(retiroPedro));
        System.out.println("Se retiro $"+ retiroFernando+" de la cuenta de fernando. El saldo actual es de $"+fernando.Retirar(retiroPedro));
        
    }
}
