/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */
import java.util.Scanner;
public class Calculadora {
    int numero1=13;
    int numero2=12;
    int sumar;
    int restar;
    int multiplicar;
    public void pedir(){
        Scanner sc = new Scanner(System.in);
       //-------Primer numero---------------------------------
        System.out.print("Ingrese el primer numero: ");
        numero1=sc.nextInt();
        System.out.println("Usted ingreso: "+numero1);
        //------Segundo numero--------------------------------
        System.out.print("Ingrese el segundo numero: ");
        numero2=sc.nextInt();
        System.out.println("Usted ingreso: "+numero2);
    }
    public void sumar(){
        sumar=numero1+numero2;
    }
    public void restar(){ 
        restar=numero1-numero2;
    }
    public void multiplicar(){
        multiplicar=numero1*numero2;
    }
    public void mostrar(){
        System.out.println("La suma es: "+sumar);
        System.out.println("La resta es: "+ restar);
        System.out.println("La multiplicacion es: "+multiplicar);
    }
    public static void main (String[]args){
        
        Calculadora op1 = new Calculadora ();
        op1.pedir();
        op1.sumar();
        op1.restar();
        op1.multiplicar();
        op1.mostrar();
        
    }
}
