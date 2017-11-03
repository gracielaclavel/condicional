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
       
       promedio= (nota1 + nota2 + nota3) /3; //las 3 notas se divide
      
         JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);
        
        if (promedio>=4)
        
        {
        
        //si  no  se cumple esta   condicion  ejecuta esto
            JOptionPane.showMessageDialog(null, " SI Aprobado");
        }
         
        else
        {
        JOptionPane.showMessageDialog(null, "No Reprobado"); 
        
        }
       
                
        
            
        }
   // termino de la clase de calificacion
    }
    

