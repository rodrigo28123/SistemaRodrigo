/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

//import testes.JDlgClientePesquisar;
//import testes.JDlgCliente;
import bean.FornecedorRal;
import bean.UsuariosRal;
import dao.FornecedorDAO;
import dao.UsuariosDAO;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;
/**
 *
 * @author u07329163139
 */
public class JDlgFornecedor extends javax.swing.JDialog {
Boolean incluindo;
MaskFormatter mascaraCpf, mascaraData, mascaraTelefone, mascaraRg, mascaraCep, mascaraAgencia, mascaraContaBanc;
public FornecedorDAO fornecedorDAO;
public FornecedorRal fornecedor;

    public JDlgFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Fornecedor");
        setLocationRelativeTo(null);
       
        
         fornecedorDAO = new FornecedorDAO();
         
         
        Util.habilitar(false, jTxtCodigoFornecedor, jTxtNome, jTxtApelido, jTxtEndereco, jFmtCep, jTxtCidade, jTxtComplemento, 
                jFmtTelefone, jTxtEmail, jFmtCpf, jFmtRg, jFmtDataNascimento, jFmtNomeContaBanc, jFmtNumAgenciaBanc, jFmtNumContaBanc, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
         
       try {
                    mascaraData = new MaskFormatter("##/##/####");
                    mascaraCpf = new MaskFormatter("###.###.###-##");
                    mascaraTelefone = new MaskFormatter("(##)####-####");
                    mascaraRg = new MaskFormatter("#.###.###");
                    mascaraCep = new MaskFormatter("####-####");
                    mascaraAgencia = new MaskFormatter("####-#");
                    mascaraContaBanc = new MaskFormatter("######-#");
                    
                    
        } catch (ParseException ex) {
            Logger.getLogger(JDlgFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
          jFmtDataNascimento.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
          jFmtCpf.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));
          jFmtTelefone.setFormatterFactory(new DefaultFormatterFactory(mascaraTelefone));
          jFmtRg.setFormatterFactory(new DefaultFormatterFactory(mascaraRg)); 
          jFmtCep.setFormatterFactory(new DefaultFormatterFactory(mascaraCep));
          jFmtNumAgenciaBanc.setFormatterFactory(new DefaultFormatterFactory(mascaraAgencia));
          jFmtNumContaBanc.setFormatterFactory(new DefaultFormatterFactory(mascaraContaBanc));
       
    }
    

    
   
    
    
    public FornecedorRal viewBean(){
     FornecedorRal fornecedor = new FornecedorRal();
     int id = Integer.valueOf( jTxtCodigoFornecedor.getText());
     fornecedor.setIdfornecedorRal( id );
     fornecedor.setNomeRal( jTxtNome.getText());
     fornecedor.setApelidoRal( jTxtApelido.getText());
     fornecedor.setEnderecoRal( jTxtEndereco.getText());
     fornecedor.setCepRal( jFmtCep.getText());
     fornecedor.setCidadeRal( jTxtCidade.getText());
     fornecedor.setComplementoRal( jTxtComplemento.getText());
     fornecedor.setTelefoneRal( jFmtTelefone.getText());
     fornecedor.setEmailRal( jTxtEmail.getText());
     fornecedor.setCpfRal( jFmtCpf.getText());
     fornecedor.setRgRal( jFmtRg.getText());
     fornecedor.setDataNascimentoRal(Util.strDate(jFmtDataNascimento.getText()));
     fornecedor.setNomeContaBancRal(jFmtNomeContaBanc.getText());
     fornecedor.setNumAgenciaBancRal(jFmtNumAgenciaBanc.getText());
     fornecedor.setNumContaBancRal(jFmtNumContaBanc.getText());   
     
        return fornecedor;

}
   public void beanView(FornecedorRal fornecedor) {
       String cad = String.valueOf(fornecedor.getIdfornecedorRal());
       jTxtCodigoFornecedor.setText(cad);
       jTxtNome.setText( fornecedor.getNomeRal());
       jTxtApelido.setText(fornecedor.getApelidoRal());
       jTxtEndereco.setText(fornecedor.getEnderecoRal());
       jFmtCep.setText(fornecedor.getCepRal());
       jTxtCidade.setText(fornecedor.getCidadeRal());
       jTxtComplemento.setText(fornecedor.getComplementoRal());
       jFmtTelefone.setText(fornecedor.getTelefoneRal());
       jTxtEmail.setText(fornecedor.getEmailRal());
       jFmtCpf.setText(fornecedor.getCpfRal());
       jFmtRg.setText(fornecedor.getRgRal());
       jFmtDataNascimento.setText(Util.dateStr(fornecedor.getDataNascimentoRal()));
       jFmtNomeContaBanc.setText(fornecedor.getNomeContaBancRal());
       jFmtNumAgenciaBanc.setText(fornecedor.getNumAgenciaBancRal());
       jFmtNumContaBanc.setText(fornecedor.getNumContaBancRal());
   }

       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTxtCidade = new javax.swing.JTextField();
        jTxtEndereco = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTxtCodigoFornecedor = new javax.swing.JTextField();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jBtnConfirmar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jBtnPesquisar = new javax.swing.JButton();
        jTxtApelido = new javax.swing.JTextField();
        jBtnCancelar = new javax.swing.JButton();
        jTxtComplemento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jFmtRg = new javax.swing.JFormattedTextField();
        jFmtTelefone = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jFmtCpf = new javax.swing.JFormattedTextField();
        jFmtDataNascimento = new javax.swing.JFormattedTextField();
        jBtnIncluir = new javax.swing.JButton();
        jFmtNomeContaBanc = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFmtCep = new javax.swing.JFormattedTextField();
        jFmtNumAgenciaBanc = new javax.swing.JFormattedTextField();
        jFmtNumContaBanc = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel13.setText("Edereço");

