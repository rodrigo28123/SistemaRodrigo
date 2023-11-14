/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;

import bean.FuncionarioRal;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class FuncionarioControle extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public FuncionarioRal getBean(int row) {
        return (FuncionarioRal) lista.get(row);
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
        FuncionarioRal funcionario = (FuncionarioRal) lista.get(row);
        if (column == 0) {
           return funcionario.getIdfuncionarioRal();
        } 
        if (column == 1) {
           return funcionario.getNomeRal();
        } 
        if (column == 2) {
           return funcionario.getCpfRal();
        } 
        if (column == 3) {
           return funcionario.getSalarioRal();
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
            return "CPF";
        }
        if (column == 3) {
            return "Salario";
        }
        return "";
    }
}
