

package com.mycompany.ejercicio14buclesats;

import javax.swing.JOptionPane;

public class Ejercicio14BuclesATS {

    public static void main(String[] args) {
       
        long suma=0,contador=0;
        
        for( int i=1; i<=10; i++){
        
        int sueldo=Integer.parseInt(JOptionPane.showInputDialog("Digite un sueldo"));
        
         suma+=sueldo;
         
         if(sueldo>1000){
         
             contador++;
         
         }
         
        
        }
        
         JOptionPane.showMessageDialog(null,"Lasuma de los sueldos es de: "+suma);
         JOptionPane.showMessageDialog(null," Los sueldo mayores a 1000 son: "+contador);   
        
        
    }
}
