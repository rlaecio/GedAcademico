/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beans;

/**
 *
 * @author rlaecio
 */
public class EspecialidadeBeans {
    public EspecialidadeBeans() {        
    }

    public EspecialidadeBeans(int especialidadeId, String especialidadeNome, String especialidadeCodigo) {
        this.especialidadeId = especialidadeId;
        this.especialidadeNome = especialidadeNome;
        this.especialidadeCodigo = especialidadeCodigo;
    }

               
    private int especialidadeId;
    private String especialidadeNome;
    private String especialidadeCodigo;

    public String getEspecialidadeCodigo() {
        return especialidadeCodigo;
    }

    public void setEspecialidadeCodigo(String especialidadeCodigo) {
        this.especialidadeCodigo = especialidadeCodigo;
    }

    public int getEspecialidadeId() {
        return especialidadeId;
    }

    public void setEspecialidadeId(int especialidadeId) {
        this.especialidadeId = especialidadeId;
    }

    public String getEspecialidadeNome() {
        return especialidadeNome;
    }

    public void setEspecialidadeNome(String especialidadeNome) {
        this.especialidadeNome = especialidadeNome;
    }        
}
