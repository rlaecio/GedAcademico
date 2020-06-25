/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beans;

/**
 *
 * @author rlaecio
 */
public class IdiomaBeans {
    public IdiomaBeans() {        
    }

    public IdiomaBeans(int idiomaId, String idiomaNome) {
        this.idiomaId = idiomaId;
        this.idiomaNome = idiomaNome;
    }
           
    private int idiomaId;
    private String idiomaNome;

    public int getIdiomaId() {
        return idiomaId;
    }

    public void setIdiomaId(int idiomaId) {
        this.idiomaId = idiomaId;
    }

    public String getIdiomaNome() {
        return idiomaNome;
    }

    public void setIdiomaNome(String idiomaNome) {
        this.idiomaNome = idiomaNome;
    }
    
    

    
}
