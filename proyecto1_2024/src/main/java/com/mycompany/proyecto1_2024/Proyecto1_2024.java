/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1_2024;
import java.util.*;
/**
 *
 * @author ramir
 */
public class Proyecto1_2024 {

    public static void main(String[] args) {
        Scanner entrada = new  Scanner(System.in); 
        int opcion = 0; 
        int salida =0;
        while(salida != 1){
            System.out.println("Menu Proyecto 1 programacion 2024 Grupo #");
            System.out.println("\t 1. Problema 1");
            System.out.println("\t 2. Problema 2");
            System.out.println("\t 3. Problema 3");
            System.out.println("\t 4. Problema 4");
            System.out.println("\t 5. Problema 5");
            System.out.println("\t 6. Problema 6");
            System.out.println("\t 7. Problema 7");
            System.out.println("\t 8. Problema 8");
            System.out.println("\t 9. Problema 9");
            System.out.println("\t 10. Problema 10");
            System.out.println("\t 11. Salir"); 
            
            try{ 
            opcion = entrada.nextInt();
            } catch(Exception e){
                System.out.println("Error:" + e);
            }
            switch(opcion){
             case 1: 
                    System.out.println("Problema 1");
                    problema_1();
                    break;
                case 2: 
                    System.out.println("Problema 2");
                    problema_2();
                    break;
                case 3: 
                    System.out.println("Problema 3");
                    problema_3();
                    break;
                case 4: 
                    System.out.println("Problema 4");
                    problema_4();
                    break;
                case 5:
                    System.out.println("Problema 5");
                    problema_5();
                    break;
                case 6:
                    System.out.println("Problema 6");
                    problema_6();
                    break;
                case 7:
                    System.out.println("Problema 7");
                  
                    break;
                case 8:
                    System.out.println("Problema 8");
                    break;
                case 9:
                    System.out.println("Problema 9");
                    break;
                case 10:
                    System.out.println("Problema 10");
                    break;
                case 11:
                    System.out.println("");
                    salida = 1;
                    break;
                default: System.out.println("error");
                break;
        
        
            }   
        }
    }
    
   public static void problema_1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int n = scanner.nextInt();
        long factorial = 1;
        
