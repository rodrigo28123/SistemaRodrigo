/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import view.JDlgUsuario;
import bean.Usuarios;
/**
 *
 * @author u07329163139
 */
public class LinUse {
   public static void main(String [] arqs){
    List<Usuarios> lista = new ArrayList();

Usuarios usuarios = new Usuarios();
usuarios.setIdUsuarios(1);
usuarios.setNome("rodrigo");
usuarios.setApelido ("almeida");



lista.add(usuarios);



lista.add (new Usuarios(2, "augusto", "rr" ));
   Collections.sort(lista);

for (Usuarios usuarios1 : lista){
System.out.println(((Usuarios)usuarios1).getNome());
}
}
} 