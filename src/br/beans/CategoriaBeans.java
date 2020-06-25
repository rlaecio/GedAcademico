/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beans;

/**
 *
 * @author rlaecio
 */
public class CategoriaBeans {
    public CategoriaBeans() {
        
    }

    public CategoriaBeans(int categoriaId, String categoriaNome, String categoriaCodigo) {
        this.categoriaId = categoriaId;
        this.categoriaNome = categoriaNome;
        this.categoriaCodigo = categoriaCodigo;
    }
           
    private int categoriaId;
    private String categoriaNome;
    private String categoriaCodigo;

    public String getCategoriaCodigo() {
        return categoriaCodigo;
    }

    public void setCategoriaCodigo(String categoriaCodigo) {
        this.categoriaCodigo = categoriaCodigo;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getCategoriaNome() {
        return categoriaNome;
    }

    public void setCategoriaNome(String categoriaNome) {
        this.categoriaNome = categoriaNome;
    }        
}
