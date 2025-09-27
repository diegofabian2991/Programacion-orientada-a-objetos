/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Render personalizado para mostrar las tareas.
 * Si una tarea está completada se muestra tachada y en gris.
 */
public class RenderTarea extends JLabel implements ListCellRenderer<Tarea> {

    public RenderTarea() {
        setOpaque(true);
        setBorder(new EmptyBorder(4, 6, 4, 6));
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Tarea> lista,
                                                  Tarea tarea,
                                                  int index,
                                                  boolean isSelected,
                                                  boolean cellHasFocus) {

        if (tarea != null) {
            if (tarea.isCompletada()) {
                setText("<html><span style='color:gray'><s>" + tarea.getTexto() + "</s></span></html>");
            } else {
                setText(tarea.getTexto());
            }
        }

        if (isSelected) {
            setBackground(lista.getSelectionBackground());
            setForeground(lista.getSelectionForeground());
        } else {
            setBackground(lista.getBackground());
            setForeground(tarea != null && tarea.isCompletada() ? Color.GRAY : lista.getForeground());
        }

        setFont(lista.getFont());
        return this;
    }
}