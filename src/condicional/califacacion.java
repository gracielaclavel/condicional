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
public class califacacion 
  {
    
  public static void main(String[] args) 
    {
            float nota1, nota2, nota3, promedio;
            
       nota1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nota 1"));
       nota2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota 2"));
       nota3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota 3"));
       
       promedio= (nota1 + nota2 + nota3) /3;
      
         JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);
        
        if (promedio>=4)
        
        {
        
        //si  no  se cumple la  condicion s e ejecuta esto
            JOptionPane.showMessageDialog(null, "Aprobo");
        }
         
        else
        {
        JOptionPane.showMessageDialog(null, "Reprobo"); 
        
        }
       
                
        
            
        }
   // TODO code application logic here
    }
    

