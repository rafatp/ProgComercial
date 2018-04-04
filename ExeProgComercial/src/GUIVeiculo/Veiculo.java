/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIVeiculo;

/**
 *
 * @author rafaelpereira
 */
    public class Veiculo {
    private String nome;
    private String cor;
    private String placa;

    public Veiculo(String nome, String cor, String placa) {
        this.nome = nome;
        this.cor = cor;
        this.placa = placa;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
        
}


