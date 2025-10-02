/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.mycompany.capturateclac;

/**
 *
 * @author diego
 */
package main;

import java.awt.event.*;
import javax.swing.*;

public class CapturaTeclaListener extends KeyAdapter {
    private JList<String> lista;

    public CapturaTeclaListener(JList<String> lista) {
        this.lista = lista;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'c' || e.getKeyChar() == 'C') {
            int index = lista.getSelectedIndex();
            if (index != -1) {
                System.out.println("Se presionó C sobre: " + lista.getSelectedValue());
            } else {
                System.out.println("Se presionó C pero no hay elemento seleccionado.");
            }
        }
    }
}