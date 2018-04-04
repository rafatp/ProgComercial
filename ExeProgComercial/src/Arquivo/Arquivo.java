/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arquivo;

//import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.print.Printer;

/**
 *
 * @author rafaelpereira
 */
public class Arquivo {
    private String nomeArquivo;
    
    public Arquivo (String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
    }
    
    public String gravar (String texto) throws IOException
    {
        FileWriter fw = new FileWriter(this.nomeArquivo+".txt",false);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(texto);
        pw.close();
        fw.close();
        return null;
    }
    public String ler () throws FileNotFoundException, IOException{
        String texto="";
        String conteudo="";
        FileReader arqLer = new FileReader(this.nomeArquivo+".txt");
        BufferedReader br = new BufferedReader(arqLer);
        while((conteudo = br.readLine()) != null){
            texto = texto+conteudo+"\n";
        }
        br.close();
        arqLer.close();
        return texto;
    }
}
