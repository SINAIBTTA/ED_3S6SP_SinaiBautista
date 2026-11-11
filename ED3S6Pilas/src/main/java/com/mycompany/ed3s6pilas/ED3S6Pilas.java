package com.mycompany.ed3s6pilas;

import java.util.Scanner;

public class ED3S6Pilas<T> {

    private Object[] Pila;
    private int tamax;
    private int indice; 

    public ED3S6Pilas(int tamax) {
        this.tamax = tamax;
        this.Pila = new Object[this.tamax];
        this.indice = 0;
    }

    private boolean verificaLleno() {
        if (indice > tamax - 1) {
            System.out.println("\n Pila llena");
            return true;
        }
        return false;
    }

    private boolean verificaVacio() {
        if (indice <= 0) {
            System.out.println("\n Pila vacía");
            return true;
        }
        return false;
    }

    public void push(T valor) {
        if (verificaLleno()) {
            return; 
        }
        Pila[indice] = valor;
        indice++;
        System.out.println("Elemento insercion exitosa.");
    }
    
    public T pop() {
        if (verificaVacio()) {
            return null;
        }

        indice--; 
        T valor = (T) Pila[indice];
        Pila[indice] = null; 
        System.out.println("Elemento eliminado: " + valor);
        return valor;
    }
    
    public void listar() {
        if (verificaVacio()) {
            return;
        }

        System.out.println("Contenido pila: ");
        for (int i = indice-1; i >= 0; i--) {
            System.out.println(Pila[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ED3S6Pilas<String> pila = new ED3S6Pilas<>(5); 
        int opcion = 0;

        do {
            System.out.println("\n--- MENU PILA ---");
            System.out.println("1. Insertar ");
            System.out.println("2. Eliminar " + "");
            System.out.println("3. Listar");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa el valor a insertar: ");
                        String valor = scanner.nextLine();
                        pila.push(valor);
                        break;
                    case 2:
                        pila.pop();
                        break;
                    case 3:
                        pila.listar();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción invalida. Intenta de nuevo.");
                }
            } else {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next(); 
            }
        } while (opcion != 4);

        scanner.close();
    }
}