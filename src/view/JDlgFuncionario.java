/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
//import testes.JDlgUsuario;
import bean.FuncionarioRal;
import dao.FuncionarioDAO;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;
import tools.Util;
/**
 *
 * @author u07329163139
 */
public class JDlgFuncionario extends javax.swing.JDialog {
Boolean incluindo;
<<<<<<< HEAD
MaskFormatter mascaraCpf, mascaraRg, mascaraData;

=======
MaskFormatter mascaraCpf, mascaraRg;
>>>>>>> 3426ddee926626c2bc4d2f71011e2896f6ad147d
    /**
     * Creates new form JDlgFuncionario
     */
    public JDlgFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
          setTitle("Funcionario");
          setLocationRelativeTo(null);
          
          
          
<<<<<<< HEAD
          Util.habilitar(false,  jTxtCodigoFuncionario, jTxtNome,  jFmtCpf, jFmtRg, jFmtData, jTxtEmail ,  jBtnConfirmar, jBtnCancelar);
=======
          Util.habilitar(false,  jTxtCodigoFuncionario, jTxtNome,  jFmtCpf, jFmtRg, jTxtEmail ,  jBtnConfirmar, jBtnCancelar);
>>>>>>> 3426ddee926626c2bc4d2f71011e2896f6ad147d
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
          
           try {
             mascaraCpf = new MaskFormatter("###.###.###-##");
             mascaraRg = new MaskFormatter("#.###.###");
<<<<<<< HEAD
             mascaraData = new MaskFormatter("##/##/####");
=======
>>>>>>> 3426ddee926626c2bc4d2f71011e2896f6ad147d
             
         } catch (ParseException ex) {
             Logger.getLogger(JDlgFuncionario.class.getName()).log(Level.SEVERE, null, ex);
         }
          jFmtCpf.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));
          jFmtRg.setFormatterFactory(new DefaultFormatterFactory(mascaraRg));
<<<<<<< HEAD
         jFmtData.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
=======
        
>>>>>>> 3426ddee926626c2bc4d2f71011e2896f6ad147d
    }
    
//   public void habilitar(){
//    jTxtCodigoFuncionario.setEnabled(true);
//    jTxtNome.setEnabled(true);
//    jFmtCpf.setEnabled(true);
//    jTxtEmail.setEnabled(true);
//    jFmtRg.setEnabled(true);
//    
//   
//    
//    jBtnConfirmar.setEnabled(true);
//    jBtnCancelar.setEnabled(true);
//    
//   jBtnIncluir.setEnabled(false);
//   jBtnAlterar.setEnabled(false);
//   jBtnExcluir.setEnabled(false);
//   jBtnPesquisar.setEnabled(false);
//   
//}
//   public void desabilitar(){
//    jTxtCodigoFuncionario.setEnabled(false);
//    jTxtNome.setEnabled(false);
//    jFmtCpf.setEnabled(false);
//    jTxtEmail.setEnabled(false);
//    jFmtRg.setEnabled(false);
// 
//   
//        
//       jBtnConfirmar.setEnabled(false);
//       jBtnCancelar.setEnabled(false);
//       
//        jBtnIncluir.setEnabled(true);
//        jBtnAlterar.setEnabled(true);
//        jBtnExcluir.setEnabled(true);
//        jBtnPesquisar.setEnabled(true);
//    }
//    
//   public void limparCampo(){
//    jTxtCodigoFuncionario.setText(null);
//    jTxtNome.setText(null);
//    jFmtCpf.setText(null);
//    jTxtEmail.setText(null);
//    jFmtRg.setText(null);
//   
//   }
    
    
       public void habilitar(boolean valor) {   
        Util.habilitar(valor, jTxtCodigoFuncionario, jTxtNome,  jFmtCpf, jFmtRg, jFmtData, 
                jTxtEmail ,  jBtnConfirmar, jBtnCancelar);
     Util.habilitar(!valor, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);

    }
    
public void limpar(){   
        Util.limparCampo( jTxtCodigoFuncionario, jTxtNome,  jFmtCpf, jFmtRg, jFmtData,
                jTxtEmail );      
}
    
    
    
    
    
    
   public FuncionarioRal viewBean(){
   FuncionarioRal funcionario = new FuncionarioRal();
     int id = Integer.valueOf( jTxtCodigoFuncionario.getText());
     funcionario.setIdfuncionarioRal( id );
     funcionario.setNomeRal( jTxtNome.getText());
     funcionario.setCpfRal( jFmtCpf.getText());
     funcionario.setDataNascimentoRal(Util.strDate(jFmtData.getText()));
     funcionario.setEmailRal( jTxtEmail.getText());
     funcionario.setRgRal(jFmtRg.getText());
     
     return funcionario;
   }
   
   public void beanView(FuncionarioRal funcionario) {
        String cad = String.valueOf(funcionario.getIdfuncionarioRal());
      jTxtCodigoFuncionario.setText(cad);
      jTxtNome.setText(funcionario.getNomeRal());
      jFmtCpf.setText( funcionario.getCpfRal());
      jFmtData.setText( Util.dateStr(funcionario.getDataNascimentoRal()));
      jTxtEmail.setText( funcionario.getEmailRal());
      jFmtRg.setText( funcionario.getRgRal());
   }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jFmtRg = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtCodigoFuncionario = new javax.swing.JTextField();
        jFmtCpf = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jFmtData = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Nome");

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir_1.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jLabel9.setText("CPF");

        jLabel10.setText("Email");

        jLabel12.setText("RG");

        jFmtRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtRgActionPerformed(evt);
            }
        });

        jLabel1.setText("Código de Funcionário");

        jFmtCpf.setText(" ");

