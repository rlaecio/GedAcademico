/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beans;

/**
 *
 * @author rlaecio
 */
public class AreaBeans {
    public AreaBeans() {        
    }

    public AreaBeans(int areaId, String areaNome, String areaCodigo) {
        this.areaId = areaId;
        this.areaNome = areaNome;
        this.areaCodigo = areaCodigo;
    }
        
    private int areaId;
    private String areaNome;
    private String areaCodigo;

    public String getAreaCodigo() {
        return areaCodigo;
    }

    public void setAreaCodigo(String areaCodigo) {
        this.areaCodigo = areaCodigo;
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public String getAreaNome() {
        return areaNome;
    }

    public void setAreaNome(String areaNome) {
        this.areaNome = areaNome;
    }

    
}
