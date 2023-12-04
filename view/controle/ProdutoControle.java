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
        this.fireTableDataChanged();
    }
   
    public ProdutoRal getBean(int row) {
        return (ProdutoRal) lista.get(row);
    }
    
    
    public void addBean(ProdutoRal compraProduto){
    lista.add(compraProduto);
    this.fireTableDataChanged();
    
    }
    
    public void removeBean(int index){
    lista.remove(index);
    this.fireTableDataChanged();
    }
    
    
    public void updateBean(int index, ProdutoRal compraProduto){
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
        ProdutoRal produto = (ProdutoRal) lista.get(row);
        if (column == 0) {
           return produto.getIdprodutoRal();
        } 
        if (column == 1) {
           return produto.getNomeRal();
        } 
        if (column == 2) {
           return produto.getTamanhoRal();
        } 
        if (column == 3) {
           return produto.getPrecoRal();
        } 
        return null;
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "Tamanho";
        }
        if (column == 3) {
            return "Preço";
        }
        return "";
    }
}