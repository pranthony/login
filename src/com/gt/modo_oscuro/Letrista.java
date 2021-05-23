 
package com.gt.modo_oscuro;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

 
public class Letrista {
    private Color color;
    

    public Letrista(Color color) {
        this.color = color;
        
    } 
    
    public void pintar(JPanel lugar){
        
        for (Component panel : lugar.getComponents()) {
            
            if (panel.getClass() == JLabel.class || panel.getClass()==JRadioButton.class) {
              panel.setForeground(color);  
            }
            
           if (panel.getClass() == JPanel.class) {
                 pintar((JPanel)panel);
           }
        }
    }
}
