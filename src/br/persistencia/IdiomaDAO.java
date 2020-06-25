/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.persistencia;

import br.beans.IdiomaBeans;
import br.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author rlaecio
 */
public class IdiomaDAO {
    Connection conn;
    public IdiomaDAO() throws Exception {
        try {
            this.conn = Conexao.getConnection();
            
        } catch (Exception e) {
            throw new Exception("Erro "+ ":\n"+ e.getMessage());
        }
    }
    
    public void salvar(IdiomaBeans idioma) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (idioma == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "INSERT INTO tblidioma(idiomaNome)"+"values(?)";
            
            con = this.conn;
            ps = con.prepareStatement(SQL);
            ps.setString(1,idioma.getIdiomaNome());            
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao Inserir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    
    }
    
    public void excluir(IdiomaBeans idioma) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (idioma == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
                     
            con = this.conn;
            ps = con.prepareStatement("delete from tblidioma where idiomaNome=?");
            ps.setString(1,idioma.getIdiomaNome());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao excluir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
    
    public void atualizar(IdiomaBeans idioma) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (idioma == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "UPDATE tblidioma SET idiomaNome=? where idiomaId=?";
            
            con = this.conn;
            ps = con.prepareStatement(SQL);
            ps.setString(1,idioma.getIdiomaNome());   
            ps.setInt(2,idioma.getIdiomaId());
            ps.executeUpdate();            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
    
    public ArrayList<IdiomaBeans> todasIdiomas()  throws Exception{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;         
        try { con = this.conn;                    
            ps = con.prepareStatement("SELECT * from tblidioma");                       
            rs = ps.executeQuery();
            ArrayList <IdiomaBeans> lista = new ArrayList<IdiomaBeans>();            
            while(rs.next()) {
                Integer idiomaId = rs.getInt(1);
                String idiomaNome = rs.getString(2);                
                lista.add(new IdiomaBeans(idiomaId,idiomaNome));                
            }
            return lista;            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+  sqle);
        } finally {Conexao.closeConnection(con,ps);}        
    }       
    
    public ArrayList<IdiomaBeans> filtraIdiomas(String nome)  throws Exception{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;         
        try { con = this.conn;                    
            ps = con.prepareStatement("SELECT * from tblidioma where idiomaNome like ?");                       
            ps.setString(1,"%" + nome + "%");
            rs = ps.executeQuery();
            ArrayList <IdiomaBeans> lista = new ArrayList<IdiomaBeans>();            
            while(rs.next()) {
                Integer idiomaId = rs.getInt(1);
                String idiomaNome = rs.getString(2);                
                lista.add(new IdiomaBeans(idiomaId,idiomaNome));                
            }
            return lista;            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+  sqle);
        } finally {Conexao.closeConnection(con,ps);}        
    }
           
    public IdiomaBeans procurarIdioma(String nome) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;  
        try { con = this.conn;
        
            ps = con.prepareStatement("SELECT * from tblidioma where idiomaNome like ?");                                    
            ps.setString(1,"%" + nome + "%");
            rs = ps.executeQuery();
            
           if ( !rs.next()) {
              throw new Exception("não foi encontrado nenhum "+ "idioma com o nome "+ nome);
           }
            int idiomaId = rs.getInt(1);
            String idiomaNome = rs.getString(2);
            return new IdiomaBeans(idiomaId,idiomaNome);                                 
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }          
}
