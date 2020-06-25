/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beans;

/**
 *
 * @author rlaecio
 */
public class GrandeAreaBeans {
    public GrandeAreaBeans() {        
    }

    public GrandeAreaBeans(int g_areaId, String g_areaNome, String g_areaCodigo) {
        this.g_areaId = g_areaId;
        this.g_areaNome = g_areaNome;
        this.g_areaCodigo = g_areaCodigo;
    }
            
    private int g_areaId;
    private String g_areaNome;
    private String g_areaCodigo;

    public String getG_areaCodigo() {
        return g_areaCodigo;
    }

    public void setG_areaCodigo(String g_areaCodigo) {
        this.g_areaCodigo = g_areaCodigo;
    }

    public int getG_areaId() {
        return g_areaId;
    }

    public void setG_areaId(int g_areaId) {
        this.g_areaId = g_areaId;
    }

    public String getG_areaNome() {
        return g_areaNome;
    }

    public void setG_areaNome(String g_areaNome) {
        this.g_areaNome = g_areaNome;
    }            
}