<<<<<<< HEAD
        jLabel3.setText("Data de Nascimento");

        jFmtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtDataActionPerformed(evt);
            }
        });

=======
>>>>>>> 3426ddee926626c2bc4d2f71011e2896f6ad147d
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTxtCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
<<<<<<< HEAD
=======
                        .addComponent(jTxtCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
>>>>>>> 3426ddee926626c2bc4d2f71011e2896f6ad147d
                        .addComponent(jLabel9)
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFmtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jBtnPesquisar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFmtData))
                .addGap(150, 150, 150))
=======
                .addGap(0, 0, Short.MAX_VALUE))
>>>>>>> 3426ddee926626c2bc4d2f71011e2896f6ad147d
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
<<<<<<< HEAD
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> 3426ddee926626c2bc4d2f71011e2896f6ad147d
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
         habilitar(true);
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
           int resp = JOptionPane.showConfirmDialog(null, "Confirma exclusão ?",
                "Pergunta", JOptionPane.YES_NO_OPTION );
                
        if( resp == JOptionPane.YES_OPTION){
          FuncionarioRal funcionario = viewBean();
            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
            funcionarioDAO.delete(funcionario);
            JOptionPane.showMessageDialog(null, "Exclusão efetuada");
        }else {
            JOptionPane.showMessageDialog(null, "Exclusão cancelada");
        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
           FuncionarioRal funcionario = viewBean();       
     FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
     
    if (incluindo == true){
      
         funcionarioDAO.insert(funcionario);
    }else{
      
        funcionarioDAO.update(funcionario);
    }
   
<<<<<<< HEAD
    Util.habilitar(false,  jTxtCodigoFuncionario, jTxtNome,  jFmtCpf, jFmtRg, jFmtData, jTxtEmail ,  jBtnConfirmar, jBtnCancelar);
=======
    Util.habilitar(false,  jTxtCodigoFuncionario, jTxtNome,  jFmtCpf, jFmtRg, jTxtEmail ,  jBtnConfirmar, jBtnCancelar);
>>>>>>> 3426ddee926626c2bc4d2f71011e2896f6ad147d
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
//        String resp = JOptionPane.showInputDialog(null, "Entre com a chave primária");
//        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
//        int id = Integer.valueOf(resp);
//       FuncionarioRal funcionario =(FuncionarioRal) funcionarioDAO.list( id );
//        beanView(funcionario);
 JDlgFuncionarioNovo JDlgFuncionarioNovo = new JDlgFuncionarioNovo (null, true);
        JDlgFuncionarioNovo.setVisible(true);

    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
     Util.habilitar(false,  jTxtCodigoFuncionario, jTxtNome,  jFmtCpf, jFmtRg, jFmtData, jTxtEmail ,  jBtnConfirmar, jBtnCancelar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.limparCampo(jTxtCodigoFuncionario, jTxtNome,  jFmtCpf, jFmtRg, jFmtData,
=======
     Util.habilitar(false,  jTxtCodigoFuncionario, jTxtNome,  jFmtCpf, jFmtRg, jTxtEmail ,  jBtnConfirmar, jBtnCancelar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.limparCampo(jTxtCodigoFuncionario, jTxtNome,  jFmtCpf, jFmtRg,
>>>>>>> 3426ddee926626c2bc4d2f71011e2896f6ad147d
                jTxtEmail);
        JOptionPane.showMessageDialog(null, "Operação Cancelada");
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
    Util.habilitar(true,  jTxtCodigoFuncionario, jTxtNome,  jFmtCpf, jFmtRg, jFmtData, jTxtEmail ,  jBtnConfirmar, jBtnCancelar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.limparCampo(jTxtCodigoFuncionario, jTxtNome,  jFmtCpf, jFmtRg, jFmtData,
=======
    Util.habilitar(true,  jTxtCodigoFuncionario, jTxtNome,  jFmtCpf, jFmtRg, jTxtEmail ,  jBtnConfirmar, jBtnCancelar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.limparCampo(jTxtCodigoFuncionario, jTxtNome,  jFmtCpf, jFmtRg,
>>>>>>> 3426ddee926626c2bc4d2f71011e2896f6ad147d
                jTxtEmail);
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jFmtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtRgActionPerformed

    private void jFmtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtDataActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgFuncionario dialog = new JDlgFuncionario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JFormattedTextField jFmtCpf;
    private javax.swing.JFormattedTextField jFmtData;
    private javax.swing.JFormattedTextField jFmtRg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtCodigoFuncionario;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtNome;
    // End of variables declaration//GEN-END:variables
}
