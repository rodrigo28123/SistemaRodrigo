/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import bean.ProdutoRal;
import dao.ProdutoDAO;

import javax.swing.JOptionPane;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;
import tools.Util;

/**
/**
 *
 * @author u07392163139
 */
public class JDlgProduto extends javax.swing.JDialog {
  Boolean incluindo;
  public ProdutoRal produto;
   public ProdutoDAO produtoDAO;
    /**
     * Creates new form JDlgUsuario
     */
    public JDlgProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
          setTitle("Produto");
          setLocationRelativeTo(null);
       
      
          
          produtoDAO = new ProdutoDAO();
          
          Util.habilitar(false, jTxtCodigoProduto, jTxtNome,   jTxtDescricao, 
                jTxtTamanho, jTxtPreco ,  jBtnConfirmar, jBtnCancelar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
          
    }
    
//   public void habilitar(){
//    jTxtCodigoProduto.setEnabled(true);
//    jTxtNome.setEnabled(true);
//    jTxtQuantidade.setEnabled(true);
//    jTxtDescricao.setEnabled(true);
//   
//     jTxtTamanho.setEnabled(true);
//    
//    
//   
//    jTxtPreco.setEnabled(true);
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
//    jTxtCodigoProduto.setEnabled(false);
//    jTxtNome.setEnabled(false);
//    jTxtQuantidade.setEnabled(false);
//    jTxtDescricao.setEnabled(false);
//    
//    
//    jTxtTamanho.setEnabled(false);
//    
//    jTxtPreco.setEnabled(false);
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
//    jTxtCodigoProduto.setText(null);
//    jTxtNome.setText(null);
//    jTxtQuantidade.setText(null);
//    jTxtDescricao.setText(null);
//    jTxtTamanho.setText(null);
//    
//    
//   
//    
//    jTxtPreco.setText(null);
//  
//   }
     public ProdutoRal viewBean(){
   ProdutoRal produto = new ProdutoRal();
     int id = Integer.valueOf( jTxtCodigoProduto.getText());
     produto.setIdprodutoRal( id );
     produto.setNomeRal( jTxtNome.getText());
    
     produto.setDescricaoRal( jTxtDescricao.getText());
   
     produto.setTamanhoRal(jTxtTamanho .getText());
     produto.setPrecoRal(Util.strDouble(jTxtPreco.getText()));
   
     return produto; 

}
   public void beanView(ProdutoRal produto) {
       String cad = String.valueOf(produto.getIdprodutoRal());
       jTxtCodigoProduto.setText(cad);
       jTxtNome.setText( produto.getNomeRal());
       //jTxtQuantidade.setText( produto.getQuantidadeRal());
       
       jTxtDescricao.setText( produto.getDescricaoRal());
       jTxtTamanho.setText( produto.getTamanhoRal());
       jTxtPreco.setText(Util.doubleStr(produto.getPrecoRal()) );
       
       //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); //data   
     //  jFmtDataNascimento.setText( formato.format(usuarios.getDataNascimento()));
//data
     
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
        jLabel3 = new javax.swing.JLabel();
        jTxtDescricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTxtPreco = new javax.swing.JFormattedTextField();
        jTxtTamanho = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTxtCodigoProduto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Nome");

        jLabel3.setText("Descrição");

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

        jLabel11.setText("Preço");

        jTxtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPrecoActionPerformed(evt);
            }
        });

        jTxtTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTamanhoActionPerformed(evt);
            }
        });

        jLabel14.setText("tamanho");

        jLabel1.setText("Código do Produto");

        jTxtCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigoProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTxtCodigoProduto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnPesquisar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(280, 280, 280))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jTxtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(142, 142, 142))))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxtDescricao)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jTxtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtDescricao)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jTxtCodigoProduto, jTxtNome,  jTxtDescricao, 
                jTxtTamanho, jTxtPreco ,  jBtnConfirmar, jBtnCancelar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
//   int resp = JOptionPane.showConfirmDialog(null, "Confirma exclusão ?",
//                "Pergunta", JOptionPane.YES_NO_OPTION );
//                
//        if( resp == JOptionPane.YES_OPTION){
//            ProdutoRal produto = viewBean();
//            ProdutoDAO ProdutoDAO = new ProdutoDAO();
//            ProdutoDAO.delete(produto);
//            JOptionPane.showMessageDialog(null, "Exclusão efetuada");
//        }else {
//            JOptionPane.showMessageDialog(null, "Exclusão cancelada");
//        }

          if (Util.perguntar("Deseja excluir o registro?") == true) {
            produto = viewBean();
            produtoDAO.delete(produto);
        } else {

            Util.mensagem("Exclusão cancelada.");
        }

 Util.limparCampo(jTxtCodigoProduto, jTxtNome, jTxtDescricao, 
                jTxtTamanho);
        
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        
//           ProdutoRal produto = viewBean();       
//     ProdutoDAO produtoDAO = new ProdutoDAO();
//     
//    if (incluindo == true){
//      
//         produtoDAO.insert(produto);
//    }else{
//      
//        produtoDAO.update(produto);
//    }
        
      produto = viewBean();        
        if (incluindo == true) {
            produtoDAO.insert(produto);
        } else {
            produtoDAO.update(produto);
        }            
      Util.habilitar(false, jTxtCodigoProduto, jTxtNome, jTxtDescricao, 
                jTxtTamanho, jTxtPreco ,  jBtnConfirmar, jBtnCancelar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
//        String resp = JOptionPane.showInputDialog(null, "Entre com a chave primária");
//        ProdutoDAO produtoDAO = new ProdutoDAO();
//        int id = Integer.valueOf(resp);
//        Produto produto =(Produto) produtoDAO.list( id );
//        beanView(produto);
//      JDlgProdutoPesquisar jDlgProdutoPesquisar = new JDlgProdutoPesquisar(null, true);
//      jDlgProdutoPesquisar.setVisible(true);
    JDlgProdutoNovo JDlgProdutoNovo = new JDlgProdutoNovo (null, true);
        JDlgProdutoNovo.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
         Util.habilitar(false, jTxtCodigoProduto, jTxtNome, jTxtDescricao, 
                jTxtTamanho, jTxtPreco ,  jBtnConfirmar, jBtnCancelar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
       Util.limparCampo(jTxtCodigoProduto, jTxtNome, jTxtDescricao,jTxtPreco, 
                jTxtTamanho);
        JOptionPane.showMessageDialog(null, "Operação Cancelada");
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
         Util.habilitar(true, jTxtCodigoProduto, jTxtNome, jTxtDescricao, 
                jTxtTamanho, jTxtPreco ,  jBtnConfirmar, jBtnCancelar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.limparCampo(jTxtCodigoProduto, jTxtNome,  jTxtDescricao, 
                jTxtTamanho);
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jTxtTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTamanhoActionPerformed

    private void jTxtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPrecoActionPerformed

    private void jTxtCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigoProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgProduto dialog = new JDlgProduto(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTxtCodigoProduto;
    private javax.swing.JTextField jTxtDescricao;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JFormattedTextField jTxtPreco;
    private javax.swing.JFormattedTextField jTxtTamanho;
    // End of variables declaration//GEN-END:variables
}
