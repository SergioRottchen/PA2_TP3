/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pa_tp_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sirgi
 */
public class PA_TP_3 {

    public static void main(String[] args) {
        Autor autor1 = new Autor();
        autor1.nombre = "Autor 1";

        List<Autor> autores = new ArrayList<>();
        autores.add(autor1);

        Libro libro = new Libro("Libro 1", 2000, autores);

        // Crear 4 ejemplares y asociarlos al libro
        for (int i = 1; i <= 4; i++) {
            Ejemplar ejemplar = new Ejemplar(i);
            libro.ejemplares.add(ejemplar);
        }

        // Imprimir los valores de los ejemplares
        for (Ejemplar ejemplar : libro.ejemplares) {
            System.out.println("Inicia la impresión de un ejemplar:");
            System.out.println("Número de Inventario: " + ejemplar.nroInventario);
            System.out.println("Disponible para la venta: " + ejemplar.sale);
            System.out.println("Prestado: " + ejemplar.prestado);
        }
        // Segunda parte del TP sobre arreglos
        int[] vector = new int[10];
        //llenamos el vector con numeros del 1 hasta el 10
        for(int i=0; i<10;i++){
            vector[i]=i+1;
        }
        int var=0;
        //recorremos el vector y agregamos sus valores en la variable
        for(int i=0;i<10;i++){
            var+= vector[i];
            
        }
        //imprimimos el resultado por pantalla
        System.out.println("La suma del vector es: "+var);
    
    
    String[] meses = {"Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número entre 1 y 12
        System.out.print("Ingresa un número entre 1 y 12: ");
        int numero = scanner.nextInt();

        // Verificar si el número está en el rango válido
        if (numero >= 1 && numero <= 12) {
            String mes = meses[numero - 1];
            System.out.println("El mes correspondiente al número " + numero + " es " + mes);
        } else {
            System.out.println("Número fuera de rango. Debe estar entre 1 y 12.");
        }
        //Codigo solicitando una letra
         // Pedir al usuario que ingrese una letra
        System.out.print("Ingresa una letra: ");
        char letra = scanner.next().charAt(0);

        // Convertimos la letra a minúscula para hacer la comparación 
        letra = Character.toLowerCase(letra);

        // Recorremos el vector y comparamos e imprimimos
        System.out.println("Meses que comienzan con la letra '" + letra + "':");
        for (String mes : meses) {
            if (Character.toLowerCase(mes.charAt(0)) == letra) {
                System.out.println(mes);
            }
        }
        scanner.close();

    }
}