        if(n == 0 || n == 1){
            factorial = 1;
        }else{
            for (int i = 2; i <= n; i++){
               factorial = factorial*i;
            }
        }
            System.out.println("El numero factorial de: " + n + " es: " + factorial);
        
   
   }
   
   public static void problema_2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros que desea ingresar: ");
        int n = scanner.nextInt();
        
        int cantidadNegativos = 0;
        int cantidadPositivos = 0;
        int cantidadPares = 0;
        int cantidadImpares = 0;
        
        for (int i = 0; i<n; i++) {
            System.out.println("Ingrese el numero");
            int numero = scanner.nextInt();
            
            if (numero>0) {
                cantidadPositivos ++;
            }else if (numero<0) {
                cantidadNegativos ++;
            }
                
            if (numero%2==0) {
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
            
            
       }
        
        System.out.println("Números negativos: " + cantidadNegativos);
        System.out.println("Números positivos: " + cantidadPositivos);
        System.out.println("Números pares: " + cantidadPares);
        System.out.println("Números impares: " + cantidadImpares); 
   }
   
   public static void problema_3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el sector que desea: ");
        System.out.println("\t 1.Sol candente. \n\t 2.Sol Luminoso \n\t 3.Sombrita \n\t 4.Tribunita \n\t 5.Silla Plastica.");
        int opcionSector = scanner.nextInt();
        System.out.print("Ingrese la cantidad de entradas a comprar: ");
        int canEntradas = scanner.nextInt();
        System.out.println("Elija un metodo de pago: ");
        System.out.println("\t 1.Efectivo. \n\t 2.Tarjeta de Credito.");
        int opcionPago = scanner.nextInt();
        final int solCandente = 35;
        final int solLuminoso = 55;
        final int sombrita = 80;
        final int tribunita = 150;
        final int sillaPlastica = 200;
        int cantidadEntradas = 0;
        int sectorSeleccionado = 0;
        
        switch(opcionSector){
                case 1:
                sectorSeleccionado = solCandente;
                break;
                 case 2:
                sectorSeleccionado = solLuminoso;
                break;
                 case 3:
                sectorSeleccionado = sombrita;
                break;
                 case 4:
                sectorSeleccionado = tribunita;
                break;
                 case 5:
                sectorSeleccionado = sillaPlastica;
                break;
                
                 default: 
                     System.out.println("Solo tiene 5 opciones");
        }
        int sumaEntradas = sectorSeleccionado*canEntradas;
        System.out.println("La suma de las entradas es: " + sumaEntradas);
       
        switch (opcionPago){
            case 1:
                System.out.println("la cantidad a pagar es: Q." + sumaEntradas + ".00");
                break;
                
            case 2: 
                //System.out.println("suma" + sumaEntradas);
                //System.out.println(5.0/100.0);
                double incremento = sumaEntradas*(0.05);
                //System.out.println("el incremento: " + incremento);
                double total = incremento+sumaEntradas;
                System.out.println("la cantidad a pagar es: Q." + total + "0");
                break;
            default:
                System.out.println("Solo hay dos opciones");
        }
    }   //problema 3
   
   public static void problema_4(){
       for (int i = 0; i <= 100; i++) { 
           if (i%3==0 && i%5==0) {
               System.out.println("Programacion I");  
           } else if (i%3 == 0) {
               System.out.println("Progra");
           }else if (i%5==0) {
               System.out.println("macion");
           }else{
               System.out.println(i);
           }
       
       }
   }
   
   public static void problema_5(){
   Scanner scanner = new Scanner(System.in);
        
          // Ingresar las horas trabajadas y la tarifa por hora
        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese la tarifa de pago por hora: ");
        double tarifaPorHora = scanner.nextDouble();

        // Declaración de constantes
        double incentivoPrivado = 250.0;
        double tasaIGSS = 4.83 / 100;
        double tasaISR = 5.0 / 100;

        // Calcular el salario y la bonificación por horas extras
        double salarioBase;
        double pagoHorasExtras = 0.0;

        if (horasTrabajadas > 40) {
            salarioBase = 40 * tarifaPorHora;
            int horasExtras = horasTrabajadas - 40;
            pagoHorasExtras = horasExtras * tarifaPorHora * 1.5;
        } else {
            salarioBase = horasTrabajadas * tarifaPorHora;
        }

        // Calcular el salario total antes de descuentos
        double salarioTotalAntesDescuentos = salarioBase + pagoHorasExtras + incentivoPrivado;

        // Calcular los descuentos
        double descuentoIGSS = salarioTotalAntesDescuentos * tasaIGSS;
        double descuentoISR = salarioTotalAntesDescuentos * tasaISR;

        // Calcular el salario total después de descuentos
        double salarioTotalDespuesDescuentos = salarioTotalAntesDescuentos - descuentoIGSS - descuentoISR;

        // Mostrar los resultados
        System.out.println("Detalles del Pago:");
        System.out.printf("Salario Base: Q%.2f%n", salarioBase);
        System.out.printf("Pago por Horas Extras: Q%.2f%n", pagoHorasExtras);
        System.out.printf("Bonificación Incentivo: Q%.2f%n", incentivoPrivado);
        System.out.printf("Salario Total antes de Descuentos: Q%.2f%n", salarioTotalAntesDescuentos);
        System.out.printf("Descuento IGSS (4.83%%): Q%.2f%n", descuentoIGSS);
        System.out.printf("Descuento ISR (5%%): Q%.2f%n", descuentoISR);
        System.out.printf("Salario Total después de Descuentos: Q%.2f%n", salarioTotalDespuesDescuentos);
   }
   
    public static void problema_6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de personas a encuestar: ");
        int nEncuestados = scanner.nextInt();
        double pesoNiños = 0.0, pesoAdultos = 0.0, pesoJovenes = 0.0, pesoAMayores = 0.0;
        int contNiños = 0, contAdultos = 0, contJovenes = 0, contAMayores = 0;
        
        for (int i = 0; i < nEncuestados; i++) {
            System.out.println("**************************************************************************");
            System.out.println("Ingrese la edad de la persona: ");
            int edadPersona = scanner.nextInt();
            System.out.println("Ingrese el peso de la persona: ");
            double peso = scanner.nextDouble();
            System.out.println("**************************************************************************");
        
            if (edadPersona > 0 && edadPersona <=12) {
                contNiños++;
                pesoNiños += peso;
            } else if (edadPersona >=13 && edadPersona<=29 ) {
                contJovenes++;
                pesoJovenes += peso;
            } else if (edadPersona >=30 && edadPersona <=59) {
                contAdultos++;
                pesoAdultos += peso;
            }else if (edadPersona >=60 && edadPersona <=100) {
                contAMayores++;
                pesoAMayores += peso;
            }else{
                System.out.println("Edad fuera de rango");
            }
        }
    }
}
