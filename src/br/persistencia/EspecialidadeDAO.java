/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.persistencia;

import br.beans.EspecialidadeBeans;
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
public class EspecialidadeDAO {
    Connection conn;
    public EspecialidadeDAO() throws Exception {
        try {
            this.conn = Conexao.getConnection();            
        } catch (Exception e) {
            throw new Exception("Erro "+ ":\n"+ e.getMessage());
        }
    }
    
    public void salvar(EspecialidadeBeans especialidade) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (especialidade == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "INSERT INTO tblespecialidade(especialidadeNome,especialidadeCodigo)"+"values(?,?)";
            
            con = this.conn;
            ps = con.prepareStatement(SQL);
            ps.setString(1,especialidade.getEspecialidadeNome());            
            ps.setString(2,especialidade.getEspecialidadeCodigo());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao Inserir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}    
    }
    
    public void excluir(EspecialidadeBeans especialidade) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (especialidade == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
                     
            con = this.conn;
            ps = con.prepareStatement("delete from tblespecialidade where especialidadeNome=?");
            ps.setString(1,especialidade.getEspecialidadeNome());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao excluir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
    
    public void atualizar(EspecialidadeBeans especialidade) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (especialidade == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "UPDATE tblespecialidade SET especialidadeNome=?, especialidadeCodigo=? where especialidadeId=?";
            
            con = this.conn;
            ps = con.prepareStatement(SQL);
            ps.setString(1,especialidade.getEspecialidadeNome()); 
            ps.setString(2,especialidade.getEspecialidadeCodigo());
            ps.setInt(3,especialidade.getEspecialidadeId());
            ps.executeUpdate();            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
        
    public ArrayList<EspecialidadeBeans> todasEspecialidades()  throws Exception{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;         
        try { con = this.conn;                    
            ps = con.prepareStatement("SELECT * from tblespecialidade");                       
            rs = ps.executeQuery();
            ArrayList <EspecialidadeBeans> lista = new ArrayList<EspecialidadeBeans>();            
            while(rs.next()) {
                Integer especialidadeId = rs.getInt(1);
                String especialidadeNome = rs.getString(2);
                String especialidadeCodigo = rs.getString(3);
                lista.add(new EspecialidadeBeans(especialidadeId,especialidadeNome,especialidadeCodigo));                
            }
            return lista;            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+  sqle);
        } finally {Conexao.closeConnection(con,ps);}        
    }       
    
    public ArrayList<EspecialidadeBeans> filtrarEspecialidades(String nome)  throws Exception{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;         
        try { con = this.conn;                    
            ps = con.prepareStatement("SELECT * from tblespecialidade where especialidadeNome like ?");                       
            ps.setString(1,"%" + nome + "%");
            rs = ps.executeQuery();
            
            ArrayList <EspecialidadeBeans> lista = new ArrayList<EspecialidadeBeans>();            
            while(rs.next()) {
                Integer especialidadeId = rs.getInt(1);
                String especialidadeNome = rs.getString(2);
                String especialidadeCodigo = rs.getString(3);
                lista.add(new EspecialidadeBeans(especialidadeId,especialidadeNome,especialidadeCodigo));                
            }
            return lista;            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+  sqle);
        } finally {Conexao.closeConnection(con,ps);}        
    }

    public EspecialidadeBeans procurarEspecialidade(String nome) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;  
        try { con = this.conn;
        
            ps = con.prepareStatement("SELECT * from tblespecialidade where especialidadeNome like ?");                                    
            ps.setString(1,"%" + nome + "%");
            rs = ps.executeQuery();
            
           if ( !rs.next()) {
              throw new Exception("não foi encontrado nenhum "+ "especialidade com o nome "+ nome);
           }
            int especialidadeId = rs.getInt(1);
            String especialidadeNome = rs.getString(2);
            String especialidadeCodigo = rs.getString(3);
            return new EspecialidadeBeans(especialidadeId,especialidadeNome,especialidadeCodigo);                                 
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }          
}
