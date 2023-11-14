/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;



import bean.FuncionarioRal;
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

public class FuncionarioDAO extends DAO_Abstract {

    public FuncionarioDAO() {
    }

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        //session.update(object);
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
        Criteria criteria = session.createCriteria(FuncionarioRal.class);
        criteria.add(Restrictions.eq("idfuncionarioRal", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);

    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FuncionarioRal.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;

    }
    
    
     public List listEmail(String email){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(FuncionarioRal.class);
   criteria.add(Restrictions.like("emailRal", "%" + email + "%"));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
    
    public List listSalario(double salario){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(FuncionarioRal.class);
   criteria.add(Restrictions.le("salarioRal", salario));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
      
    public List listEmailSalario(String email, double salario){
        session.beginTransaction();
    Criteria criteria = session.createCriteria(FuncionarioRal.class);
   criteria.add(Restrictions.like("emailRal", "%" + email + "%"));
      criteria.add(Restrictions.le("salarioRal", salario));
   List lista = criteria.list();
    session.getTransaction().commit();
   return  lista;
    }
}

//public class FuncionarioDAO extends DAO_Abstract {
//    public FuncionarioDAO(){
//}
//
//    @Override
//    public void insert(Object object) {
//       Funcionario funcionario = (Funcionario) object; 
//        try {
//            String url, user, password;
////            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
//           url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
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
//            String sql = "insert into funcionario values(?,?,?,?,?)";
//            pstm = cnt.prepareStatement(sql); 
//            pstm.setInt(1, funcionario.getId_funcionario());
//            pstm.setString(2, funcionario.getNome());
//            pstm.setString(3, funcionario.getCpf());
//            pstm.setString(4, funcionario.getEmail());
//            pstm.setString(5, funcionario.getRg());
//            pstm.executeUpdate();
//           // pstm.setDate(6, (java.sql.Date) new Date(2004,28,12));
//            
//            
//           
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }   
//    }
//
//    @Override
//    public void update(Object object) {
//        Funcionario funcionario = (Funcionario) object; 
//        try {
//            String url, user, password;
////            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
//            url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
//            
////            user = "rodrigo_ledesma"; //user da escola
//           user = "root"; //user de casa
//            
////            password = "rodrigo_ledesma"; //password da escola
//            password = ""; //password de casa
//            
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection cnt;
//            cnt = DriverManager.getConnection(url, user, password);
//            PreparedStatement pstm;
//            String sql = "update funcionario set nome=?, cpf=?, email=?, rg=? where id_funcionario=?";
//                    
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(5, funcionario.getId_funcionario());
//            pstm.setString(1, funcionario.getNome());
//            pstm.setString(2, funcionario.getCpf());
//            pstm.setString(3, funcionario.getEmail());
//            pstm.setString(4, funcionario.getRg());
//            pstm.executeUpdate();
//           // pstm.setDate(6, (java.sql.Date) new Date(2004,28,12));
//            
//            
//           
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }   
//    }
//
//    @Override
//    public void delete(Object object) {
//       Funcionario funcionario = (Funcionario) object; 
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
//            String sql = "delete from funcionario where id_funcionario=?";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(1, funcionario.getId_funcionario());
//            
//           
//           // pstm.setDate(6, (java.sql.Date) new Date(2004,28,12));
//            
//            
//            pstm.executeUpdate();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }   
//    }
//
//    @Override
//    public Object list(int id) {
//        Funcionario funcionario = new Funcionario();
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
//            String sql = "select * from funcionario where id_funcionario=?";
//            pstm = cnt.prepareStatement(sql);
//            pstm.setInt(1, id);
//           ResultSet rs = pstm.executeQuery();
//           if (rs.next() == true) {
//               funcionario.setId_funcionario( rs.getInt("id_funcionario"));
//               funcionario.setNome( rs.getString("nome"));
//               funcionario.setCpf( rs.getString("cpf"));
//               funcionario.setEmail( rs.getString("email"));
//               funcionario.setRg( rs.getString("rg"));
//           
//             }
//           
//       
//        }catch (ClassNotFoundException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }  
//      return funcionario;  
//    }
//
//    @Override
//    public List listAll() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//     public static void main(String[] args) {
//         Funcionario funcionario = new Funcionario();
//         funcionario.setId_funcionario(5);
//         funcionario.setNome("Rogerio");
//         funcionario.setCpf("223.234.456-32");
//         funcionario.setEmail("rogerio.batista45@gmail.com");
//         funcionario.setRg("8.545.455");
//         
//         
//        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
//       funcionarioDAO.insert(funcionario);
//       
//         System.out.print("deu certo");
//         
//     }
//}
//         //usuarios.setDataNascimento(null);
         