package Exercicio.Vetores.Arrays;

/**
 * Criar dois vetores A com 10 elementos inteiros.
 * Construir um vetor B de mesmo tipo e tamanho,
 * sendo que cada elemento do vetor B deverá ser resto da divisão do respectivo  elemento A por 2 (dois),
 * ou seja: B[i] = A[i] % 2.
 */

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] % 2;
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}
