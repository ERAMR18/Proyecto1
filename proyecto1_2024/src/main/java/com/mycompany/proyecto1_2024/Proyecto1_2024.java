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

    public static void main(String[] args) {      // metodo main
        Scanner entrada = new  Scanner(System.in);   // creacion del objeto scanner
        int opcion = 0;    //creacion de la variable opcion para el menu
        int salida =0;     // valiable de conteo para el ciclo while
        while(salida != 1){
            System.out.println("Menu Proyecto 1 programacion 2024 Grupo #");
            System.out.println("\t 1. Problema 1");
            System.out.println("\t 2. Problema 2");
            System.out.println("\t 3. Problema 3");
            System.out.println("\t 4. Problema 4");
            System.out.println("\t 5. Problema 5");              //implementacion del menu para poder seleccionar individualmente cada uno de los problemas
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
                    problema_4();                                         //Creacion del menu mediante el uso de swith
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
                    problema_7();
                    break;
                case 8:
                    System.out.println("Problema 8");
                    problema_8();
                    break;
                case 9:
                    System.out.println("Problema 9");
                    problema_9();
                    break;
                case 10:
                    System.out.println("Problema 10");
                    problema_10();
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
    
    //Problema numero 1
   public static void problema_1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int n = scanner.nextInt();    //en esta variable se alamcenaran todos los datos ingresados por el usuario
        long factorial = 1;           // el uso de la variable long nos permite hacer uso de cantidades grandes y que el resultado pueda devolver resultados grandes
        
        if(n == 0 || n == 1){            //si n es igual a 0 "o" n es igual a 1 entonces factorial es igual a 1
            factorial = 1;
        }else{         //sino
            for (int i = 2; i <= n; i++){  //ciclo for para ir haciendo la operacion para encontrar el factorial
               factorial = factorial*i;
            }
        }
            System.out.println("El numero factorial de: " + n + " es: " + factorial);            //salida a consola
        
   
   }
   
   //Problema numero 2
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
                cantidadPositivos ++;                         //contador para cada uno de los tipos de numeros que hay
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
        System.out.println("Números pares: " + cantidadPares);                      //salida
        System.out.println("Números impares: " + cantidadImpares); 
   }
   
