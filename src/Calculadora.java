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
    public void sumar(int numeroa,int numerob){
        sumar=numeroa+numerob;
    }
    public void restar(int numeroa,int numerob){
       
        restar=numeroa-numerob;
    }
    public void multiplicar(int numeroa,int numerob){
    
        multiplicar=numeroa*numerob;
    }
    public void mostrar(){
        System.out.println(sumar);
        System.out.println(restar);
        System.out.println(multiplicar);
    }
    public static void main (String[]args){
        Calculadora Calculadora2=new Calculadora ();
        int a=30;
        int b=40;
        Calculadora2.sumar(a,b);
        Calculadora2.restar(a,b);
        Calculadora2.multiplicar(a,b);
        Calculadora2.mostrar();
        
    }
}
