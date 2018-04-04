/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticTest;
/**
 *
 * @author rafaelpereira
 */
public class StaticTest {
       public static void main (String[] args){
           //completar com objetos do tipo empregado
           Employee[] staff = new Employee[3];
           
           staff[0] = new Employee ("João",4000);
           staff[1] = new Employee ("Maria",4500);
           staff[2] = new Employee ("Paulo",3000);
                
       for(Employee e : staff){
        e.setId();
        System.out.println("Nome= "+e.getNome()+ ",id= "+e.getId()+",salário= "+ e.getSalario());
        }
       int n = Employee.getNextId(); //Chama método estático
       System.out.println("Próximo id disponível: "+n);
       }
    }
class Employee {
 public Employee(String n, double s){
     nome = n;
     salario = s;
     id = 0;
 }   
 public String getNome(){
    return nome;
    }
 public double getSalario(){
     return salario;
 }
 public int getId(){
     return id;
 }
 public void setId(){
     id = nextId;
     nextId++;
 }
 public static int getNextId(){
     return nextId;
 }

 private String nome;
 private double salario;
 private int id;
 private static int nextId;
 
}
