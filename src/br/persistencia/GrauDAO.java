/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.persistencia;

import br.beans.GrauBeans;
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
public class GrauDAO {
    Connection conn;
    public GrauDAO() throws Exception {
        try {
            this.conn = Conexao.getConnection();
            
        } catch (Exception e) {
            throw new Exception("Erro "+ ":\n"+ e.getMessage());
        }
    }
    
    public void salvar(GrauBeans grau) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (grau == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "INSERT INTO tblgrau(grauNome)"+"values(?)";
            
            con = this.conn;
            ps = con.prepareStatement(SQL);
            ps.setString(1,grau.getGrauNome());            
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao Inserir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    
    }
    
    public void excluir(GrauBeans grau) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (grau == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
                     
            con = this.conn;
            ps = con.prepareStatement("delete from tblgrau where grauNome=?");
            ps.setString(1,grau.getGrauNome());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao excluir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
    
    public void atualizar(GrauBeans grau) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (grau == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "UPDATE tblgrau SET grauNome=? where grauId=?";            
            con = this.conn;
            ps = con.prepareStatement(SQL);
            ps.setString(1,grau.getGrauNome());
            ps.setInt(2,grau.getGrauId());
            ps.executeUpdate();            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
        
   public ArrayList<GrauBeans> todasGraus()  throws Exception{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;         
        try { con = this.conn;                    
            ps = con.prepareStatement("SELECT * from tblgrau");                       
            rs = ps.executeQuery();
            ArrayList <GrauBeans> lista = new ArrayList<GrauBeans>();            
            while(rs.next()) {
                Integer grauId = rs.getInt(1);
                String grauNome = rs.getString(2);                
                lista.add(new GrauBeans(grauId,grauNome));                
            }
            return lista;            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+  sqle);
        } finally {Conexao.closeConnection(con,ps);}        
    }       
    
    public ArrayList<GrauBeans> filtraGraus(String nome)  throws Exception{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;         
        try { con = this.conn;                    
            ps = con.prepareStatement("SELECT * from tblgrau where grauNome like ?");                       
            ps.setString(1,"%" + nome + "%");
            rs = ps.executeQuery();
            ArrayList <GrauBeans> lista = new ArrayList<GrauBeans>();            
            while(rs.next()) {
                Integer grauId = rs.getInt(1);
                String grauNome = rs.getString(2);                
                lista.add(new GrauBeans(grauId,grauNome));                
            }
            return lista;            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+  sqle);
        } finally {Conexao.closeConnection(con,ps);}        
    }       
       
    public GrauBeans procurarGrau(String nome) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;  
        try { con = this.conn;
        
            ps = con.prepareStatement("SELECT * from tblgrau where grauNome like ?");                                    
            ps.setString(1,"%" + nome + "%");
            rs = ps.executeQuery();
            
           if ( !rs.next()) {
              throw new Exception("não foi encontrado nenhum "+ "grau com o nome "+ nome);
           }
            int grauId = rs.getInt(1);
            String grauNome = rs.getString(2);
            return new GrauBeans(grauId,grauNome);                                 
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }      
}
