
import java.util.ArrayList;
import java.util.Random;
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
         
        int n=49; 
        int k=n; 
        int[] numeros=new int[n];
        int[] resultado=new int[n];
        Random rnd=new Random();
        int res;
        
       
        for(int i=0;i<n;i++){
            numeros[i]=i+1;
        }
        
        for(int i=0;i<n;i++){
            res=rnd.nextInt(k);            
            resultado[i]=numeros[res];
            numeros[res]=numeros[k-1];
            k--;
            
        }
        
        for(int i=0;i<6;i++){
        listarandom.add(resultado[i]);
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
