/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosmundoreal_poo;

/**
 *
 * @author diego
 */

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 899.99);
        Producto p2 = new Producto("Mouse", 25.00);
        Producto p3 = new Producto("Teclado", 45.50);

        Cliente cliente = new Cliente("Diego");

        Carrito carrito = new Carrito(cliente);
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);

        carrito.mostrarCarrito();
    }
}