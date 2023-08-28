/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.CompraProduto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class CompraProdutoDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
       CompraProduto compraProduto = (CompraProduto) object; 
        try {
            String url, user, password;
//            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
            url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
            
//            user = "rodrigo_ledesma"; //user da escola
            user = "root"; //user de casa
            
//            password = "rodrigo_ledesma"; //password da escola
            password = ""; //password de casa
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pstm;
            String sql = "insert into compra_produto values(?,?,?,?,?)";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, compraProduto.getIdcompra_produto());
            pstm.setInt(2, compraProduto.getFk_compra());
            pstm.setInt(3, compraProduto.getFk_produto());
            pstm.setInt(4, compraProduto.getQuantidade());
            pstm.setInt(5, compraProduto.getValor_unitario());
           
           
           // pstm.setDate(6, (java.sql.Date) new Date(2004,28,12));
            
            
            pstm.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CompraProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CompraProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    @Override
    public void update(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public static void main(String[] args) {
         CompraProduto compraProduto = new CompraProduto();
         compraProduto.setIdcompra_produto(1);
         compraProduto.setFk_compra(1);
         compraProduto.setFk_produto(1);
         compraProduto.setQuantidade(20);
         compraProduto.setValor_unitario(200);
         
         
        CompraProdutoDAO compraProdutoDAO = new CompraProdutoDAO();
       compraProdutoDAO.insert(compraProduto);
       
         System.out.print("deu certo");
         
     }
}
         //usuarios.setDataNascimento(null);
         