/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;

import bean.CompraRal;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class CompraControle extends AbstractTableModel {
    private List lista;

    public void setList(List lista) {
        this.lista = lista;
       this.fireTableDataChanged();
    }
   
    public CompraRal getBean(int row) {
        return (CompraRal) lista.get(row);
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
    public Object getValueAt(int row, int column) {
        CompraRal compraral = (CompraRal) lista.get(row);
        
        if (column == 0) {
           return compraral.getCompraTotalRal();
        } 
        if (column == 1) {
           return compraral.getFornecedorRal();
        } 
          if (column == 2) {
           return compraral.getFuncionarioRal();
        }
        if (column == 3) {
           return compraral.getNotaFiscalRal();
        } 
      
        return null;
    }

    @Override
    public String getColumnName(int column) {
      
        if (column == 0) {
            return "Compra Total";
        }
        if (column == 1) {
            return "Fornecedor";
        }
         if (column == 2) {
            return "Funcionario";
        }
        if (column == 3) {
            return "Nota Fiscal";
        }
       
        return "";
    }
    
    
}
