/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;

import bean.FornecedorRal;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class FornecedorControle extends AbstractTableModel {
  private  List lista;
   
   public void setList(List lista) {
     this.lista = lista;
<<<<<<< HEAD
      this.fireTableDataChanged();
=======
>>>>>>> 3426ddee926626c2bc4d2f71011e2896f6ad147d
   }
   public FornecedorRal getBean(int linha) {
        return (FornecedorRal) lista.get(linha);
    }
   
    @Override
    public int getRowCount() {
       
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FornecedorRal fornecedor =(FornecedorRal) lista.get(rowIndex);
        if(columnIndex == 0) {
            return fornecedor.getIdfornecedorRal();
        }
        if(columnIndex == 1) {
<<<<<<< HEAD
            return fornecedor.getCpfRal();
        }
        if(columnIndex == 2) {
            return fornecedor.getApelidoRal();
        }
        if(columnIndex == 3) {
            return fornecedor.getEmailRal();
=======
            return fornecedor.getNomeRal();
        }
        if(columnIndex == 2) {
            return fornecedor.getRgRal();
        }
        if(columnIndex == 3) {
            return fornecedor.getCpfRal();
>>>>>>> 3426ddee926626c2bc4d2f71011e2896f6ad147d
        }
        return "";
    }
    @Override
    public String getColumnName(int columnIndex){
        if(columnIndex == 0) {
            return "ID";
        }
        if(columnIndex == 1) {
<<<<<<< HEAD
            return "Cpf";
        }
        if(columnIndex == 2) {
            return "Apelido";
        }
        if(columnIndex == 3) {
            return "Email";
=======
            return "NOME";
        }
        if(columnIndex == 2) {
            return "RG";
        }
        if(columnIndex == 3) {
            return "CPF";
>>>>>>> 3426ddee926626c2bc4d2f71011e2896f6ad147d
        }
        return "";
    }
    
    
}
