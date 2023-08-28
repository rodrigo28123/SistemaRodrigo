/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;


public class Usuarios implements Comparable{

 private int IdUsuarios;
 private String nome;
 private String apelido;
 private String cpf;
 private Date dataNascimento;
 private String senha;
 private int nivel;
 private String ativo;

    public Usuarios(int IdUsuarios, String nome, String apelido) {
        this.IdUsuarios = IdUsuarios;
        this.nome = nome;
        this.apelido = apelido;
    }

    public Usuarios() {
    }
    

   
    /**
     * @return the IdUsuarios
     */
    public int getIdUsuarios() {
        return IdUsuarios;
    }

    /**
     * @param IdUsuarios the IdUsuarios to set
     */
    public void setIdUsuarios(int IdUsuarios) {
        this.IdUsuarios = IdUsuarios;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the apelido
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * @param apelido the apelido to set
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the ativo
     */
    public String getAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    
    @Override
    public int compareTo(Object t) {
       
   Usuarios usuarios = (Usuarios)t;
   return this.nome.compareTo(usuarios.nome);
    }


   

    
  
    
    }
    
    
  