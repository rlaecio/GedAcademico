/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.persistencia;

import br.beans.AssuntoBeans;
import br.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author rlaecio
 */
public class AssuntoDAO {
    Connection conn;
    public AssuntoDAO() throws Exception {
        try {
            this.conn = Conexao.getConnection();
            
        } catch (Exception e) {
            throw new Exception("Erro "+ ":\n"+ e.getMessage());
        }
    }
    
    public void salvar(AssuntoBeans assunto) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (assunto == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "INSERT INTO tblassunto(assuntoNome)"+"values(?)";
            
            con = this.conn;
            ps = con.prepareStatement(SQL);
            ps.setString(1,assunto.getAssuntoNome());            
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao Inserir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    
    }
    
    public void excluir(AssuntoBeans assunto) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (assunto == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
                     
            con = this.conn;
            ps = con.prepareStatement("delete from tblassunto where assuntoNome=?");
            ps.setString(1,assunto.getAssuntoNome());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao excluir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
    
    public void atualizar(AssuntoBeans assunto) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (assunto == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "UPDATE client SET assuntoNome=? ";
            
            con = this.conn;
            ps = con.prepareStatement(SQL);
            ps.setString(1,assunto.getAssuntoNome());            
            ps.executeUpdate();            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
        
           
    public AssuntoBeans procurarAssunto(String nome) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;  
        try { con = this.conn;
        
            ps = con.prepareStatement("SELECT * from tblassunto where assuntoNome like ?");                                    
            ps.setString(1,"%" + nome + "%");
            rs = ps.executeQuery();
            
           if ( !rs.next()) {
              throw new Exception("não foi encontrado nenhum "+ "assunto com o nome "+ nome);
           }
            int assuntoId = rs.getInt(1);
            String assuntoNome = rs.getString(2);
            return new AssuntoBeans(assuntoId,assuntoNome);                                 
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }      
    
}
