package main.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {


    public static void fila(Scanner scanner) {
        int n = scanner.nextInt();
        scanner.nextLine();

        Queue<String> fila = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String nome = scanner.nextLine();
            fila.add(nome);
        }

        System.out.print("Inicio->");

        for (int i = 0; i < n; i++) {
            System.out.print(fila.poll());
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }

    public static void lista(Scanner scanner) {
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Lista Preenchida: ");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] > 0) {
                System.out.print(numeros[i] + " ");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        //não modifique o método main
        Scanner scanner = new Scanner(System.in);
        fila(scanner);
        lista(scanner);
        scanner.close();
    }
}
