/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.mycompany.capturateclac;


package main;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JList<String> lista;
    private JButton boton;

    public Ventana() {
        setTitle("Captura tecla C");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear lista
        String[] elementos = {"Elemento 1", "Elemento 2", "Elemento 3"};
        lista = new JList<>(elementos);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Crear botón
        boton = new JButton("Botón de ejemplo");

        // Panel
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(lista), BorderLayout.CENTER);
        panel.add(boton, BorderLayout.SOUTH);

        add(panel);

        // Agregar listener para tecla 'C'
        lista.addKeyListener(new CapturaTeclaListener(lista));
    }
}