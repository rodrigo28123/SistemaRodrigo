/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author u07329163139
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... vetComp) {
        for (int i = 0; i < vetComp.length; i++) {
            vetComp[i].setEnabled(valor);
        }
    }

    public static void limparCampo(JComponent... vetComp) {
        for (JComponent componente : vetComp) {
            if ( componente instanceof JTextField){
                JTextField objeto = (JTextField) componente;
                objeto.setText("");
            } else if ( componente instanceof JComboBox) {
                JComboBox objeto = (JComboBox) componente;
                objeto.setSelectedIndex(-1);
            } else if ( componente instanceof JCheckBox) {
                JCheckBox objeto = (JCheckBox) componente;
                objeto.setSelected(false);
            }
        }
        
    }
//       for (int i = 0; i < componentes.length; i++){
//            if(componentes[i] instanceof JTextField){
//              ((JTextField)componentes[i]).setText("");   
//            }
//            if(componentes[i] instanceof JFormattedTextField){
//              ((JFormattedTextField)componentes[i]).setText("");   
//            }
//            if(componentes[i] instanceof JComboBox){
//              JComboBox comp = (JComboBox)componentes[i];
//              comp.setSelectedIndex(-1);
//            }
//            if(componentes[i] instanceof JCheckBox){
//              JCheckBox comp = (JCheckBox)componentes[i];
//              comp.setSelected(false);
//            }            
//        }

    public static void mensagem(String mensagem) {

        JOptionPane.showMessageDialog(null, mensagem);

    }

   public static boolean perguntar(String msg){
         return JOptionPane.showConfirmDialog(null, msg, "Pergunta", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }

    public static int strToInt(String valor) {
        return Integer.valueOf(valor);
    }

    public static String intToStr(int valor) {
        return String.valueOf(valor);

    }

      
     public static double strDouble (String cad){
         return Double.valueOf(cad);
     }
     
     public static String doubleStr(double num){
         return String.valueOf(num);
     }

    public static java.util.Date strDate(String data) { 
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
            return formato.parse(data);
        } catch (ParseException ex) {
            System.out.println("Erro na conversão da data.");
        }
        return null;
    }

    public static String dateStr(java.util.Date data){
         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
         return formato.format(data);
     

    }

}
