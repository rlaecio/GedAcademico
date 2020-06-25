/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.persistencia;

import br.beans.AdministradorBeans;
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
public class AdministradorDAO {
        Connection conn;
    public AdministradorDAO() throws Exception {
        try {
            this.conn = Conexao.getConnection();
            
        } catch (Exception e) {
            throw new Exception("Erro "+ ":\n"+ e.getMessage());
        }
    }
    
    public void salvar(AdministradorBeans administradores) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (administradores == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "INSERT INTO tbladministradores(admNome,admSenha,admLogon)"+"values(?,?,?)";            
            con = this.conn;
            ps = con.prepareStatement(SQL);
            ps.setString(1,administradores.getAdmNome());
            ps.setString(2,administradores.getAdmSenha());
            ps.setString(3,administradores.getAdmLogon());            
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao Inserir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}    
    }
    
    public void excluir(AdministradorBeans administradores) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (administradores == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {                     
            con = this.conn;
            ps = con.prepareStatement("delete from tbladministradores where admNome=?");
            ps.setString(1,administradores.getAdmNome());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao excluir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
    
    public void atualizar(AdministradorBeans administradores) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;  
        if (administradores == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {            
            String SQL = "UPDATE tbladministradores SET admNome=?, admLogon=?, admSenha=? where admId=? ";            
            con = this.conn;
            ps = con.prepareStatement(SQL);                                               
            ps.setString(1,administradores.getAdmNome());            
            ps.setString(2,administradores.getAdmLogon());            
            ps.setString(3,administradores.getAdmSenha());
            ps.setInt(4,administradores.getAdmId());
            ps.executeUpdate();            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
        
    public ArrayList<AdministradorBeans> todosAdministradores()  throws Exception{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;         
        try { con = this.conn;                    
            ps = con.prepareStatement("SELECT * from tbladministradores");                       
            rs = ps.executeQuery();
            ArrayList <AdministradorBeans> lista = new ArrayList<AdministradorBeans>();            
            while(rs.next()) {
                Integer admId = rs.getInt(1);
                String admNome = rs.getString(2);             
                String admLogon = rs.getString(3);
                String admSenha = rs.getString(4);
                lista.add(new AdministradorBeans(admId,admNome,admLogon,admSenha));                
            }
            return lista;            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+  sqle);
        } finally {Conexao.closeConnection(con,ps);}
        
    }
    
    public ArrayList<AdministradorBeans> listarAdministradores(String nome)  throws Exception{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;         
        try { con = this.conn;                    
            ps = con.prepareStatement("SELECT * from tbladministradores where admNome like ?");                       
            ps.setString(1,"%" + nome + "%");
            rs = ps.executeQuery();
            ArrayList <AdministradorBeans> lista = new ArrayList<AdministradorBeans>();            
            while(rs.next()) {
                Integer admId = rs.getInt(1);
                String admNome = rs.getString(2);
                String admLogon = rs.getString(3); 
                String admSenha = rs.getString(4);                              
                lista.add(new AdministradorBeans(admId,admNome,admLogon,admSenha));                
            }
            return lista;            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+  sqle);
        } finally {Conexao.closeConnection(con,ps);}
        
    }
    
    public AdministradorBeans procurarAdministradores(String nome) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;  
        try { con = this.conn;
        
            ps = con.prepareStatement("SELECT * from tbladministradores where admNome like ?");                                    
            ps.setString(1,"%" + nome + "%");
            rs = ps.executeQuery();
            
           if ( !rs.next()) {
              throw new Exception("não foi encontrado nenhum "+ "administrador com o nome "+ nome);
           }
            int admId = rs.getInt(1);
            String admNome = rs.getString(2);
            String admSenha = rs.getString(3);
            String admLogon = rs.getString(4);            
            return new AdministradorBeans(admId,admNome,admLogon,admSenha);                                 
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }    

    
}
