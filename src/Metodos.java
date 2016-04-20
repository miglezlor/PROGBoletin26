
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
         int x=0;
         for(int i=0;i<6;i++){
             if(lista.get(0)==listarandom.get(i)){
                 x++;
             }
             if(lista.get(1)==listarandom.get(i)){
                 x++;
             }
             if(lista.get(2)==listarandom.get(i)){
                 x++;
             }
             if(lista.get(3)==listarandom.get(i)){
                 x++;
             }
             if(lista.get(4)==listarandom.get(i)){
                 x++;
             }
             if(lista.get(5)==listarandom.get(i)){
                 x++;
             }
             
         }
         if(x==0){
             JOptionPane.showMessageDialog(null, "PERDISTE");
         }
         else
             JOptionPane.showMessageDialog(null, "TIENES "+x+" ACIERTOS");
         
         
     }
}
