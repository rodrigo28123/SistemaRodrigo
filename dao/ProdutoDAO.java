/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;




import bean.ProdutoRal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Marcos
 */

public class ProdutoDAO extends DAO_Abstract {

    public ProdutoDAO() {
      
    }
 

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoRal.class);
        criteria.add(Restrictions.eq("idprodutoRal", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);

    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoRal.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;

    }
    
     public List listNome(String nome){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(ProdutoRal.class);
   criteria.add(Restrictions.like("nomeRal", "%" + nome + "%"));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
    
    public List listPreco(double preco){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(ProdutoRal.class);
   criteria.add(Restrictions.le("precoRal", preco ));
     List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
      
    public List listNomePreco(String nome, double preco){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(ProdutoRal.class);
   criteria.add(Restrictions.like("nomeRal", "%" + nome + "%"));
      criteria.add(Restrictions.le("precoRal", preco ));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
}



//public class ProdutoDAO extends DAO_Abstract {
//
//    @Override
//    public void insert(Object object) {
//       Produto produto = (Produto) object; 
//        try {
//            String url, user, password;
//            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
//           // url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
//            
//            user = "rodrigo_ledesma"; //user da escola
////            user = "root"; //user de casa
//            
//            password = "rodrigo_ledesma"; //password da escola
////           password = ""; //password de casa
//            
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection cnt;
//            cnt = DriverManager.getConnection(url, user, password);
//            PreparedStatement pstm;
//            String sql = "insert into produto values(?,?,?,?,?,?)";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(1, produto.getId_produto());
//            pstm.setString(2, produto.getNome());
//            pstm.setString(3, produto.getQuantidade());
//            pstm.setString(4, produto.getDescricao());
//            pstm.setString(5, produto.getGenero());
//            pstm.setString(6, produto.getPreço());
//            
//           
//           // pstm.setDate(6, (java.sql.Date) new Date(2004,28,12));
//            
//            
//            pstm.executeUpdate();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }   
//    }
//
//    @Override
//    public void update(Object object) {
//        Produto produto = (Produto) object;
//          try {
//            String url, user, password;
//            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
////            url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
//            
//            user = "rodrigo_ledesma"; //user da escola
////            user = "root"; //user de casa
//            
//            password = "rodrigo_ledesma"; //password da escola
////            password = ""; //password de casa
//            
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection cnt;
//            cnt = DriverManager.getConnection(url, user, password);
//            PreparedStatement pstm;
//            String sql = "update produto set nome=?, quantidade=?, descricao=?,"
//                    + "genero=?, preço=? where id_produto=?";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(6, produto.getId_produto());
//            pstm.setString(1, produto.getNome());
//            pstm.setString(2, produto.getQuantidade());
//            pstm.setString(3, produto.getDescricao());
//            pstm.setString(4, produto.getGenero());
//            pstm.setString(5, produto.getPreço());
//            pstm.executeUpdate();
//           
//           // pstm.setDate(6, (java.sql.Date) new Date(2004,28,12));
//            
//            
//            
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }   
//    }
//
//    @Override
//    public void delete(Object object) {
//        Produto produto = (Produto) object;
//          try {
//            String url, user, password;
//            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
////            url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
//            
//            user = "rodrigo_ledesma"; //user da escola
////            user = "root"; //user de casa
//            
//            password = "rodrigo_ledesma"; //password da escola
////            password = ""; //password de casa
//            
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection cnt;
//            cnt = DriverManager.getConnection(url, user, password);
//            PreparedStatement pstm;
//            String sql = "delete from produto where id_produto=?";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(1, produto.getId_produto());
//          
//           
//           // pstm.setDate(6, (java.sql.Date) new Date(2004,28,12));
//            
//            
//            pstm.executeUpdate();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }   
//    }
//
//    @Override
//    public Object list(int id) {
//       Produto produto = new Produto();  
//        try {
//            String url, user, password;
//            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
////            url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
//           
//            user = "rodrigo_ledesma"; //user da escola
////            user = "root"; //user de casa
//            
//           password = "rodrigo_ledesma"; //password da escola
////            password = ""; //password de casa
//            
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection cnt;
//            cnt = DriverManager.getConnection(url, user, password);
//            PreparedStatement pstm;
//            String sql = "select * from produto where id_produto=?";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(1, id);
//            ResultSet rs = pstm.executeQuery();
//            if (rs.next() == true){
//           produto.setId_produto( rs.getInt("id_produto"));
//           produto.setNome( rs.getString("nome"));
//           produto.setQuantidade( rs.getString("quantidade"));
//           produto.setDescricao( rs.getString("descricao"));
//           produto.setGenero( rs.getString("genero"));
//           produto.setPreço(rs.getString("preço"));
//          
//            }
//           
//           // pstm.setDate(6, (java.sql.Date) new Date(2004,28,12));
//            
//            
//           
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//        return produto;
//    }
//
//    @Override
//    public List listAll() {
//          List lista = new ArrayList();
//        try {
//            String url, user, password;
//            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
////            url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
//            
//            user = "rodrigo_ledesma"; //user da escola
////            user = "root"; //user de casa
//            
//            password = "rodrigo_ledesma"; //password da escola
////            password = ""; //password de casa
//            
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection cnt;
//            cnt = DriverManager.getConnection(url, user, password);
//            PreparedStatement pstm;
//            String sql = "select * from produto ";
//            pstm = cnt.prepareStatement(sql);
//            ResultSet rs = pstm.executeQuery();
//           while (rs.next() == true) {
//               Produto produto  = new Produto();
//           produto.setId_produto( rs.getInt("id_produto"));
//           produto.setNome( rs.getString("nome"));
//           produto.setQuantidade( rs.getString("quantidade"));
//           produto.setDescricao( rs.getString("descricao"));
//           produto.setGenero( rs.getString("genero"));
//           produto.setPreço(rs.getString("preço"));
//              lista.add(produto);
//             }
//           
//       
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }  
//        return lista;    }
//     public static void main(String[] args) {
//         Produto produto = new Produto();
//         produto.setId_produto(25);
//         produto.setNome("Quatro Vidas de um cachorro");
//         produto.setQuantidade("1");
//         produto.setDescricao("Um Livro sobre um cachorro que quando morre, ele reencarna novamente, em busca de seu dono.");
//         produto.setGenero("Drama");
//         produto.setPreço("200");
//        
//         
//         
//          ProdutoDAO produtoDAO = new ProdutoDAO();
//       produtoDAO.insert(produto);
//       
//         System.out.print("deu certo");
//         
//     }
//}
         //usuarios.setDataNascimento(null);
         