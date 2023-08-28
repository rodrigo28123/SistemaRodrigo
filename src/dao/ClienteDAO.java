/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.Cliente;
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

/**
 *
 * @author Marcos
 */
public class ClienteDAO extends DAO_Abstract {
public ClienteDAO(){
}
    
    @Override
    public void insert(Object object) {
       Cliente cliente = (Cliente) object; 
        try {
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
//            url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
            
            user = "rodrigo_ledesma"; //user da escola
//            user = "root"; //user de casa
            
            password = "rodrigo_ledesma"; //password da escola
//           password = ""; //password de casa
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pstm;
            String sql = "insert into cliente values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, cliente.getId_cliente());
            pstm.setString(2, cliente.getNome());
            pstm.setString(3, cliente.getApelido());
            pstm.setString(4, cliente.getEndereço());
            pstm.setString(5, cliente.getCep());
            pstm.setString(6, cliente.getCidade());
            pstm.setString(7, cliente.getComplemento());
            pstm.setString(8, cliente.getTelefone());
            pstm.setString(9, cliente.getEmail());
            pstm.setString(10, cliente.getCpf());
            pstm.setString(11, cliente.getRg());
            pstm.setDate(12, (java.sql.Date) new Date(2004,28,12));
            pstm.setString(13, cliente.getTipoContaBancaria());
            pstm.setString(14, cliente.getNumeroAgenciaBancaria());
            pstm.setString(15, cliente.getNumeroContaBancaria());
          
            pstm.executeUpdate();
           // pstm.setDate(6, (java.sql.Date) new Date(2004,28,12));
            
            
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    @Override
    public void update(Object object) {
Cliente cliente = (Cliente) object; 
        try {
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
//            url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
            
            user = "rodrigo_ledesma"; //user da escola
//            user = "root"; //user de casa
            
            password = "rodrigo_ledesma"; //password da escola
//            password = ""; //password de casa
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pstm;
            String sql = "update cliente set nome=?, apelido=?, endereço=?, cep=?, cidade=?, complemento=?, telefone=?, email=?,"
            + "cpf=?, rg=?, dataNascimento=?, tipoContaBancaria=?, numeroAgenciaBancaria=?, numeroContaBancaria=? where id_cliente=?";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(15, cliente.getId_cliente());
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getApelido());
            pstm.setString(3, cliente.getEndereço());
            pstm.setString(4, cliente.getCep()); 
            pstm.setString(5, cliente.getCidade());
            pstm.setString(6, cliente.getComplemento());
            pstm.setString(7, cliente.getTelefone());
            pstm.setString(8, cliente.getEmail());
            pstm.setString(9, cliente.getCpf());
            pstm.setString(10, cliente.getRg());
            pstm.setDate(11, (java.sql.Date) new Date(2004,28,12));
            pstm.setString(12, cliente.getTipoContaBancaria());
            pstm.setString(13, cliente.getNumeroAgenciaBancaria());
            pstm.setString(14, cliente.getNumeroContaBancaria());
          
           
           // pstm.setDate(6, (java.sql.Date) new Date(2004,28,12));
            
             pstm.executeUpdate();
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    @Override
    public void delete(Object object) {
Cliente cliente = (Cliente) object; 
        try {
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
//            url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
            
            user = "rodrigo_ledesma"; //user da escola
//            user = "root"; //user de casa
            
            password = "rodrigo_ledesma"; //password da escola
//            password = ""; //password de casa
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pstm;
            String sql = "delete from cliente where id_cliente=?";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, cliente.getId_cliente());
           pstm.executeUpdate();
           
           // pstm.setDate(6, (java.sql.Date) new Date(2004,28,12));
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    @Override
    public Object list(int id) {
       Cliente cliente  = new Cliente(); 
        try {
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
//            url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
           
            user = "rodrigo_ledesma"; //user da escola
//            user = "root"; //user de casa
            
            password = "rodrigo_ledesma"; //password da escola
//            password = ""; //password de casa
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pstm;
            String sql = "select * from cliente where id_cliente=?";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
           ResultSet rs = pstm.executeQuery();
           if (rs.next() == true) {
               cliente.setId_cliente( rs.getInt("id_cliente"));
               cliente.setNome( rs.getString("nome"));
               cliente.setApelido( rs.getString("apelido"));
               cliente.setEndereço( rs.getString("endereço"));
               cliente.setCep( rs.getString("cep"));
               cliente.setCidade( rs.getString("cidade"));
               cliente.setComplemento( rs.getString("complemento"));
               cliente.setTelefone( rs.getString("telefone"));
               cliente.setEmail( rs.getString("email"));
               cliente.setCpf( rs.getString("cpf"));
               cliente.setRg( rs.getString("rg"));
               cliente.setDataNascimento( rs.getDate("dataNascimento"));
               cliente.setTipoContaBancaria( rs.getString("tipoContaBancaria"));
               cliente.setNumeroAgenciaBancaria( rs.getString("numeroAgenciaBancaria"));
               cliente.setNumeroContaBancaria( rs.getString("numeroContaBancaria"));
              
             }
           
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return cliente;
    }

    @Override
    public List listAll() {
        
          List lista = new ArrayList();
        try {
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_rodrigo_ledesma"; //servidor da escola
//            url = "jdbc:mysql://127.0.0.1:3306/db_rodrigo_ledesma"; //servidor de casa
            
            user = "rodrigo_ledesma"; //user da escola
//            user = "root"; //user de casa
            
            password = "rodrigo_ledesma"; //password da escola
//            password = ""; //password de casa
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pstm;
            String sql = "select * from cliente ";
            pstm = cnt.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
           while (rs.next() == true) {
               Cliente cliente  = new Cliente();
               cliente.setId_cliente( rs.getInt("id_cliente"));
               cliente.setNome( rs.getString("nome"));
               cliente.setApelido( rs.getString("apelido"));
               cliente.setEndereço( rs.getString("endereço"));
               cliente.setCep( rs.getString("cep"));
               cliente.setCidade( rs.getString("cidade"));
               cliente.setComplemento( rs.getString("complemento"));
               cliente.setTelefone( rs.getString("telefone"));
               cliente.setEmail( rs.getString("email"));
               cliente.setCpf( rs.getString("cpf"));
               cliente.setRg( rs.getString("rg"));
               cliente.setDataNascimento( rs.getDate("dataNascimento"));
               cliente.setTipoContaBancaria( rs.getString("tipoContaBancaria"));
               cliente.setNumeroAgenciaBancaria( rs.getString("numeroAgenciaBancaria"));
               cliente.setNumeroContaBancaria( rs.getString("numeroContaBancaria"));
               lista.add(cliente);
             }
           
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return lista;
    }
     public static void main(String[] args) {
         Cliente cliente = new Cliente();
         cliente.setId_cliente(2);
         cliente.setNome("Renatin");
         cliente.setApelido("Renatao");
         cliente.setEndereço("Rua Sao Vincente, Bairro Porto riqueño, 123");
         cliente.setCep("232-3242");
         cliente.setCidade("Ponta Porã");           
         cliente.setComplemento("Em frente a uma pastelaria");
         cliente.setTelefone("4022-8922");
         cliente.setEmail("Renataun123@gmail.com");
         cliente.setCpf("123.456.678-89");
         cliente.setRg("45.324.324");
         //cliente.setDataNascimento("2002-23-12");
         cliente.setTipoContaBancaria("Corrente");
         cliente.setNumeroAgenciaBancaria("345-9");
         cliente.setNumeroContaBancaria("33456-3");
         
         
         
         
         
         
        ClienteDAO clienteDAO = new ClienteDAO();
       clienteDAO.insert(cliente);
       
         System.out.print("deu certo");
         
     }
}
         //usuarios.setDataNascimento(null);
         