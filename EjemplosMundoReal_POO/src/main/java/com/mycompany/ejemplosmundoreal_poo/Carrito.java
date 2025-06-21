/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosmundoreal_poo;

/**
 *
 * @author diego
 */


import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private Cliente cliente;
    private List<Producto> productos;

    public Carrito(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void mostrarCarrito() {
        System.out.println("Carrito de " + cliente.getNombre() + ":");
        double total = 0;
        for (Producto p : productos) {
            System.out.println("- " + p);
            total += p.getPrecio();
        }
        System.out.println("Total: $" + total);
    }
}