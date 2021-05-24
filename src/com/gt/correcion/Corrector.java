/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.correcion;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Corrector {

public void corregir(JRadioButton respuesta, JLabel info){
    
    if (respuesta.isSelected()) {
       info.setText("Respuesta correcta");
       info.setForeground(Color.GREEN);
    }else {
        info.setText("Respuesta incorrecta");
        info.setForeground(Color.RED);
    }
    
}
    
}
