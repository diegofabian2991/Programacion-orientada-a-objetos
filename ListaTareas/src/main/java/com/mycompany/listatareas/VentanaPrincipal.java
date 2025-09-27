/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Clase encargada de construir y mostrar la interfaz gráfica.
 */
public class VentanaPrincipal {
    private JFrame frame;
    private DefaultListModel<Tarea> modelo;
    private JList<Tarea> listaTareas;
    private JTextField campoTexto;

    public VentanaPrincipal() {
        modelo = new DefaultListModel<>();
    }

    public void mostrarGUI() {
        frame = new JFrame("Lista de Tareas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        // Campo de texto y botón "Añadir"
        campoTexto = new JTextField();
        JButton botonAgregar = new JButton("Añadir Tarea");

        JPanel panelSuperior = new JPanel(new BorderLayout(6, 6));
        panelSuperior.add(campoTexto, BorderLayout.CENTER);
        panelSuperior.add(botonAgregar, BorderLayout.EAST);

        // Lista de tareas
        listaTareas = new JList<>(modelo);
        listaTareas.setCellRenderer(new RenderTarea());
        JScrollPane scroll = new JScrollPane(listaTareas);

        // Botones inferiores
        JButton botonMarcar = new JButton("Marcar como Completada");
        JButton botonEliminar = new JButton("Eliminar Tarea");
        JPanel panelInferior = new JPanel();
        panelInferior.add(botonMarcar);
        panelInferior.add(botonEliminar);

        frame.add(panelSuperior, BorderLayout.NORTH);
        frame.add(scroll, BorderLayout.CENTER);
        frame.add(panelInferior, BorderLayout.SOUTH);

        // Eventos
        botonAgregar.addActionListener(e -> agregarTarea());
        campoTexto.addActionListener(e -> agregarTarea());

        botonMarcar.addActionListener(e -> marcarTareas());
        botonEliminar.addActionListener(e -> eliminarTareas());

        // Tecla Delete para eliminar
        listaTareas.getInputMap(JComponent.WHEN_FOCUSED)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "eliminar");
        listaTareas.getActionMap().put("eliminar", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarTareas();
            }
        });

        // Doble clic para alternar completado
        listaTareas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int index = listaTareas.locationToIndex(e.getPoint());
                    if (index != -1) {
                        Tarea t = modelo.getElementAt(index);
                        t.setCompletada(!t.isCompletada());
                        modelo.setElementAt(t, index);
                    }
                }
            }
        });

        frame.setVisible(true);
    }

    // Métodos auxiliares
    private void agregarTarea() {
        String texto = campoTexto.getText().trim();
        if (!texto.isEmpty()) {
            modelo.addElement(new Tarea(texto));
            campoTexto.setText("");
        }
    }

    private void marcarTareas() {
        for (int i : listaTareas.getSelectedIndices()) {
            Tarea t = modelo.getElementAt(i);
            t.setCompletada(true);
            modelo.setElementAt(t, i);
        }
    }

    private void eliminarTareas() {
        int[] seleccionadas = listaTareas.getSelectedIndices();
        for (int i = seleccionadas.length - 1; i >= 0; i--) {
            modelo.remove(seleccionadas[i]);
        }
    }
}
