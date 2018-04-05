/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cidades;

/**
 *
 * @author rafaelpereira
 */

import java.io.*;

public class Arquivo {

    private String nomeArquivo;
    private BufferedWriter bw;
    private BufferedReader br;
    private File arq;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.arq = new File("/Users/rafaelpereira/NetBeansProjects/MyParentClass/src/Cidades/arqCidades/"+this.nomeArquivo+ ".txt");
    }

    public void gravar(String texto, boolean novo) {
        try {
            if (novo) {
                bw = new BufferedWriter(new FileWriter(this.arq));
            } else {
                bw = new BufferedWriter(new FileWriter(this.arq, true));
            }
            if (!texto.equals("")) {
                bw.write(texto);
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
        }
    }

    public String ler() {
        String conteudo = null;
        String texto = "";
        try {
            br = new BufferedReader(new FileReader(this.arq));
            while ((conteudo = br.readLine()) != null) {
                texto = texto + conteudo + "\n";
            }
            br.close();
        } catch (Exception e) {
        }
        return texto;
    }
}

