
package br.beans;

/**
 *
 * @author rlaecio
 */
public class DocumentoBeans {
    
    public DocumentoBeans(){        
    }

    public DocumentoBeans(int docId, int autorId, int admId, int areaId, int idiomaId, int grauId, int g_areaId, int categoriaId, int especialidadeId, int docAno, int docQtPaginas, String docBancaDefesa, String docPalavrasChaves, String docRodape, String docTitulo, String docNomeArquivoOrigem, String docNomeArquivoIndice) {
        this.docId = docId;
        this.autorId = autorId;
        this.admId = admId;
        this.areaId = areaId;
        this.idiomaId = idiomaId;
        this.grauId = grauId;
        this.g_areaId = g_areaId;
        this.categoriaId = categoriaId;
        this.especialidadeId = especialidadeId;
        this.docAno = docAno;
        this.docQtPaginas = docQtPaginas;
        this.docBancaDefesa = docBancaDefesa;
        this.docPalavrasChaves = docPalavrasChaves;
        this.docRodape = docRodape;
        this.docTitulo = docTitulo;
        this.docNomeArquivoOrigem = docNomeArquivoOrigem;
        this.docNomeArquivoIndice = docNomeArquivoIndice;
    }

    private int docId;
    private int autorId;
    private int admId;
    private int areaId;
    private int idiomaId;
    private int grauId;
    private int g_areaId;
    private int categoriaId;
    private int especialidadeId;
    private int docAno;
    private int docQtPaginas;
    private String docBancaDefesa;    
    private String docPalavrasChaves;
    private String docRodape;    
    private String docTitulo;
    private String docNomeArquivoOrigem;
    private String docNomeArquivoIndice;

    public int getAdmId() {
        return admId;
    }

    public void setAdmId(int admId) {
        this.admId = admId;
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public int getDocAno() {
        return docAno;
    }

    public void setDocAno(int docAno) {
        this.docAno = docAno;
    }

    public String getDocBancaDefesa() {
        return docBancaDefesa;
    }

    public void setDocBancaDefesa(String docBancaDefesa) {
        this.docBancaDefesa = docBancaDefesa;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getDocNomeArquivoIndice() {
        return docNomeArquivoIndice;
    }

    public void setDocNomeArquivoIndice(String docNomeArquivoIndice) {
        this.docNomeArquivoIndice = docNomeArquivoIndice;
    }

    public String getDocNomeArquivoOrigem() {
        return docNomeArquivoOrigem;
    }

    public void setDocNomeArquivoOrigem(String docNomeArquivoOrigem) {
        this.docNomeArquivoOrigem = docNomeArquivoOrigem;
    }

    public String getDocPalavrasChaves() {
        return docPalavrasChaves;
    }

    public void setDocPalavrasChaves(String docPalavrasChaves) {
        this.docPalavrasChaves = docPalavrasChaves;
    }

    public int getDocQtPaginas() {
        return docQtPaginas;
    }

    public void setDocQtPaginas(int docQtPaginas) {
        this.docQtPaginas = docQtPaginas;
    }

    public String getDocRodape() {
        return docRodape;
    }

    public void setDocRodape(String docRodape) {
        this.docRodape = docRodape;
    }

    public String getDocTitulo() {
        return docTitulo;
    }

    public void setDocTitulo(String docTitulo) {
        this.docTitulo = docTitulo;
    }

    public int getEspecialidadeId() {
        return especialidadeId;
    }

    public void setEspecialidadeId(int especialidadeId) {
        this.especialidadeId = especialidadeId;
    }

    public int getG_areaId() {
        return g_areaId;
    }

    public void setG_areaId(int g_areaId) {
        this.g_areaId = g_areaId;
    }

    public int getGrauId() {
        return grauId;
    }

    public void setGrauId(int grauId) {
        this.grauId = grauId;
    }

    public int getIdiomaId() {
        return idiomaId;
    }

    public void setIdiomaId(int idiomaId) {
        this.idiomaId = idiomaId;
    }

    
    

}
