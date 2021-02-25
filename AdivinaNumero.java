/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosRepaso;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Gerardo
 */
public class AdivinaNumero {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System. in);
         int nIngresado=0,nAdivinar=0;
         
        System. out. println("Enter the maximum number up to 15:" );
        nAdivinar=(int)(Math. random()*scanner. nextInt());
        of the
                {
                    System. out. println("Enter number to guess:" );
                        nIngresado=scanner. nextInt();
                        
                        if(nIngresado==nAdivinar){
                             System. out. println("---Acterooooo---");
                            break;
                        }else if(nIngresado>nAdivinar){
                            System. out. println("The number guess is less than "+nIngresado);
                        }
                        else{
                            System. out. println("The number guess is greater than "+nIngresado);
                        }
                 }while(nIngresado!=nAdivinar);
    
       
    }
}
