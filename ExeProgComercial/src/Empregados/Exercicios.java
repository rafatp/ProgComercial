/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empregados;

/**
 *
 * @author rafaelpereira
 */


public class Exercicios {

    public static void main(String[] args) {
        
       /* Empregados a = new Empregados ("João", 500);
        Empregados b = new Empregados ("Maria", 1500);
        Empregados c = new Empregados ("Paulo", 3000);
        Empregados d = new Empregados ("Gui", 6000);
        Empregados e = new Empregados ("João", 550);
        //a.IncrementaId();
        
        System.out.println(a.getId()+ " " + a.getNome() + " Salario:" + a.getValue());
        //b.IncrementaId();
        System.out.println(b.getId() + " " + b.getNome() + " Salario:" + b.getValue());
        //c.IncrementaId();
        System.out.println(c.getId() + " " + c.getNome() + " Salario:" + c.getValue());
        //d.IncrementaId();
        System.out.println(d.getId() + " " + d.getNome() + " Salario:" + d.getValue());
        System.out.println(e.getId() + " " + e.getNome() + " Salario:" + e.getValue());*/
        Empregados[] staff = new Empregados[3];
           
           staff[0] = new Empregados ("João",4000);
           staff[1] = new Empregados ("Maria",4500);
           staff[2] = new Empregados ("Paulo",3000);
                
       for(Empregados e : staff){
        e.setId();
        System.out.println("Nome= "+e.getNome()+ ",id= "+e.getId()+",salário= "+ e.getValue());
       }
        
    }
    
}

