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
   }
   public UsuariosRal getBean(int linha) {
        return (UsuariosRal) lista.get(linha);
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
        UsuariosRal usuarios =(UsuariosRal) lista.get(rowIndex);
        if(columnIndex == 0) {
            return usuarios.getIdusuariosRal();
        }
        if(columnIndex == 1) {
            return usuarios.getNomeRal();
        }
        if(columnIndex == 2) {
            return usuarios.getApelidoRal();
        }
        if(columnIndex == 3) {
            return usuarios.getCpfRal();
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
            return "APELIDO";
        }
        if(columnIndex == 3) {
            return "CPF";
        }
        return "";
    }
    
    
}
