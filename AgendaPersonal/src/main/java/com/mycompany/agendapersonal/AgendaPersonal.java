/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agendapersonal;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AgendaPersonal extends JFrame {

    private JTable tablaEventos;
    private DefaultTableModel modeloTabla;
    private JSpinner spinnerFecha;
    private JSpinner spinnerHora;
    private JTextField txtDescripcion;
    private JButton btnAgregar, btnEliminar, btnSalir;

    private SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");

    public AgendaPersonal() {
        super("Agenda Personal");

        // === Panel de entrada ===
        JPanel panelEntrada = new JPanel(new GridLayout(3, 2, 5, 5));
        panelEntrada.setBorder(BorderFactory.createTitledBorder("Nuevo Evento"));

        // Fecha
        panelEntrada.add(new JLabel("Fecha (dd/MM/yyyy):"));
        spinnerFecha = new JSpinner(new SpinnerDateModel());
        spinnerFecha.setEditor(new JSpinner.DateEditor(spinnerFecha, "dd/MM/yyyy"));
        panelEntrada.add(spinnerFecha);

        // Hora
        panelEntrada.add(new JLabel("Hora (HH:mm):"));
        spinnerHora = new JSpinner(new SpinnerDateModel());
        spinnerHora.setEditor(new JSpinner.DateEditor(spinnerHora, "HH:mm"));
        panelEntrada.add(spinnerHora);

        // Descripción
        panelEntrada.add(new JLabel("Descripción:"));
        txtDescripcion = new JTextField();
        panelEntrada.add(txtDescripcion);

        // === Tabla de eventos ===
        modeloTabla = new DefaultTableModel(new Object[]{"Fecha", "Hora", "Descripción"}, 0);
        tablaEventos = new JTable(modeloTabla);
        JScrollPane scrollTabla = new JScrollPane(tablaEventos);

        // === Panel de botones ===
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        btnAgregar = new JButton("Agregar");
        btnEliminar = new JButton("Eliminar seleccionado");
        btnSalir = new JButton("Salir");
        panelBotones.add(btnAgregar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnSalir);

        // === Eventos de botones ===
        btnAgregar.addActionListener(e -> agregarEvento());
        btnEliminar.addActionListener(e -> eliminarEvento());
        btnSalir.addActionListener(e -> dispose());

        // === Layout principal ===
        setLayout(new BorderLayout(10, 10));
        add(panelEntrada, BorderLayout.NORTH);
        add(scrollTabla, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        // Configuración de ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
    }

    private void agregarEvento() {
        String descripcion = txtDescripcion.getText().trim();

        if (descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "La descripción no puede estar vacía",
                    "Validación",
                    JOptionPane.WARNING_MESSAGE);
            txtDescripcion.requestFocus();
            return;
        }

        Date fecha = (Date) spinnerFecha.getValue();
        Date hora = (Date) spinnerHora.getValue();

        String fechaStr = formatoFecha.format(fecha);
        String horaStr = formatoHora.format(hora);

        // Creamos un objeto Evento (aunque no lo guardemos en lista aún)
        Evento evento = new Evento(fechaStr, horaStr, descripcion);

        // Lo añadimos a la tabla
        modeloTabla.addRow(new Object[]{evento.getFecha(), evento.getHora(), evento.getDescripcion()});

        txtDescripcion.setText("");
        txtDescripcion.requestFocus();
    }

    private void eliminarEvento() {
        int filaSeleccionada = tablaEventos.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this,
                    "Selecciona un evento primero",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        int opcion = JOptionPane.showConfirmDialog(this,
                "¿Eliminar el evento seleccionado?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            modeloTabla.removeRow(filaSeleccionada);
        }
    }
}