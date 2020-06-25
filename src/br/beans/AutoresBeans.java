/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beans;

/**
 *
 * @author rlaecio
 */
public class AutoresBeans {
       public AutoresBeans(){        
    }
    
    private int autorId;
    private String autorNome;
    private String autorEmail;
    private String autorCidade;
    private String autorEndereco;
    private String autorFone;
    private String autorCelular;

    public AutoresBeans(int autorId, String autorNome, String autorEmail, String autorCidade, String autorEndereco, String autorFone, String autorCelular) {
        this.autorId = autorId;
        this.autorNome = autorNome;
        this.autorEmail = autorEmail;
        this.autorCidade = autorCidade;
        this.autorEndereco = autorEndereco;
        this.autorFone = autorFone;
        this.autorCelular = autorCelular;
    }

    public String getAutorCelular() {
        return autorCelular;
    }

    public void setAutorCelular(String autorCelular) {
        this.autorCelular = autorCelular;
    }

    public String getAutorCidade() {
        return autorCidade;
    }

    public void setAutorCidade(String autorCidade) {
        this.autorCidade = autorCidade;
    }

    public String getAutorEmail() {
        return autorEmail;
    }

    public void setAutorEmail(String autorEmail) {
        this.autorEmail = autorEmail;
    }

    public String getAutorEndereco() {
        return autorEndereco;
    }

    public void setAutorEndereco(String autorEndereco) {
        this.autorEndereco = autorEndereco;
    }

    public String getAutorFone() {
        return autorFone;
    }

    public void setAutorFone(String autorFone) {
        this.autorFone = autorFone;
    }

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public String getAutorNome() {
        return autorNome;
    }

    public void setAutorNome(String autorNome) {
        this.autorNome = autorNome;
    }
 
    
}
