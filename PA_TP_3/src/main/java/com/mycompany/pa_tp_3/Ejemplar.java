/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pa_tp_3;

/**
 *
 * @author sirgi
 */
public class Ejemplar {
int nroInventario;    
boolean sale;
boolean prestado;

    public Ejemplar(int nroInventario) {
        this.nroInventario = nroInventario;
       
    }

    public int getNroInventario() {
        return nroInventario;
    }

    public void setNroInventario(int nroInventario) {
        this.nroInventario = nroInventario;
    }

    public boolean isSale() {
        return sale;
    }

    public void setSale(boolean sale) {
        this.sale = sale;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

}
