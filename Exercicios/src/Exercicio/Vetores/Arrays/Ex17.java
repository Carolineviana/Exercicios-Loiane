package Exercicio.Vetores.Arrays;

import java.util.Scanner;

/**
 * Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
 * Escreva um programa que determine e escreva
 * a quantidade de pessoas que possuem idade superior a 35 anos.
 */

public class Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];

        for (int i=0; i<idades.length; i++){
            System.out.println("Entre com a idade da pessoa: " + (i+1));
            idades[i] = scan.nextInt();
        }

        int qtd = 0;
        for (int i=0; i<idades.length; i++) {
            if (idades[i] > 35) {
                qtd++;
            }
        }
        System.out.print("Vetor de idades = ");
        for (int i=0; i<idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();

        System.out.print("Qtd pessoas idade > 35: " + qtd);
    }
}
