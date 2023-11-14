/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.FornecedorRal;
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
public class FornecedorDAO extends DAO_Abstract {
    public FornecedorDAO() {
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
        Criteria criteria = session.createCriteria(FornecedorRal.class);
        criteria.add(Restrictions.eq("idfornecedorRal", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);

    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FornecedorRal.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;

    }
    
    
     public List listApelido(String apelido){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(FornecedorRal.class);
   criteria.add(Restrictions.like("apelidoRal", "%" + apelido + "%"));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
    
    public List listEmail(String email){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(FornecedorRal.class);
   criteria.add(Restrictions.like("emailRal", "%" + email + "%"));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
      
    public List listApelidoEmail(String apelido, String email){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(FornecedorRal.class);
   criteria.add(Restrictions.like("nomeRal", "%" + apelido + "%"));
      criteria.add(Restrictions.like("emailRal", "%" + email + "%"));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
}
//public class FornecedorDAO extends DAO_Abstract {

//    @Override
//    public void insert(Object object) {
//      Fornecedor fornecedor = (Fornecedor) object; 
//        try {
//            String url, user, password;
////            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
//            url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
//            
////            user = "rodrigo_ledesma"; //user da escola
//            user = "root"; //user de casa
//            
////            password = "rodrigo_ledesma"; //password da escola
//            password = ""; //password de casa
//            
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection cnt;
//            cnt = DriverManager.getConnection(url, user, password);
//            PreparedStatement pstm;
//            String sql = "insert into fornecedor values(?,?,?,?,?)";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(1, fornecedor.getId_fornecedor());
//            pstm.setString(2, fornecedor.getNome());
//            pstm.setString(3, fornecedor.getCpf());
//            pstm.setString(4, fornecedor.getRg());
//            pstm.setString(5, fornecedor.getEmail());
//           
//           // pstm.setDate(6, (java.sql.Date) new Date(2004,28,12));
//            
//            
//            pstm.executeUpdate();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }   
//    }
//
//    @Override
//    public void update(Object object) {
//Fornecedor fornecedor = (Fornecedor) object; 
//        try {
//            String url, user, password;
////            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
//            url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
//            
////            user = "rodrigo_ledesma"; //user da escola
//            user = "root"; //user de casa
//            
////            password = "rodrigo_ledesma"; //password da escola
//            password = ""; //password de casa
//            
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection cnt;
//            cnt = DriverManager.getConnection(url, user, password);
//            PreparedStatement pstm;
//            String sql = "update fornecedor set nome=?, cpf=?, rg=?, email=?"
//                    + "where id_fornecedor=?";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(5, fornecedor.getId_fornecedor());
//            pstm.setString(1, fornecedor.getNome());
//            pstm.setString(2, fornecedor.getCpf());
//            pstm.setString(3, fornecedor.getRg());
//            pstm.setString(4, fornecedor.getEmail());
//           
//           // pstm.setDate(6, (java.sql.Date) new Date(2004,28,12));
//            
//            
//            pstm.executeUpdate();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }   
//    }
//
//    @Override
//    public void delete(Object object) {
//Fornecedor fornecedor = (Fornecedor) object; 
//        try {
//            String url, user, password;
////            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
//            url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
//            
////            user = "rodrigo_ledesma"; //user da escola
//            user = "root"; //user de casa
//            
////            password = "rodrigo_ledesma"; //password da escola
//            password = ""; //password de casa
//            
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection cnt;
//            cnt = DriverManager.getConnection(url, user, password);
//            PreparedStatement pstm;
//            String sql = "delete from fornecedor where id_fornecedor=?";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(1, fornecedor.getId_fornecedor());
//            
//           // pstm.setDate(6, (java.sql.Date) new Date(2004,28,12));
//            
//            
//            pstm.executeUpdate();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//    }
//
//    @Override
//    public Object list(int id) {
//        
//Fornecedor fornecedor  = new Fornecedor(); 
//        try {
//            String url, user, password;
////            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
//            url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
//            
////            user = "rodrigo_ledesma"; //user da escola
//            user = "root"; //user de casa
//            
////            password = "rodrigo_ledesma"; //password da escola
//            password = ""; //password de casa
//            
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection cnt;
//            cnt = DriverManager.getConnection(url, user, password);
//            PreparedStatement pstm;
//            String sql = "select * from fornecedor where id_fornecedor=?";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(1, id);
//           ResultSet rs = pstm.executeQuery();
//           if (rs.next() == true) {
//              fornecedor.setId_fornecedor( rs.getInt("id_fornecedor"));
//              fornecedor.setNome( rs.getString("nome"));
//              fornecedor.setCpf( rs.getString("cpf"));
//              fornecedor.setRg( rs.getString("rg"));
//              fornecedor.setEmail( rs.getString("email"));
//              
//             }
//           
//       
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }  
//        return fornecedor;
//    
//    }
//    
//
//    @Override
//    public List listAll() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//     public static void main(String[] args) {
//         Fornecedor fornecedor = new Fornecedor();
//         fornecedor.setId_fornecedor(5);
//         fornecedor.setNome("Claudio");
//         fornecedor.setCpf("233.569.563-45");
//         fornecedor.setRg("54.324.322");
//           fornecedor.setEmail("rodriguinsla@gmail");
//         
//         
//        FornecedorDAO fornecedorDAO = new FornecedorDAO();
//       fornecedorDAO.insert(fornecedor);
//       
//         System.out.print("deu certo");
//         
//     }
//}
         //usuarios.setDataNascimento(null);
         