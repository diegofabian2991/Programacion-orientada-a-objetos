/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.mycompany.gestorinventario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENÚ INVENTARIO ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Seleccione opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();
                    inventario.agregarProducto(new Producto(nombre, cantidad, precio));
                    break;
                case 2:
                    inventario.mostrarProductos();
                    break;
                case 3:
                    System.out.print("Nombre del producto a actualizar: ");
                    String nombreAct = sc.nextLine();
                    System.out.print("Nueva cantidad: ");
                    int cantAct = sc.nextInt();
                    System.out.print("Nuevo precio: ");
                    double precioAct = sc.nextDouble();
                    sc.nextLine();
                    inventario.actualizarProducto(nombreAct, cantAct, precioAct);
                    break;
                case 4:
                    System.out.print("Nombre del producto a eliminar: ");
                    String nombreElim = sc.nextLine();
                    inventario.eliminarProducto(nombreElim);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
