/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Usuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
     */
public class UsuariosController extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public Usuarios getBean(int row) {
        return (Usuarios) lista.get(row);
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
        Usuarios usuarios = (Usuarios) lista.get(row);
        if (column == 0) {
           return usuarios.getIdusuarios();
        } 
        if (column == 1) {
           return usuarios.getNome();
        } 
        if (column == 2) {
           return usuarios.getApelido();
        } 
        if (column == 3) {
           return usuarios.getCpf();
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
            return "Apelido";
        }
        if (column == 3) {
            return "Cpf";
        }
        return "";
    }
}
