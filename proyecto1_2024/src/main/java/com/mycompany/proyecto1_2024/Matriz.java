/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_2024;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ramir
 */
public class Matriz {
    /**
     * @param args the command line arguments
     */
    //Variables filas, columnas y matriz
    private int filas;
    private int columnas;
    private double[][] matriz;

    //Constructor básico
    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new double[filas][columnas];
    }

    //Segundo constructor
    public Matriz(Matriz m) {
        this.filas = m.filas;
        this.columnas = m.columnas;
        this.matriz = new double[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                this.matriz[i][j] = Math.random() * 10.0;//Valores aleatorios
            }          
        }
    }

    //Método para leer valores desde el teclado
    public void leer() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                this.matriz[i][j] = entrada.nextDouble();
            }
        }
        System.out.println("--------------------------------------------------");
    }

    //Método para imprimir la matriz
    public void imprimir() {
        DecimalFormat df = new DecimalFormat("#.##");//Formato para 2 decimales
        System.out.println("Matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(df.format(this.matriz[i][j]) + "\t");
            }
            System.out.println();
        }
    }

    //Método para encontrar el valor máximo
    public double encontrarMaximo() {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (this.matriz[i][j] > max) {
                    max = this.matriz[i][j];
                }
            }
        }
        return max;
    }

    //Método para sumar dos matrices
    public Matriz sumar(Matriz m) {
        Matriz resultadoZ = new Matriz(filas, columnas);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultadoZ.matriz[i][j] = this.matriz[i][j] + m.matriz[i][j];
            }
        }
        return resultadoZ;
    }

    //Método para multiplicar dos matrices
    public Matriz multiplicar(Matriz m) {
        Matriz resultadoZ = new Matriz(filas, columnas);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultadoZ.matriz[i][j] = this.matriz[i][j] * m.matriz[i][j];
            }
        }
        return resultadoZ;
    }

}

