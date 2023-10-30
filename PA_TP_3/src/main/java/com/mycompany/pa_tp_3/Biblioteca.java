/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pa_tp_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sirgi
 */
public class Biblioteca {
String nombre;
int direccion;
int telefono;
List<Libro> libros;

    public Biblioteca(String nombre, int direccion, int telefono, List<Libro> libros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.libros = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

   public void imprimirLibros(Biblioteca b){
      System.out.println(b.toString());
       for(Libro lib: libros){
           System.out.println("Libro: "+lib.getTitulo()+ "Edicion: "+lib.getEdicion());
           
       }
   }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

}
