
package br.persistencia;

import br.beans.AdministradorBeans;
import br.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author rlaecio
 */
public class LogonDAO {
    Connection conn;
    public LogonDAO() throws Exception {
        try {
            this.conn = Conexao.getConnection();
            
        } catch (Exception e) {
            throw new Exception("Erro "+ ":\n"+ e.getMessage());
        }
    }
    public AdministradorBeans logon(String logon, String senha) throws Exception {
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;  
        try { con = this.conn;
        
            ps = con.prepareStatement("SELECT * from tbladministradores where admLogon=? and admSenha=?");                                    
            ps.setString(1, logon);
            ps.setString(2, senha);
            rs = ps.executeQuery();
            
           if ( !rs.next()) {
              throw new Exception("não foi encontrado nenhum "+ "administrador com o nome "+ logon);
           }
            int admId = rs.getInt(1);
            String admNome = rs.getString(2);
            String admSenha = rs.getString(3);
            String admLogon = rs.getString(4);            
            return new AdministradorBeans(admId,admNome,admSenha,admLogon);                                 
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {Conexao.closeConnection(con,ps);}
    }    
    
}
