/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;

import bean.Produto;
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
   public Produto getBean(int linha) {
        return (Produto) lista.get(linha);
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
        Produto produto =(Produto) lista.get(rowIndex);
        if(columnIndex == 0) {
            return produto.getId_produto();
        }
        if(columnIndex == 1) {
            return produto.getNome();
        }
        if(columnIndex == 2) {
            return produto.getQuantidade();
        }
        if(columnIndex == 3) {
            return produto.getDescricao();
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