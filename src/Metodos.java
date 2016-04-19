
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mgonzalezlorenzo
 */
public class Metodos {
     ArrayList <Integer> lista = new ArrayList();
     ArrayList <Integer> listarandom = new ArrayList();
     
     public void visualizar(){
         if(lista.size()==6){
             JOptionPane.showMessageDialog(null, "Ya has seleccionado los 6 numeros, imprimelos.");
         }
     }
     public void random(){
         for(int i=0;i<6;i++){
             
             listarandom.add((int)Math.floor(Math.random()*(1-49)+49));
         }
     }
     public void comparar(){
         if(lista.get(0)==listarandom.get(0)&lista.get(1)==listarandom.get(1)&lista.get(2)==listarandom.get(2)&lista.get(3)==listarandom.get(3)&lista.get(4)==listarandom.get(4)&lista.get(5)==listarandom.get(5)){
             JOptionPane.showMessageDialog(null, "GANASTE");
         }
         else
             JOptionPane.showMessageDialog(null, "PERDISTE");
     }
}
