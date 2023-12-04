/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;

import bean.CompraProdutoRal;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tools.Util;

/**
 *
 * @author u07329163139
 */
public class CompraProdutosControle extends AbstractTableModel {
    private List lista;

    public void setList(List lista) {
        this.lista = lista;
       this.fireTableDataChanged();
    }
    
    public CompraProdutoRal getList(int i){
    return (CompraProdutoRal)lista.get(i);
    }
   
    public CompraProdutoRal getBean(int row) {
        return (CompraProdutoRal) lista.get(row);
    }
    
    public void addBean(CompraProdutoRal compraProduto){
    lista.add(compraProduto);
    this.fireTableDataChanged();
    
    }
    
    public void removeBean(int index){
    lista.remove(index);
    this.fireTableDataChanged();
    }
    
    
    public void updateBean(int index, CompraProdutoRal compraProduto){
        lista.set(index, compraProduto);
        this.fireTableDataChanged();    
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
        CompraProdutoRal compraProduto = (CompraProdutoRal) lista.get(row);
        if (column == 0) {
           return compraProduto.getProdutoRal();
        } 
        if (column == 1) {
           return compraProduto.getQuantidadeRal();
        } 
        if (column == 2) {
           return compraProduto.getValorUnitarioRal();
        } 
        if (column == 3) {
          return compraProduto.getQuantidadeRal() * compraProduto.getValorUnitarioRal();
        } 
        return null;
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Produto";
        }
        if (column == 1) {
            return "Quantidade";
        }
        if (column == 2) {
            return "Valor unitario";
        }
        if (column == 3) {
            return "Total";
        }
        return "";
    }
    
    
}
