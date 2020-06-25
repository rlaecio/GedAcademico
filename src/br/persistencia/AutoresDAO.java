/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.persistencia;

import br.beans.AutoresBeans;
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
public class AutoresDAO {
    Connection conn;
    public AutoresDAO() throws Exception {
        try {
            this.conn = Conexao.getConnection();
            
        } catch (Exception e) {
            throw new Exception("Erro "+ ":\n"+ e.getMessage());
        }
    }
    
    public void salvar(AutoresBeans autores) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (autores == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "INSERT INTO tblautores(autorNome,autorEmail,autorCidade,autorEndereco,autorFone,autorCelular)"+"values(?,?,?,?,?,?)";            
            con = this.conn;
            ps = con.prepareStatement(SQL);
            ps.setString(1,autores.getAutorNome());
            ps.setString(2,autores.getAutorEmail());
            ps.setString(3,autores.getAutorEndereco());
            ps.setString(4,autores.getAutorCidade());            
            ps.setString(5,autores.getAutorFone());
            ps.setString(6,autores.getAutorCelular());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao Inserir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}    
    }
    
    public void excluir(AutoresBeans autores) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (autores == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {                     
            con = this.conn;
            ps = con.prepareStatement("delete from tblautores where autorNome=?");
            ps.setString(1,autores.getAutorNome());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao excluir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
    
    public void atualizar(AutoresBeans autores) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;  
        if (autores == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {            
            String SQL = "UPDATE tblautores SET autorNome=?, autorEmail=?, autorCidade=?, autorEndereco=?,"
                    + "autorFone=?, autorCelular=? where autorId=? ";            
            con = this.conn;
            ps = con.prepareStatement(SQL);                                               
            ps.setString(1,autores.getAutorNome());
            ps.setString(2,autores.getAutorEmail());
            ps.setString(3,autores.getAutorCidade());
            ps.setString(4,autores.getAutorEndereco());
            ps.setString(5,autores.getAutorFone());
            ps.setString(6,autores.getAutorCelular());        
            ps.setInt(7,autores.getAutorId());
            ps.executeUpdate();            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
        
    public ArrayList<AutoresBeans> todosAutores()  throws Exception{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null; 
        
        try { con = this.conn;                    
            ps = con.prepareStatement("SELECT * from tblautores");                       
            rs = ps.executeQuery();
            ArrayList <AutoresBeans> lista = new ArrayList<AutoresBeans>();            
            while(rs.next()) {
                Integer autorId = rs.getInt(1);
                String autorNome = rs.getString(2);
                String autorEndereco = rs.getString(3);
                String autorCidade = rs.getString(4);
                String autorEmail = rs.getString(5);
                String autorFone = rs.getString(6);
                String autorCelular = rs.getString(7);
                lista.add(new AutoresBeans(autorId, autorNome, autorEmail, autorCidade, autorEndereco, autorFone, autorCelular));                
            }
            return lista;            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+  sqle);
        } finally {Conexao.closeConnection(con,ps);}        
    }
    
    public ArrayList<AutoresBeans> filtraAutores(String nome)  throws Exception{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null; 
        
        try { con = this.conn;                    
            ps = con.prepareStatement("SELECT * from tblautores where autorNome like ?"); 
            ps.setString(1,"%" + nome + "%");
            rs = ps.executeQuery();
            ArrayList <AutoresBeans> lista = new ArrayList<AutoresBeans>();            
            while(rs.next()) {
                Integer autorId = rs.getInt(1);
                String autorNome = rs.getString(2);
                String autorEndereco = rs.getString(3);
                String autorCidade = rs.getString(4);
                String autorEmail = rs.getString(5);
                String autorFone = rs.getString(6);
                String autorCelular = rs.getString(7);
                lista.add(new AutoresBeans(autorId, autorNome, autorEmail, autorCidade, autorEndereco, autorFone, autorCelular));                
            }
            return lista;
            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+  sqle);
        } finally {Conexao.closeConnection(con,ps);}
        
    }
    
    public AutoresBeans procurarAutores(String nome) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;  
        try { con = this.conn;
        
            ps = con.prepareStatement("SELECT * from tblautores where autorNome like ?");                                    
            ps.setString(1,"%" + nome + "%");
            rs = ps.executeQuery();
            
           if ( !rs.next()) {
              throw new Exception("não foi encontrado nenhum "+ "autor com o nome "+ nome);
           }
            int autorId = rs.getInt(1);
            String autorNome = rs.getString(2);
            String autorEndereco = rs.getString(3);
            String autorCidade = rs.getString(4);
            String autorEmail = rs.getString(5);
            String autorFone = rs.getString(6);
            String autorCelular = rs.getString(7);            
            return new AutoresBeans(autorId,autorNome,autorEndereco, autorCidade, autorEmail, autorFone, autorCelular);                                 
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }    
}
