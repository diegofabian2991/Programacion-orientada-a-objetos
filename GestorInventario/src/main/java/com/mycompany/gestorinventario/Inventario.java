/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.gestorinventario;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos = new ArrayList<>();
    private GestorDeArchivo gestor = new GestorDeArchivo();
    private ValidadorArchivo validador = new ValidadorArchivo();
    private String archivo = "inventario.txt";

    public Inventario() {
        File f = new File(archivo);
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                System.out.println("No se pudo crear inventario.txt: " + e.getMessage());
            }
        }
        cargarInventario();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
        guardarInventario();
    }

    public void actualizarProducto(String nombre, int nuevaCantidad, double nuevoPrecio) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                p.setCantidad(nuevaCantidad);
                p.setPrecio(nuevoPrecio);
                guardarInventario();
                System.out.println("Producto actualizado correctamente.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void eliminarProducto(String nombre) {
        Producto aEliminar = null;
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                aEliminar = p;
                break;
            }
        }
        if (aEliminar != null) {
            productos.remove(aEliminar);
            guardarInventario();
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    private void guardarInventario() {
        StringBuilder contenido = new StringBuilder();
        for (Producto p : productos) {
            contenido.append(p.toString()).append("\n");
        }
        gestor.guardar(archivo, contenido.toString());
    }

    private void cargarInventario() {
        try {
            validador.verificarNoVacio(archivo);
            String contenido = gestor.leer(archivo);
            String[] lineas = contenido.split("\n");
            for (String linea : lineas) {
                productos.add(Producto.fromString(linea));
            }
        } catch (ArchivoVacioException ave) {
            System.out.println("Archivo vacío al cargar inventario. Se iniciará vacío.");
        } catch (IOException e) {
            System.out.println("Error al cargar inventario: " + e.getMessage());
        }
    }
}
