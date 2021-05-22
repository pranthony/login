package com.gt.modo_oscuro;

import com.sun.swing.internal.plaf.basic.resources.basic;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicButtonUI;

public class PintorBT {

    private Color color;

    public PintorBT(Color color) {
        this.color = color;

    }

    public void pintar(JPanel lugar) {

        for (Component panel : lugar.getComponents()) {

            if (panel.getClass() == JButton.class) {
                JButton boton = (JButton) panel;
                boton.setBackground(color);
                boton.setUI(new BasicButtonUI());

            }

        }
    }
}
