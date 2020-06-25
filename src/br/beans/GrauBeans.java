package br.beans;

/**
 *
 * @author rlaecio
 */
public class GrauBeans {
    public GrauBeans() {        
    }

    public GrauBeans(int grauId, String grauNome) {
        this.grauId = grauId;
        this.grauNome = grauNome;
    }

    
    private int grauId;
    private String grauNome;

    public int getGrauId() {
        return grauId;
    }

    public void setGrauId(int grauId) {
        this.grauId = grauId;
    }

    public String getGrauNome() {
        return grauNome;
    }

    public void setGrauNome(String grauNome) {
        this.grauNome = grauNome;
    }
        
}
