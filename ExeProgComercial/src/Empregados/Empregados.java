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

public class Empregados {
    String nome;
    int salario;
    int id = 0;
    private static int id2;
    
    Empregados(String nome, int salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public void setId(){
        id = id2;
	id2++;     
        System.out.println("id2: "+id2);
    }
    
    public int getNextId(){        
        return id2;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getValue (){
        return salario;
    }
    
    public int getId (){
        return id;
    }
    
}