        jLabel15.setText("Cidade");

        jLabel19.setText(" Agencia Bancaria");

        jLabel1.setText("Numero da Conta Bancaria");

        jTxtCodigoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigoFornecedorActionPerformed(evt);
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

        jLabel7.setText("CEP");

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jLabel8.setText("Apelido");

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

        jLabel9.setText("RG");

        jLabel16.setText("Complemento");

        jFmtRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtRgActionPerformed(evt);
            }
        });

        jLabel10.setText("Email");

        jLabel11.setText("Telefone");

        jLabel12.setText("Nome de Conta Bancária");

        jLabel2.setText("Nome");

        jLabel4.setText("CPF");

        jLabel6.setText("Data de Nascimento");

        jFmtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCpfActionPerformed(evt);
            }
        });

        jFmtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtDataNascimentoActionPerformed(evt);
            }
        });

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir_1.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo de Fornecedor");

        jFmtNumAgenciaBanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtNumAgenciaBancActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jFmtNumAgenciaBanc, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFmtNumContaBanc))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFmtNomeContaBanc, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jFmtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFmtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jFmtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addComponent(jTxtCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(9, 9, 9)
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
                    .addComponent(jBtnPesquisar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel7)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtNomeContaBanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtNumAgenciaBanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtNumContaBanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(409, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnIncluir)
                        .addComponent(jBtnAlterar)
                        .addComponent(jBtnExcluir)
                        .addComponent(jBtnConfirmar)
                        .addComponent(jBtnCancelar)
                        .addComponent(jBtnPesquisar))
                    .addGap(12, 12, 12)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:

       Util.habilitar(true, jTxtCodigoFornecedor, jTxtNome, jTxtApelido, jTxtEndereco, jFmtCep, jTxtCidade, jTxtComplemento, 
                jFmtTelefone, jTxtEmail, jFmtCpf, jFmtRg, jFmtDataNascimento, jFmtNomeContaBanc, jFmtNumAgenciaBanc, jFmtNumContaBanc, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
         
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
//        int resp = JOptionPane.showConfirmDialog(null, "Confirma exclusão ?",
//            "Pergunta", JOptionPane.YES_NO_OPTION );
//
//        if( resp == JOptionPane.YES_OPTION){
//            FornecedorRal fornecedor = viewBean();
//            FornecedorDAO fornecedorDAO = new FornecedorDAO();
//            fornecedorDAO.delete(fornecedor);
//            JOptionPane.showMessageDialog(null, "Exclusão efetuada");
//        }else {
//            JOptionPane.showMessageDialog(null, "Exclusão cancelada");
//        }
             if (Util.perguntar("Deseja excluir o registro?") == true) {
                      fornecedor = viewBean();
                      fornecedorDAO.delete(fornecedor);
        } else {

            Util.mensagem("Exclusão cancelada.");
        }
             
            Util.limparCampo(jTxtCodigoFornecedor, jTxtNome, jTxtApelido, jTxtEndereco, jFmtCep, jTxtCidade, jTxtComplemento, 
                jFmtTelefone, jTxtEmail, jFmtCpf, jFmtRg, jFmtDataNascimento, jFmtNomeContaBanc, jFmtNumAgenciaBanc, jFmtNumContaBanc, jBtnCancelar, jBtnConfirmar);
             
             
             
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
//        FornecedorRal fornecedor = viewBean();
//        FornecedorDAO fornecedorDAO = new FornecedorDAO();
//
//        if (incluindo == true){
//
//            fornecedorDAO.insert(fornecedor);
//        }else{
//
//            fornecedorDAO.update(fornecedor);
//        }
        fornecedor = viewBean();        
        if (incluindo == true) {
            fornecedorDAO.insert(fornecedor);
        } else {
            fornecedorDAO.update(fornecedor);
        }      

        Util.habilitar(false, jTxtCodigoFornecedor, jTxtNome, jTxtApelido, jTxtEndereco, jFmtCep, jTxtCidade, jTxtComplemento, 
                jFmtTelefone, jTxtEmail, jFmtCpf, jFmtRg, jFmtDataNascimento, jFmtNomeContaBanc, jFmtNumAgenciaBanc, jFmtNumContaBanc, jBtnCancelar, jBtnConfirmar);
        
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
        //         String resp = JOptionPane.showInputDialog(null, "Entre com a chave primária");
        //        ClienteDAO clienteDAO = new ClienteDAO();
        //        int id = Integer.valueOf(resp);
        //        Cliente cliente =(Cliente) clienteDAO.list( id );
        //        beanView(cliente);
        JDlgFornecedorPesquisar jDlgFornecedorPesquisar = new JDlgFornecedorPesquisar(null, true);
        
        
        jDlgFornecedorPesquisar.setTelaAnterior(this);
        jDlgFornecedorPesquisar.setVisible(true);

 
 
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
   Util.habilitar(false, jTxtCodigoFornecedor, jTxtNome, jTxtApelido, jTxtEndereco, jFmtCep, jTxtCidade, jTxtComplemento, 
                jFmtTelefone, jTxtEmail, jFmtCpf, jFmtRg, jFmtDataNascimento, jFmtNomeContaBanc, jFmtNumAgenciaBanc, jFmtNumContaBanc, jBtnCancelar, jBtnConfirmar);
   Util.habilitar(true,  jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
      Util.limparCampo(jTxtCodigoFornecedor, jTxtNome, jTxtApelido, jTxtEndereco, jFmtCep, jTxtCidade, jTxtComplemento, jFmtTelefone, jTxtEmail, jFmtCpf, jFmtRg, jFmtDataNascimento, jFmtNomeContaBanc, jFmtNumAgenciaBanc, jFmtNumContaBanc);
        JOptionPane.showMessageDialog(null, "Operação Cancelada");
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jFmtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtRgActionPerformed

    private void jFmtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCpfActionPerformed

    private void jFmtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtDataNascimentoActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
 Util.habilitar(true, jTxtCodigoFornecedor, jTxtNome, jTxtApelido, jTxtEndereco, jFmtCep, jTxtCidade, jTxtComplemento, 
                jFmtTelefone, jTxtEmail, jFmtCpf, jFmtRg, jFmtDataNascimento, jFmtNomeContaBanc, jFmtNumAgenciaBanc, jFmtNumContaBanc, jBtnCancelar, jBtnConfirmar);
 Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.limparCampo(jTxtCodigoFornecedor, jTxtNome, jTxtApelido, jTxtEndereco, jFmtCep, jTxtCidade, jTxtComplemento, jFmtTelefone, jTxtEmail, jFmtCpf, jFmtRg, jFmtDataNascimento, jFmtNomeContaBanc, jFmtNumAgenciaBanc, jFmtNumContaBanc);
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jTxtCodigoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigoFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigoFornecedorActionPerformed

    private void jFmtNumAgenciaBancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtNumAgenciaBancActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtNumAgenciaBancActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(JDlgFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgFornecedor dialog = new JDlgFornecedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JFormattedTextField jFmtCep;
    private javax.swing.JFormattedTextField jFmtCpf;
    private javax.swing.JFormattedTextField jFmtDataNascimento;
    private javax.swing.JTextField jFmtNomeContaBanc;
    private javax.swing.JFormattedTextField jFmtNumAgenciaBanc;
    private javax.swing.JFormattedTextField jFmtNumContaBanc;
    private javax.swing.JFormattedTextField jFmtRg;
    private javax.swing.JFormattedTextField jFmtTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtApelido;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtCodigoFornecedor;
    private javax.swing.JTextField jTxtComplemento;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtNome;
    // End of variables declaration//GEN-END:variables
}
