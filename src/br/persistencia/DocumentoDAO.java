
package br.persistencia;

import br.beans.DocumentoBeans;
import br.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.css.RGBColor;

/**
 *
 * @author rlaecio
 */
public class DocumentoDAO {
    Connection conn;
    public DocumentoDAO() throws Exception {
        try {
            this.conn = Conexao.getConnection();
        } 
        catch (Exception e) {
            throw new Exception("Erro "+ ":\n"+ e.getMessage());
        }
    }
    
    public void salvar(DocumentoBeans documentos) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (documentos == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "INSERT INTO tbldocumentos (autorId,docAno,areaId,g_areaId,idiomaId,docBancaDefesa,"
                    + "categoriaId,docQtPaginas,docPalavrasChaves,docRodape,grauId,docTitulo,admId,especialidadeId,"
                    + "docNomeArquivoOrigem,docNomeArquivoIndice)"+"values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";            
            
            con = this.conn;
            ps = con.prepareStatement(SQL);
            ps.setInt(1,documentos.getAutorId());
            ps.setInt(2,documentos.getDocAno());
            ps.setInt(3,documentos.getAreaId());
            ps.setInt(4,documentos.getG_areaId());
            ps.setInt(5,documentos.getIdiomaId());
            ps.setString(6,documentos.getDocBancaDefesa());
            ps.setInt(7,documentos.getCategoriaId());            
            ps.setInt(8,documentos.getDocQtPaginas());
            ps.setString(9,documentos.getDocPalavrasChaves());
            ps.setString(10,documentos.getDocRodape());
            ps.setInt(11,documentos.getGrauId());
            ps.setString(12,documentos.getDocTitulo());
            ps.setInt(13,documentos.getAdmId());
            ps.setInt(14,documentos.getEspecialidadeId());
            ps.setString(15,documentos.getDocNomeArquivoOrigem());
            ps.setString(16,documentos.getDocNomeArquivoIndice());
            
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao Inserir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}    
    }
    
    public void excluir(DocumentoBeans documentos) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (documentos == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {                     
            con = this.conn;
            ps = con.prepareStatement("delete from documentos where codigo=?");
            ps.setInt(1,documentos.getDocId());
            ps.executeUpdate();
        } 
        catch (SQLException sqle) {
            throw new Exception("Erro ao excluir dados"+ sqle);
        } 
        finally {Conexao.closeConnection(con,ps);}
    }
    
    public int ultimoRegistro() throws Exception {
        PreparedStatement ps = null;
        Connection con = null;       
        ResultSet rs = null;          
        try { 
            con = this.conn;
            ps = con.prepareStatement("SELECT * from tbldocumentos");            
            rs = ps.executeQuery();          
            int docId = 0;
            while(rs.next()) {  
                 docId = rs.getInt(1);               
            }           
            return docId;
        }
        
        catch (SQLException sqle) {
            throw new Exception();
        } 
        finally {Conexao.closeConnection(con,ps);}
    }
    
    
    public void atualizar(DocumentoBeans documentos) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (documentos == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "UPDATE tbldocumentos SET autorId,docAno,areaId,"
                    + "g_areaId,idiomaId,docBancaDefesa,categoriaId,docQtPaginas,"
                    + "docPalavrasChaves,docRodape,grauId,docTitulo,admId,especialidadeId,"
                    + "docNomeArquivoOrigem,docNomeArquivoIndice where docId=? ";            
            
            con = this.conn;
            ps.setInt(1,documentos.getAutorId());
            ps.setInt(2,documentos.getDocAno());
            ps.setInt(3,documentos.getAreaId());
            ps.setInt(4,documentos.getG_areaId());
            ps.setInt(5,documentos.getIdiomaId());
            ps.setString(6,documentos.getDocBancaDefesa());
            ps.setInt(7,documentos.getCategoriaId());            
            ps.setInt(8,documentos.getDocQtPaginas());
            ps.setString(9,documentos.getDocPalavrasChaves());
            ps.setString(10,documentos.getDocRodape());
            ps.setInt(11,documentos.getGrauId());
            ps.setString(12,documentos.getDocTitulo());
            ps.setInt(13,documentos.getAdmId());
            ps.setInt(14,documentos.getEspecialidadeId());
            ps.setString(15,documentos.getDocNomeArquivoOrigem());
            ps.setString(16,documentos.getDocNomeArquivoIndice());
            ps.executeUpdate();            
        } 
        catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+ sqle);
        } 
        finally {Conexao.closeConnection(con,ps);}
    }
    
    
    public List todosDocumentos()  throws Exception{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;  
        try { 
            con = this.conn;
            ps = con.prepareStatement("SELECT * from tbldocumentos");            
            rs = ps.executeQuery();
            List <DocumentoBeans> list = new ArrayList<DocumentoBeans>();            
            while(rs.next()) {         
                int autorId = rs.getInt(1);
                int docAno = rs.getInt(2);
                int areaId = rs.getInt(3);
                int g_areaId = rs.getInt(4);
                int idiomaId = rs.getInt(5);
                String docBancaDefesa = rs.getString(6);
                int categoriaId = rs.getInt(7);            
                int docQtPaginas = rs.getInt(8);
                String docPalavrasChaves = rs.getString(9);
                String docRodape = rs.getString(10);
                int grauId = rs.getInt(11);
                String docTitulo = rs.getString(12);
                int admId = rs.getInt(13);
                int especialidadeId = rs.getInt(14);
                String docNomeArquivoOrigem = rs.getString(15);
                String docNomeArquivoIndice = rs.getString(16);                
                list.add(new DocumentoBeans(admId, autorId, admId, areaId, idiomaId, grauId, g_areaId, categoriaId, especialidadeId, docAno, docQtPaginas, docBancaDefesa, docPalavrasChaves, docRodape, docTitulo, docNomeArquivoOrigem, docNomeArquivoIndice));                
            }
            return list;            
        } 
        catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+  sqle);
        } 
        finally {Conexao.closeConnection(con,ps);}    
    }
    
    
    
    public DocumentoBeans procurarDocumento(Integer id) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;  
        try { con = this.conn;
        
            ps = con.prepareStatement("SELECT * from tbldocumentos where docId=? ");            
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if ( !rs.next()) {
                throw new Exception("não foi encontrado nenhum "+ "registro com o Id"+ id);
            }                            
                int autorId = rs.getInt(1);
                int docAno = rs.getInt(2);
                int areaId = rs.getInt(3);
                int g_areaId = rs.getInt(4);
                int idiomaId = rs.getInt(5);
                String docBancaDefesa = rs.getString(6);
                int categoriaId = rs.getInt(7);            
                int docQtPaginas = rs.getInt(8);
                String docPalavrasChaves = rs.getString(9);
                String docRodape = rs.getString(10);
                int grauId = rs.getInt(11);
                String docTitulo = rs.getString(12);
                int admId = rs.getInt(13);
                int especialidadeId = rs.getInt(14);
                String docNomeArquivoOrigem = rs.getString(15);
                String docNomeArquivoIndice = rs.getString(16);  
            
            return new DocumentoBeans();
            
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }      
}
