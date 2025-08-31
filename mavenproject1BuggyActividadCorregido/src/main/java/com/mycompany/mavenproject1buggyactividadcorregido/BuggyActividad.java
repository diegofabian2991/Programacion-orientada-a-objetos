/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1buggyactividadcorregido;

import java.util.*;

public class BuggyActividad {

    public static void main(String[] args) {

        // LISTA de nombres
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Ana");

        // Evitar índice fuera de rango
        if (nombres.size() > 2) {
            System.out.println("Elemento en posición 2: " + nombres.get(2));
        } else {
            System.out.println("No hay suficiente elementos en la lista.");
        }

        // Comparación correcta de cadenas
        String buscado = new String("Ana");
        if (buscado.equals("Ana")) {
            System.out.println("Encontrado");
        }

        // MAPA de teléfonos con control
        Map<String, String> telefonos = new HashMap<>();
        telefonos.put("Ana", "0991111111");
        telefonos.put("Luis", "0992222222");

        // Evitar sobrescribir
        telefonos.putIfAbsent("Ana", "0993333333");

        // Validar existencia antes de obtener
        if (telefonos.containsKey("Bea")) {
            System.out.println("Bea: " + telefonos.get("Bea"));
        } else {
            System.out.println("Bea no tiene teléfono registrado.");
        }

        // SET de inscritos
        Set<Alumno> inscritos = new HashSet<>();
        inscritos.add(new Alumno(1, "Ana"));
        inscritos.add(new Alumno(2, "Luis"));
        inscritos.add(new Alumno(1, "Ana")); // duplicado lógico ignorado

        System.out.println("Tamaño del Set: " + inscritos.size());
        System.out.println(inscritos);
    }
}

class Alumno {

    int id;
    String nombre;

    Alumno(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{id=" + id + ", nombre='" + nombre + "'}";
    }

    // Sobrescribir equals y hashCode para evitar duplicados lógicos en HashSet
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Alumno)) return false;
        Alumno otro = (Alumno) obj;
        return this.id == otro.id && Objects.equals(this.nombre, otro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }
}