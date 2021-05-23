/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.iinsPre;


import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author User
 */
public class Insertar {
    private String enunciado;
    private String alternativa1;
    private String alternativa2;
    private String aleternativa3;
    private String alternativa4;

    public Insertar(String enunciado, String alternativa1, String alternativa2, String aleternativa3, String alternativa4) {
        this.enunciado = enunciado;
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.aleternativa3 = aleternativa3;
        this.alternativa4 = alternativa4;
    }
    public String[] getAll (){
        String [] all ={enunciado,alternativa1, alternativa2,aleternativa3, alternativa4};
        return all;
    }
    public void escribir(JLabel enunciadoL, Component [] alter){
        String [] all ={enunciado,alternativa1, alternativa2,aleternativa3, alternativa4};
        enunciadoL.setText(all[0]);
        for (int i = 0; i < 4; i++) {
           if (alter[i].getClass()==JRadioButton.class){
               JRadioButton alterna=(JRadioButton) alter[i];
               alterna.setText(all[i+1]);
           }else{
               System.err.println("alguna componente no es JRadiobutton");
           }
            
        }
     
        
        
        
    }
    
}
