/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;

import bean.ProdutoRal;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class ProdutoControle extends AbstractTableModel {
   private List lista;
   
   public void setList(List lista) {
     this.lista = lista;
   }
   public ProdutoRal getBean(int linha) {
        return (ProdutoRal) lista.get(linha);
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
        ProdutoRal produto =(ProdutoRal) lista.get(rowIndex);
        if(columnIndex == 0) {
            return produto.getIdprodutoRal();
        }
        if(columnIndex == 1) {
            return produto.getNomeRal();
        }
        if(columnIndex == 2) {
            return produto.getQuantidadeRal();
        }
        if(columnIndex == 3) {
            return produto.getDescricaoRal();
        }
        return "";
    }
    @Override
    public String getColumnName(int columnIndex){
        if(columnIndex == 0) {
            return "ID";
        }
        if(columnIndex == 1) {
            return "NOME";
        }
        if(columnIndex == 2) {
            return "QUANTIDADE";
        }
        if(columnIndex == 3) {
            return "PREÇO";
        }
        return "";
    }
    
    
}