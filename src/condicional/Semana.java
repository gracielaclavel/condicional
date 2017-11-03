/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB18
 */
public class Semana 
{
  public static void main(String[] args) 
    {
    float numero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero "));
     switch(Math.round(numero))
     {
     case 1://Ingresando dias
             JOptionPane.showMessageDialog(null,"Lunes");
             
         break;
          case 2://agregando otro dias
             JOptionPane.showMessageDialog(null,"Martes");
             
         break;
          case 3://agregando otro dias
             JOptionPane.showMessageDialog(null,"Miercoles");
             
         break;
          case 4://agregando otro dias
             JOptionPane.showMessageDialog(null,"Jueves");
             
         break;
           case 5://agregando otro dias
             JOptionPane.showMessageDialog(null,"Viernes");
             
         break;
          case 6://Agregando dias
             JOptionPane.showMessageDialog(null,"Sabado");
             
         break;
          case 7:
             JOptionPane.showMessageDialog(null,"Domingo");
             
         break;
          
              
     }
          
    
    }
}
