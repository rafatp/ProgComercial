/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Professores;

/**
 *
 * @author rafaelpereira
 */
class Teacher {
   private String cargo = "Professor";
   private String universidade = "UFSM";
   public String getCargo() {
	return cargo;
   }
   protected void setCargo(String designation) {
	this.cargo = designation;
   }
   protected String getUniversidade() {
	return universidade;
   }
   protected void setUniversidade(String collegeName) {
	this.universidade = collegeName;
   }
   void does(){
	System.out.println("Teaching");
   }
}

public class Professores extends Teacher{
   String mainSubject = "Física";
   public static void main(String args[]){
	Professores obj = new Professores();
	/* Note: we are not accessing the data members 
	 * directly we are using public getter method 
	 * to access the private members of parent class
	 */
	System.out.println(obj.getUniversidade());
	System.out.println(obj.getCargo());
	System.out.println(obj.mainSubject);
	obj.does();
   }
}
