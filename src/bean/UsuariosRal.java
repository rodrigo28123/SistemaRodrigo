package bean;
// Generated 19/10/2023 12:07:28 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UsuariosRal generated by hbm2java
 */
@Entity
@Table(name="usuarios_ral"
    ,catalog="db_rodrigo_ledesma"
)
public class UsuariosRal  implements java.io.Serializable {


     private int idusuariosRal;
     private String nomeRal;
     private String apelidoRal;
     private String cpfRal;
     private Date dataNascimentoRal;
     private String senhaRal;
     private int nivelRal;
     private String ativoRal;

    public UsuariosRal() {
    }

    public UsuariosRal(int idusuariosRal, String nomeRal, String apelidoRal, String cpfRal, Date dataNascimentoRal, String senhaRal, int nivelRal, String ativoRal) {
       this.idusuariosRal = idusuariosRal;
       this.nomeRal = nomeRal;
       this.apelidoRal = apelidoRal;
       this.cpfRal = cpfRal;
       this.dataNascimentoRal = dataNascimentoRal;
       this.senhaRal = senhaRal;
       this.nivelRal = nivelRal;
       this.ativoRal = ativoRal;
    }
   
     @Id 

    
    @Column(name="idusuarios_ral", unique=true, nullable=false)
    public int getIdusuariosRal() {
        return this.idusuariosRal;
    }
    
    public void setIdusuariosRal(int idusuariosRal) {
        this.idusuariosRal = idusuariosRal;
    }

    
    @Column(name="nome_ral", nullable=false, length=45)
    public String getNomeRal() {
        return this.nomeRal;
    }
    
    public void setNomeRal(String nomeRal) {
        this.nomeRal = nomeRal;
    }

    
    @Column(name="apelido_ral", nullable=false, length=45)
    public String getApelidoRal() {
        return this.apelidoRal;
    }
    
    public void setApelidoRal(String apelidoRal) {
        this.apelidoRal = apelidoRal;
    }

    
    @Column(name="cpf_ral", nullable=false, length=14)
    public String getCpfRal() {
        return this.cpfRal;
    }
    
    public void setCpfRal(String cpfRal) {
        this.cpfRal = cpfRal;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dataNascimento_ral", nullable=false, length=10)
    public Date getDataNascimentoRal() {
        return this.dataNascimentoRal;
    }
    
    public void setDataNascimentoRal(Date dataNascimentoRal) {
        this.dataNascimentoRal = dataNascimentoRal;
    }

    
    @Column(name="senha_ral", nullable=false, length=45)
    public String getSenhaRal() {
        return this.senhaRal;
    }
    
    public void setSenhaRal(String senhaRal) {
        this.senhaRal = senhaRal;
    }

    
    @Column(name="nivel_ral", nullable=false)
    public int getNivelRal() {
        return this.nivelRal;
    }
    
    public void setNivelRal(int nivelRal) {
        this.nivelRal = nivelRal;
    }

    
    @Column(name="ativo_ral", nullable=false, length=1)
    public String getAtivoRal() {
        return this.ativoRal;
    }
    
    public void setAtivoRal(String ativoRal) {
        this.ativoRal = ativoRal;
    }




}


