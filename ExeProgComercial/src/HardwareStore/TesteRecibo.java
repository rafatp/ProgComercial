/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HardwareStore;

/**
 *
 * @author rafaelpereira
 */
public class TesteRecibo {
    public static void main (String args[]){
        Recibo invoice1=new Recibo ("A5544", "Big Black Book", 500, 250.00); 
        Recibo invoice2=new Recibo ("A5542", "Big Pink Book", 300, 50.00);
        System.out.printf("Invoice 1:" +" "+invoice1.getPartNum()+" "+ invoice1.getPartDesc()+" "+ invoice1.getQuantity()+" "+ invoice1.getPrice()+" "+ invoice1.getInvoiceAmount());
        System.out.printf("\nInvoice 2: %s\t%s\t%d\t$%.2f\n", invoice2.getPartNum(), invoice2.getPartDesc(), invoice2.getQuantity(), invoice2.getPrice());
} 
}