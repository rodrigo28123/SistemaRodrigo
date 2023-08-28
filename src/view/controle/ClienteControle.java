/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;

import bean.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class ClienteControle extends AbstractTableModel {
  private  List lista;
   
   public void setList(List lista) {
     this.lista = lista;
   }
   public Cliente getBean(int linha) {
        return (Cliente) lista.get(linha);
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
        Cliente cliente =(Cliente) lista.get(rowIndex);
        if(columnIndex == 0) {
            return cliente.getId_cliente();
        }
        if(columnIndex == 1) {
            return cliente.getNome();
        }
        if(columnIndex == 2) {
            return cliente.getRg();
        }
        if(columnIndex == 3) {
            return cliente.getCpf();
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
            return "RG";
        }
        if(columnIndex == 3) {
            return "CPF";
        }
        return "";
    }
    
    
}
