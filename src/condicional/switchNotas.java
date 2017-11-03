/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional;
import javax.swing.JOptionPane;
import java.lang.Math;//Paquete para funciones Mateamticas

/**
 *
 * @author LAB18
 */
public class switchNotas 
{
   public static void main(String[] args)  
    
    {
    
     float nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un nota "));
    //El metodo round es para redondear un decimal
     
     switch(Math.round(nota)) //Se recibe un valor
     {
         case 7://Caso 1- si el valor 7
             JOptionPane.showMessageDialog(null,"Notable");
             
         break;
          case 6://Caso 2- si el valor 6
             JOptionPane.showMessageDialog(null,"Bien");
             
         break;
          case 5://Caso 3- si el valor 5
             JOptionPane.showMessageDialog(null,"Suficiente");
             
         break;
          case 4://Caso 4- si el valor 4
             JOptionPane.showMessageDialog(null,"Suficiente");
             
         break;
          default:
               JOptionPane.showMessageDialog(null,"insuficiente");
             
         break;
              
     }
    
    }   
}
