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
public class Libro {
 String titulo;
 int edicion;
 List<Ejemplar> ejemplares;
 List<Autor> autores;

    public Libro(String titulo, int edicion, List<Autor> autores) {
        this.titulo = titulo;
        this.edicion = edicion;
        this.ejemplares = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
 
}
