/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;

import bean.UsuariosRal;
import java.util.List;
import javax.swing.table.AbstractTableModel;






/**
 *
 * @author u07329163139
 */
public class UsuariosControle extends AbstractTableModel {
    private List lista;

    public void setList(List lista) {
        this.lista = lista;
       this.fireTableDataChanged();
    }
   
    public UsuariosRal getBean(int row) {
        return (UsuariosRal) lista.get(row);
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
        UsuariosRal usuariosral = (UsuariosRal) lista.get(row);
        if (column == 0) {
           return usuariosral.getIdusuariosRal();
        } 
        if (column == 1) {
           return usuariosral.getNomeRal();
        } 
        if (column == 2) {
           return usuariosral.getApelidoRal();
        } 
        if (column == 3) {
           return usuariosral.getCpfRal();
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
            return "apelido";
        }
        if (column == 3) {
            return "Cpf";
        }
        return "";
    }
    
    
}