//Problema numero 3
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
        final int tribunita = 150;                          //definicion de variables
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
                sectorSeleccionado = sombrita;                         //menu
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
                //System.out.println("el incremento: " + incremento);                                   //recargo
                double total = incremento+sumaEntradas;
                System.out.println("la cantidad a pagar es: Q." + total + "0");
                break;
            default:
                System.out.println("Solo hay dos opciones");
        }
    }   
   //problema 4  
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
            System.out.println("Ingrese la edad de la persona: #" + (i+1) );
            int edadPersona = scanner.nextInt();
            System.out.println("Ingrese el peso de la persona: #" + (i+1));
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
                System.out.println("Edad fuera de rango encuesta numero: #" + (i+1));
            }
        }
        double promedioNiños = (contNiños>0) ? (pesoNiños / contNiños): 0;  //aplicacion de ternario
        double promedioAdultos = (contAdultos>0) ? (pesoAdultos / contAdultos): 0;
        double promedioJovenes = (contJovenes>0) ? (pesoJovenes / contJovenes): 0;
        double promedioAMayores = (contAMayores>0) ? (pesoAMayores / contAMayores): 0;
        
        double promedioNiñosIf = 0;
        if (contNiños >0) {
            promedioNiñosIf = pesoNiños/contNiños;
        } else {
            promedioNiñosIf = 0;
        }
            
        System.out.println("El promedio de pesos para niños es de: " + promedioNiños);
        System.out.println("El promedio de pesos para adultos es de: " + promedioAdultos);
        System.out.println("El promedio de pesos para jovenes es de: " + promedioJovenes);
        System.out.println("El promedio de pesos para adultos mayores es de: " + promedioAMayores);
    }
    
    public static void problema_7(){
     Scanner entrada = new Scanner(System.in);
        
        //Ingreso de filas y columnas
        System.out.print("Ingresa el numero de filas: ");
        int filas = entrada.nextInt();
        System.out.print("Ingresa el numero de columnas: ");
        int columnas = entrada.nextInt();
        
        //Matriz m1
        Matriz m1 = new Matriz(filas, columnas);
        m1.leer();

        //Matriz m2
        Matriz m2 = new Matriz(m1); //Se usa el segundo constructor

        System.out.println("Matriz m1:");
        m1.imprimir();
        System.out.println("--------------------------------------------------");
        
        System.out.println("Matriz m2:");
        m2.imprimir();
        System.out.println("--------------------------------------------------");

        Matriz m3 = m1.sumar(m2);
        System.out.println("Matriz m3 (suma de m1 y m2):");
        m3.imprimir();
        System.out.println("--------------------------------------------------");

        double maximoM3 = m3.encontrarMaximo();
        System.out.println("Valor maximo en m3: " + String.format("%.2f", maximoM3));
        System.out.println("--------------------------------------------------");
    }
    
    public static void problema_8(){
        Scanner entrada = new  Scanner(System.in); 
        int opcion = 0;
        int salida = 0;
        do {            
             System.out.println("Seleccione una opcion:");
            System.out.println("1. Multiplicacion");
            System.out.println("2. Division");
            System.out.println("3. Salir");
            opcion = entrada.nextInt();
            
             if (opcion ==1 || opcion==2) {
                System.out.println("Ingrese el numero a");
                int a = entrada.nextInt();
                System.out.println("Ingrese el numero b");
                int b = entrada.nextInt();
                
                if (b == 0 && opcion ==2){
                    System.out.println("Error: no se puede dividir por 0");
                }else{
                    if (opcion == 1) {
                        int resultado = multiplicar(a,b);
                        System.out.println("El resultado de la multiplicacion: " +resultado);
                    }else if (opcion==2) {
                        int resultado = dividir(a,b);
                        System.out.println("El resultado de la division " +resultado);
                    }
                }
                esperarTeclaYLimpiarConsola();
            }
        } while (opcion != 3);
    
     } 
 
    public static int multiplicar(int a,int b){
        int resultado = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            resultado += a;
        }
        
        if (b<0) {
            resultado = -resultado;
        }
        return resultado;
    }
    
    public static int dividir(int a,int b){
        int cociente = 0;
        int residuo = Math.abs(a);
        int divisor = Math.abs(b);
        while(residuo>=divisor){
            residuo -= divisor;
            cociente++;
        }
        
        if ((a<0 && b>0) || (a>0 && b<0)) {
            cociente =-cociente;
        }
        return cociente;
        
  
    }
           
    public static void esperarTeclaYLimpiarConsola() {
            try {
                System.out.println("Presione Enter para continuar...");
                System.in.read();
                limpiarConsola();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    public static void limpiarConsola() {
            // Método para simular la limpieza de la consola
            try {
                final String os = System.getProperty("os.name");

                if (os.contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
            } catch (final Exception e) {
                e.printStackTrace();
            }
        }
    
    public static void problema_9(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        
        
        boolean continuar = true;
        while (continuar) {
            System.out.println("Evaluación de Estudiantes");
            System.out.print("Ingrese el Código del Carnet: ");
            String codigoCarnet = entrada.next();

            System.out.print("Ingrese el Nombre del Alumno: ");
            String nombreAlumno = entrada.next();

            int primerParcial = ingresarNota(entrada, "primer parcial (0-10)", 0, 10);
            int segundoParcial = ingresarNota(entrada, "segundo parcial (0-20)", 0, 20);
            int zonaAcumulada = ingresarNota(entrada, "zona acumulada (0-20)", 0, 20);
            int examenFinal = ingresarNota(entrada, "examen final (0-50)", 0, 50);

            int notaFinal = primerParcial + segundoParcial + zonaAcumulada + examenFinal;
            System.out.println("Nota final: " + notaFinal);

            if (notaFinal >= 61) {
                System.out.println("Estado: Aprobado");
            } else {
                System.out.println("Estado: Reprobado");
            }

            if (notaFinal < 49) {
                System.out.println("Categoría: Estudiante Malo");
            } else if (notaFinal <= 69) {
                System.out.println("Categoría: Estudiante Regular");
            } else if (notaFinal <= 89) {
                System.out.println("Categoría: Estudiante Bueno");
            } else {
                System.out.println("Categoría: Estudiante Excelente");
            }

            System.out.print("¿Desea continuar con otro estudiante? (si/no): ");
            continuar = entrada.next().equalsIgnoreCase("si");
        }

        entrada.close();
        System.out.println("Programa finalizado.");
        
        
        
        
    
    }
    
    public static int ingresarNota(Scanner entrada, String descripcion, int min, int max) {
        int nota;
        while (true) {
            System.out.print("Ingrese la nota del " + descripcion + ": ");
            nota = entrada.nextInt();
            if (nota >= min && nota <= max) {
                break;
            } else {
                System.out.println("Error: La nota debe estar entre " + min + " y " + max + ".");
            }
        }
        return nota;
    }
    
    
    
    public static void problema_10(){
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Captura de información del cliente
            System.out.print("Ingrese el NIT del cliente: ");
            String nit = entrada.next();

            System.out.print("Ingrese el Nombre del cliente: ");
            String nombre = entrada.next();

            System.out.print("Ingrese la Dirección del cliente: ");
            String direccion = entrada.next();

            // Inicialización de variables
            double subtotal = 0;
            int opcion;

            // Menú de pizzas
            do {
                System.out.println("\nSeleccione el tipo de pizza:");
                System.out.println("\t1. Pizza Pequeña (Q35.00)");
                System.out.println("\t2. Pizza Mediana (Q63.50)");
                System.out.println("\t3. Pizza Grande (Q95.30)");
                System.out.println("\t4. No más pizzas");
                System.out.print("Opción: ");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        subtotal += 35.00;
                        break;
                    case 2:
                        subtotal += 63.50;
                        break;
                    case 3:
                        subtotal += 95.30;
                        break;
                    case 4:
                        System.out.println("No más pizzas.");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
                System.out.println("Subtotal hasta ahora: Q" + subtotal);
            } while (opcion != 4);

            // Menú de bebidas
            do {
                System.out.println("\nSeleccione el tamaño de la bebida:");
                System.out.println("\t1. Bebida Pequeña (Q12.40)");
                System.out.println("\t2. Bebida Grande (Q14.20)");
                System.out.println("\t3. No más bebidas");
                System.out.print("Opción: ");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        subtotal += 12.40;
                        break;
                    case 2:
                        subtotal += 14.20;
                        break;
                    case 3:
                        System.out.println("No más bebidas.");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
                System.out.println("Subtotal hasta ahora: Q" + subtotal);
            } while (opcion != 3);

            // Menú de postres
            do {
                System.out.println("\nSeleccione el tipo de postre:");
                System.out.println("\t1. Postre 1 (Q15.00)");
                System.out.println("\t2. Postre 2 (Q16.30)");
                System.out.println("\t3. No más postres");
                System.out.print("Opción: ");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        subtotal += 15.00;
                        break;
                    case 2:
                        subtotal += 16.30;
                        break;
                    case 3:
                        System.out.println("No más postres.");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
                System.out.println("Subtotal hasta ahora: Q" + subtotal);
            } while (opcion != 3);

            // Cálculo de descuentos e IVA
            double descuento = 0;
            if (subtotal > 200) {
                descuento = subtotal * 0.05;
            }
            double totalConDescuento = subtotal - descuento;
            double iva = totalConDescuento * 0.12;
            double total = totalConDescuento + iva;

            // Mostrar factura
            System.out.println("\nFactura:");
            System.out.println("NIT: " + nit);
            System.out.println("Nombre: " + nombre);
            System.out.println("Dirección: " + direccion);
            System.out.println("Subtotal: Q" + subtotal);
            System.out.println("Descuento: Q" + descuento);
            System.out.println("IVA: Q" + iva);
            System.out.println("Total: Q" + total);

            // Preguntar si desea realizar otra compra
            System.out.print("\n¿Desea realizar otra compra? (si/no): ");
            continuar = entrada.next().equalsIgnoreCase("si");
        }

        entrada.close();
        System.out.println("Programa finalizado.");
    }
    }

    
   

