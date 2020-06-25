/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.persistencia;

import br.beans.GrandeAreaBeans;
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
public class GrandeAreaDAO {
    Connection conn;
    public GrandeAreaDAO() throws Exception {
        try {
            this.conn = Conexao.getConnection();            
        } catch (Exception e) {
            throw new Exception("Erro "+ ":\n"+ e.getMessage());
        }
    }
    
    public void salvar(GrandeAreaBeans grandearea) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (grandearea == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "INSERT INTO tblgrande_area(g_areaNome,g_areaCodigo)"+"values(?,?)";            
            con = this.conn;
            ps = con.prepareStatement(SQL);
            ps.setString(1,grandearea.getG_areaNome());            
            ps.setString(2,grandearea.getG_areaCodigo());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao Inserir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}    
    }
    
    public void excluir(GrandeAreaBeans grandearea) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (grandearea == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
                     
            con = this.conn;
            ps = con.prepareStatement("delete from tblgrande_area where g_areaNome=?");
            ps.setString(1,grandearea.getG_areaNome());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao excluir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
    
    public void atualizar(GrandeAreaBeans grandearea) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (grandearea == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "UPDATE tblgrande_area SET g_areaNome=?, g_areaCodigo=? where g_areaId=?";
            
            con = this.conn;
            ps = con.prepareStatement(SQL);
            ps.setString(1,grandearea.getG_areaNome()); 
            ps.setString(2,grandearea.getG_areaCodigo());
            ps.setInt(3, grandearea.getG_areaId());                    
            ps.executeUpdate();            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
        
    public ArrayList<GrandeAreaBeans> todasAreas()  throws Exception{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;         
        try { con = this.conn;                    
            ps = con.prepareStatement("SELECT * from tblgrande_area");                       
            rs = ps.executeQuery();
            ArrayList <GrandeAreaBeans> lista = new ArrayList<GrandeAreaBeans>();            
            while(rs.next()) {
                Integer g_areaId = rs.getInt(1);
                String g_areaNome = rs.getString(2);
                String g_areaCodigo = rs.getString(3);
                lista.add(new GrandeAreaBeans(g_areaId,g_areaNome,g_areaCodigo));                
            }
            return lista;            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+  sqle);
        } finally {Conexao.closeConnection(con,ps);}    
    }       
    
     public ArrayList<GrandeAreaBeans> filtrarAreas(String nome)  throws Exception{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;         
        try { con = this.conn;                    
            ps = con.prepareStatement("SELECT * from tblgrande_area where g_areaNome like ?");  
            ps.setString(1,"%" + nome + "%");
            rs = ps.executeQuery();
            ArrayList <GrandeAreaBeans> lista = new ArrayList<GrandeAreaBeans>();            
            while(rs.next()) {
                Integer g_areaId = rs.getInt(1);
                String g_areaNome = rs.getString(2);
                String g_areaCodigo = rs.getString(3);
                lista.add(new GrandeAreaBeans(g_areaId,g_areaNome,g_areaCodigo));                
            }
            return lista;            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+  sqle);
        } finally {Conexao.closeConnection(con,ps);}        
    }       
   
    
    public GrandeAreaBeans procurarArea(String nome) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;  
        try { con = this.conn;
        
            ps = con.prepareStatement("SELECT * from tblgrande_area where g_areaNome like ?");                                    
            ps.setString(1,"%" + nome + "%");
            rs = ps.executeQuery();
            
           if ( !rs.next()) {
              throw new Exception("não foi encontrado nenhuma "+ "Grande area com o nome "+ nome);
           }
            int g_areaId = rs.getInt(1);
            String g_areaNome = rs.getString(2);
            String g_areaCodigo = rs.getString(3);
            return new GrandeAreaBeans(g_areaId,g_areaNome,g_areaCodigo);                                 
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }          
}
