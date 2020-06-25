/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beans;

/**
 *
 * @author rlaecio
 */
public class AssuntoBeans {
    public AssuntoBeans() {
        
    }

    public AssuntoBeans(int assuntoId, String assuntoNome) {
        this.assuntoId = assuntoId;
        this.assuntoNome = assuntoNome;
    }
    
    
    private int assuntoId;
    private String assuntoNome;

    public int getAssuntoId() {
        return assuntoId;
    }

    public void setAssuntoId(int assuntoId) {
        this.assuntoId = assuntoId;
    }

    public String getAssuntoNome() {
        return assuntoNome;
    }

    public void setAssuntoNome(String assuntoNome) {
        this.assuntoNome = assuntoNome;
    }
    
    
}
