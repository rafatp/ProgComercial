/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CirculoArea;

/**
 *
 * @author rafaelpereira
 */
public class Circulo {  
   // Variáveis instaciadas como privada, sem acesso externo à classe
   private double raio;
   
  //Constutor padrão sem argumento
  //Estabelece o raio para o valor padrão
   public Circulo() {
      raio = 1.0;
   }
   // Segundo construtor que receberá o valor do raio
   public Circulo(double r) {
      raio = r;
   }
   // Método público para retorna o raio
   public double getRaio() {
     return raio; 
   }
   // Método público para calcular a área
   public double getArea() {
      return raio*raio*Math.PI;
   }
   // Testando
   public static void main(String[] args) {
      // Declarar uma instância do círculo com c1.
      // Construtor instancia c1 invocando o construtor padrão
      // definindo seu raio para o valor padrão
      Circulo c1 = new Circulo();
      // Invoke public methods on instance c1, via dot operator.
      System.out.println("O Círculo tem raio de " 
         + c1.getRaio() + " e área = " + c1.getArea());
   
      // Declara uma instância da classe circulo, cahamda c2
      // Construtor da segunda instância c2 invoca o segundo construtor
      // seta o valor novo do raio.
      Circulo c2 = new Circulo(2.0);
      // Invoke public methods on instance c2, via dot operator.
      System.out.println("O Círculo tem raio de " 
         + c2.getRaio() + " e área = " + c2.getArea());
   }
}

