/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.UsuariosRal;
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

public class UsuariosDAO extends DAO_Abstract {
    
   
    
    public UsuariosDAO() {
       
    
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
    Criteria criteria = session.createCriteria(UsuariosRal.class);
    criteria.add(Restrictions.eq("idusuariosRal", id));
    List lista =criteria.list();
    session.getTransaction().commit();
    return lista.get(0);
        
    }

    @Override
    public List listAll() {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(UsuariosRal.class);
    List lista =criteria.list();
    session.getTransaction().commit();
    return (ArrayList) lista;
   
    }
    
    public List listNome(String nome){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(UsuariosRal.class);
   criteria.add(Restrictions.like("nomeRal", "%" + nome + "%"));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
    
    public List listCpf(String cpf){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(UsuariosRal.class);
   criteria.add(Restrictions.like("cpfRal", "%" + cpf + "%"));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
      
    public List listNomeCpf(String cpf, String nome){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(UsuariosRal.class);
          criteria.add(Restrictions.like("cpfRal", "%" + cpf + "%"));
   criteria.add(Restrictions.like("nomeRal", "%" + nome + "%"));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
    
    
    
//     public List Busca(String nome){
//        session.beginTransaction();
//    Criteria criteria = session.createCriteria(UsuariosRal.class);
//   criteria.add(Restrictions.eq("nomeRal", "%" + nome + "%"));
//   List lista = criteria.list();
//    session.getTransaction().commit();
//   return  lista;
//
//    }
    
     public List buscar(String cmp, String valor){
         session.beginTransaction();
    Criteria criteria = session.createCriteria(UsuariosRal.class);
   criteria.add(Restrictions.eq(cmp, valor));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
     }
}

















//    @Override
//    public void insert(Object object) {
//        Usuarios usuarios = (Usuarios) object; 
//        try {
//            String url, user, password;
//            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
////            url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
////            
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
//            String sql = "insert into usuarios values(?,?,?,?,?,?,?,?)";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(1, usuarios.getIdUsuarios());
//            pstm.setString(2, usuarios.getNome());
//            pstm.setString(3, usuarios.getApelido());
//            pstm.setString(4, usuarios.getCpf());
//            pstm.setDate(5, (java.sql.Date) new Date(2023,01,01));
//            pstm.setString(6, usuarios.getSenha());
//            pstm.setInt(7, usuarios.getNivel());
//            pstm.setString(8, usuarios.getAtivo());
//            pstm.executeUpdate();
//            
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }   
//    }
//
//    @Override
//    public void update(Object object) {
//         Usuarios usuarios = (Usuarios) object; 
//        try {
//            String url, user, password;
//            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
////            url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
//            
//          user = "rodrigo_ledesma"; //user da escola
////            user = "root"; //user de casa
//            
//            password = "rodrigo_ledesma"; //password da escola
////            password = ""; //password de casa
//            
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection cnt;
//            cnt = DriverManager.getConnection(url, user, password);
//            PreparedStatement pstm;
//            String sql = "update usuarios set nome=?, apelido=?, cpf=?, dataNascimento=?,"
//                    + "senha=?, nivel=?, ativo=? where idusuarios=?";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(8, usuarios.getIdUsuarios());
//            pstm.setString(1, usuarios.getNome());
//            pstm.setString(2, usuarios.getApelido());
//            pstm.setString(3, usuarios.getCpf());
//            pstm.setDate(4, (java.sql.Date) new Date(2004,28,12));
//            pstm.setString(5, usuarios.getSenha());
//            pstm.setInt(6, usuarios.getNivel());
//            pstm.setString(7, usuarios.getAtivo());
//            pstm.executeUpdate();
//            
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }   
//    }
//
//    @Override
//    public void delete(Object object) {
//        Usuarios usuarios = (Usuarios) object; 
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
//            String sql = "delete from usuarios where idusuarios=?";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(1, usuarios.getIdUsuarios());
//            pstm.executeUpdate();
//            
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }   
//    }
//
//    @Override
//    public Object list(int id) {
//       Usuarios usuarios  = new Usuarios(); 
//        try {
//            String url, user, password;
//           url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
////              url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
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
//            String sql = "select * from usuarios where idusuarios=?";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(1, id);
//           ResultSet rs = pstm.executeQuery();
//           if (rs.next() == true) {
//               usuarios.setIdUsuarios( rs.getInt("idusuarios"));
//               usuarios.setNome( rs.getString("nome"));
//               usuarios.setApelido( rs.getString("apelido"));
//               usuarios.setCpf( rs.getString("cpf"));
//               usuarios.setDataNascimento(rs.getDate("dataNascimento"));
//               usuarios.setSenha( rs.getString("senha"));
//               usuarios.setNivel( rs.getInt("nivel"));
//               usuarios.setAtivo( rs.getString("ativo"));
//               
//             }
//           
//       
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }  
//        return usuarios;
//    }
//
//    @Override
//    public List listAll() {
//       
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
//            String sql = "select * from usuarios ";
//            pstm = cnt.prepareStatement(sql);
//            ResultSet rs = pstm.executeQuery();
//           while (rs.next() == true) {
//               Usuarios usuarios  = new Usuarios();
//               usuarios.setIdUsuarios( rs.getInt("idusuarios"));
//               usuarios.setNome( rs.getString("nome"));
//               usuarios.setApelido( rs.getString("apelido"));
//               usuarios.setCpf( rs.getString("cpf"));
//               usuarios.setDataNascimento(rs.getDate("dataNascimento"));
//               usuarios.setSenha( rs.getString("senha"));
//               usuarios.setNivel( rs.getInt("nivel"));
//               usuarios.setAtivo( rs.getString("ativo"));
//               lista.add(usuarios);
//             }
//           
//       
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }  
//        return lista;
//    }
//     public static void main(String[] args) {
//         Usuarios usuarios = new Usuarios();
//         usuarios.setIdUsuarios(2);
//         usuarios.setNome("Rodrigo");
//         usuarios.setApelido("Digo");
//         usuarios.setCpf("270.465.433-95");
//         //usuarios.setDataNascimento(null);
//         usuarios.setSenha("173");
//         usuarios.setNivel(1);
//         usuarios.setAtivo("s");
//        
//         
//         
//       UsuariosDAO usuariosDAO = new UsuariosDAO();
//       usuariosDAO.insert(usuarios);
//       
//         System.out.print("deu certo");
//    }
//}
