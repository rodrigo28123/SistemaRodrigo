/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.CompraRal;
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
public class CompraDAO extends DAO_Abstract {

    public CompraDAO(){
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
        Criteria criteria = session.createCriteria(CompraRal.class);
        criteria.add(Restrictions.eq("idcompraRal", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);

    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(CompraRal.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;

    }
    
     public List listNotaFiscal(String notaFiscal){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(CompraRal.class);
   criteria.add(Restrictions.like("notaFiscalRal", "%" + notaFiscal + "%"));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
    
    public List listCompraTotal(double compraTotal){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(CompraRal.class);
   criteria.add(Restrictions.le("compraTotalRal", compraTotal));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
      
    public List listNotaFiscalCompraTotal(String notaFiscal, double compraTotal){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(CompraRal.class);
   criteria.add(Restrictions.like("notaFiscalRal", "%" + notaFiscal + "%"));
      criteria.add(Restrictions.le("compraTotalRal", compraTotal));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
}

//public class CompraDAO extends DAO_Abstract {
//
//    @Override
//    public void insert(Object object) {
//       Compra compra = (Compra) object; 
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
//            String sql = "insert into compra values(?,?,?,?,?,?)";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(1, compra.getId_compra());
//            pstm.setInt(2, compra.getFk_cliente());
//            pstm.setDate(3, (java.sql.Date) new Date(2004,28,12));
//            pstm.setInt(4, compra.getTotal());
//            pstm.setInt(5, compra.getFk_fornecedor());
//            pstm.setInt(6, compra.getFk_funcionario());
//           
//           // pstm.setDate(6, (java.sql.Date) new Date(2004,28,12));
//            
//            
//            pstm.executeUpdate();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }   
//    }
//
//    @Override
//    public void update(Object object) {
//Compra compra = (Compra) object; 
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
//            String sql = "uptade compra set fk_cliente=?, dataDeCompra=?, total=?,"
//                    + " fk_fornecedor=?, fk_funcionario where id_compra=?";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(6, compra.getId_compra());
//            pstm.setInt(1, compra.getFk_cliente());
//            pstm.setDate(2, (java.sql.Date) new Date(2004,28,12));
//            pstm.setInt(3, compra.getTotal());
//            pstm.setInt(4, compra.getFk_fornecedor());
//            pstm.setInt(5, compra.getFk_funcionario());
//           
//           // pstm.setDate(6, (java.sql.Date) new Date(2004,28,12));
//            
//            
//            pstm.executeUpdate();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }   
//       
//    }
//
//    @Override
//    public void delete(Object object) {
//Compra compra = (Compra) object; 
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
//            String sql = "delete from compra where id_compra=?";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(1, compra.getId_compra());
//           
//           
//           // pstm.setDate(6, (java.sql.Date) new Date(2004,28,12));
//            
//            
//            pstm.executeUpdate();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }   
//    
//    }
//
//    @Override
//    public Object list(int id) {
//Compra compra  = new Compra(); 
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
//            String sql = "select * from compra where id_compra=?";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(1, id);
//           ResultSet rs = pstm.executeQuery();
//           if (rs.next() == true) {
//               compra.setId_compra( rs.getInt("id_compra"));
//               compra.setFk_cliente( rs.getInt("fk_cliente"));
//               compra.setDataDeCompra( rs.getString("dataDeCompra"));
//               compra.setTotal( rs.getInt("total"));
//               compra.setFk_fornecedor( rs.getInt("fk_fornecedor"));
//               compra.setFk_funcionario( rs.getInt("fk_funcionario"));
//             
//             }
//           
//       
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }  
//        return compra;    }
//
//    @Override
//    public List listAll() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//     public static void main(String[] args) {
//         Compra compra = new Compra();
//         compra.setId_compra(1);
//         compra.setFk_cliente(1);
//         //usuarios.setDataNascimento(null);
//         compra.setTotal(100);
//         compra.setFk_fornecedor(1);
//         compra.setFk_funcionario(1);
//         
//         
//        CompraDAO compraDAO = new CompraDAO();
//       compraDAO.insert(compra);
//       
//         System.out.print("deu certo");
//         
//     }
//}
         //usuarios.setDataNascimento(null);
         