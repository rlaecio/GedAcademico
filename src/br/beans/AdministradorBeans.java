/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beans;

/**
 *
 * @author rlaecio
 */
public class AdministradorBeans {
    
    public AdministradorBeans(){        
    }
    
    int admId;
    String admNome;
    String admLogon;
    String admSenha;

    public AdministradorBeans(int admId, String admNome, String admLogon, String admSenha) {
        this.admId = admId;
        this.admNome = admNome;
        this.admLogon = admLogon;
        this.admSenha = admSenha;
    }

    public int getAdmId() {
        return admId;
    }

    public void setAdmId(int admId) {
        this.admId = admId;
    }

    public String getAdmLogon() {
        return admLogon;
    }

    public void setAdmLogon(String admLogon) {
        this.admLogon = admLogon;
    }

    public String getAdmNome() {
        return admNome;
    }

    public void setAdmNome(String admNome) {
        this.admNome = admNome;
    }

    public String getAdmSenha() {
        return admSenha;
    }

    public void setAdmSenha(String admSenha) {
        this.admSenha = admSenha;
    }

    
}
