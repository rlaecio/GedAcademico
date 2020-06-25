
package br.persistencia;

import br.beans.CategoriaBeans;
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
public class CategoriaDAO {
    Connection conn;
    public CategoriaDAO() throws Exception {
        try {
            this.conn = Conexao.getConnection();            
        } catch (Exception e) {
            throw new Exception("Erro "+ ":\n"+ e.getMessage());
        }
    }
    
    public void salvar(CategoriaBeans categoria) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (categoria == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "INSERT INTO tblcategoria(categoriaNome,categoriaCodigo)"+"values(?,?)";            
            con = this.conn;
            ps = con.prepareStatement(SQL);
            ps.setString(1,categoria.getCategoriaNome());
            ps.setString(2,categoria.getCategoriaCodigo());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao Inserir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    
    }
    
    public void excluir(CategoriaBeans categoria) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (categoria == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
                     
            con = this.conn;
            ps = con.prepareStatement("delete from tblcategoria where categoriaNome=?");
            ps.setString(1,categoria.getCategoriaNome());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao excluir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
    
    public void atualizar(CategoriaBeans categoria) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (categoria == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "UPDATE client SET categoriaNome=?, categoriaCodigo=? where categoriaId=?";
            
            con = this.conn;
            ps = con.prepareStatement(SQL);
            ps.setString(1,categoria.getCategoriaNome());      
            ps.setString(2,categoria.getCategoriaCodigo());
            ps.setInt(3,categoria.getCategoriaId());
            ps.executeUpdate();            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
        
    public ArrayList<CategoriaBeans> todasCategorias()  throws Exception{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;         
        try { con = this.conn;                    
            ps = con.prepareStatement("SELECT * from tblcategoria");                       
            rs = ps.executeQuery();
            ArrayList <CategoriaBeans> lista = new ArrayList<CategoriaBeans>();            
            while(rs.next()) {
                Integer categoriaId = rs.getInt(1);
                String categoriaNome = rs.getString(2);
                String categoriaCodigo = rs.getString(3);
                lista.add(new CategoriaBeans(categoriaId, categoriaNome, categoriaCodigo));                
            }
            return lista;            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+  sqle);
        } finally {Conexao.closeConnection(con,ps);}        
    }       
    
    public ArrayList<CategoriaBeans> filtraCategoria(String nome)  throws Exception{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;         
        try { con = this.conn;                    
            ps = con.prepareStatement("SELECT * from tblcategoria where categoriaNome like ?");                       
            ps.setString(1,"%" + nome + "%");
            rs = ps.executeQuery();
            ArrayList <CategoriaBeans> lista = new ArrayList<CategoriaBeans>();            
            while(rs.next()) {
                Integer categoriaId = rs.getInt(1);
                String categoriaNome = rs.getString(2);
                String categoriaCodigo = rs.getString(3);
                lista.add(new CategoriaBeans(categoriaId, categoriaNome, categoriaCodigo));                
            }
            return lista;            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+  sqle);
        } finally {Conexao.closeConnection(con,ps);}        
    }       
           
    public CategoriaBeans procurarCategoria(String nome) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;  
        try { con = this.conn;
        
            ps = con.prepareStatement("SELECT * from tblcategoria where categoriaNome like ?");                                    
            ps.setString(1,"%" + nome + "%");
            rs = ps.executeQuery();
            
           if ( !rs.next()) {
              throw new Exception("não foi encontrado nenhum "+ "categoria com o nome "+ nome);
           }
            int categoriaId = rs.getInt(1);
            String categoriaNome = rs.getString(2);
            String categoriaCodigo = rs.getString(3);
            return new CategoriaBeans(categoriaId,categoriaNome,categoriaCodigo);                                 
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }          
}
