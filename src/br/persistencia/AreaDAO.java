package br.persistencia;

import br.beans.AreaBeans;
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
public class AreaDAO {
    Connection conn;
    public AreaDAO() throws Exception {
        try {
            this.conn = Conexao.getConnection();            
        } catch (Exception e) {
            throw new Exception("Erro "+ ":\n"+ e.getMessage());
        }
    }
    
    public void salvar(AreaBeans area) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (area == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "INSERT INTO tblarea(areaNome,areaCodigo)"+"values(?,?)";            
            con = this.conn;
            ps = con.prepareStatement(SQL);
            ps.setString(1,area.getAreaNome());  
            ps.setString(2,area.getAreaCodigo());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao Inserir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    
    }
    
    public void excluir(AreaBeans area) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (area == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {                     
            con = this.conn;
            ps = con.prepareStatement("delete from tblarea where areaNome=?");
            ps.setString(1,area.getAreaNome());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao excluir dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
    
    public void atualizar(AreaBeans area) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        if (area == null)
            throw  new Exception("O valor Passado não pode ser nulo.");
        try {
            String SQL = "UPDATE tblarea SET areaNome=?, areaCodigo=? where areaId=?";
            
            con = this.conn;
            ps = con.prepareStatement(SQL);
            ps.setString(1,area.getAreaNome()); 
            ps.setString(2,area.getAreaCodigo());
            ps.setInt(3,area.getAreaId());
            ps.executeUpdate();            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+ sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }
        
    public ArrayList<AreaBeans> todasAreas()  throws Exception{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;         
        try { con = this.conn;                    
            ps = con.prepareStatement("SELECT * from tblarea");                       
            rs = ps.executeQuery();
            ArrayList <AreaBeans> lista = new ArrayList<AreaBeans>();            
            while(rs.next()) {
                Integer areaId = rs.getInt(1);
                String areaNome = rs.getString(2);
                String areaCodigo = rs.getString(3);
                lista.add(new AreaBeans(areaId,areaNome,areaCodigo));                
            }
            return lista;            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+  sqle);
        } finally {Conexao.closeConnection(con,ps);}        
    }       
    
    public ArrayList<AreaBeans> filtraAreas(String nome)  throws Exception{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;         
        try { con = this.conn;                    
            ps = con.prepareStatement("SELECT * from tblarea where areaNome like ?");                       
            ps.setString(1,"%" + nome + "%");
            rs = ps.executeQuery();
            ArrayList <AreaBeans> lista = new ArrayList<AreaBeans>();            
            while(rs.next()) {
                Integer areaId = rs.getInt(1);
                String areaNome = rs.getString(2);
                String areaCodigo = rs.getString(3);
                lista.add(new AreaBeans(areaId,areaNome,areaCodigo));                
            }
            return lista;            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados"+  sqle);
        } finally {Conexao.closeConnection(con,ps);}
        
    }       

    public AreaBeans procurarArea(String nome) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;  
        try { con = this.conn;
        
            ps = con.prepareStatement("SELECT * from tblarea where areaNome like ?");                                    
            ps.setString(1,"%" + nome + "%");
            rs = ps.executeQuery();
            
           if ( !rs.next()) {
              throw new Exception("não foi encontrado nenhum "+ "area com o nome "+ nome);
           }
            int areaId = rs.getInt(1);
            String areaNome = rs.getString(2);
            String areaCodigo = rs.getString(3);
            return new AreaBeans(areaId,areaNome,areaCodigo);                                 
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }          
}
