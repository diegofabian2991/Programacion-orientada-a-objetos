/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppGUI extends JFrame {

    private JTextField inputField;
    private JButton addButton, clearButton;
    private DefaultListModel<String> listModel;
    private JList<String> dataList;

    public AppGUI() {
        // Configuración básica de la ventana
        setTitle("Gestor de Datos - Ejemplo GUI");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar ventana

        // Layout principal
        setLayout(new BorderLayout(10, 10));

        // --- Panel superior con etiqueta y campo de texto ---
        JPanel topPanel = new JPanel(new FlowLayout());
        JLabel label = new JLabel("Ingrese un dato:");
        inputField = new JTextField(15);
        topPanel.add(label);
        topPanel.add(inputField);
        add(topPanel, BorderLayout.NORTH);

        // --- Lista para mostrar los datos ---
        listModel = new DefaultListModel<>();
        dataList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(dataList);
        add(scrollPane, BorderLayout.CENTER);

        // --- Panel inferior con botones ---
        JPanel bottomPanel = new JPanel(new FlowLayout());
        addButton = new JButton("Agregar");
        clearButton = new JButton("Limpiar");
        bottomPanel.add(addButton);
        bottomPanel.add(clearButton);
        add(bottomPanel, BorderLayout.SOUTH);

        // --- Eventos ---
        // Botón Agregar
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = inputField.getText().trim();
                if (!text.isEmpty()) {
                    listModel.addElement(text);
                    inputField.setText("");
                } else {
                    JOptionPane.showMessageDialog(AppGUI.this,
                            "El campo no puede estar vacío",
                            "Error de entrada",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Botón Limpiar
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.clear();
                inputField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        // Crear y mostrar la GUI en el hilo de eventos
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AppGUI().setVisible(true);
            }
        });
    }
}