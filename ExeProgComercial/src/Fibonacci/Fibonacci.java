/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

/**
 *
 * @author rafaelpereira
 */
public class Fibonacci {
    static long calculo(int n){
        if (n < 2)
        {
            return n;
        }
        else{
            return calculo(n - 1) + calculo(n - 2);
        }
    }
    public static void main (String [] args){
           for (int i = 0; i<24; i++){
               System.out.println("("+ i +"):" +Fibonacci.calculo(i)+"\t");
           }
    }
    
}
