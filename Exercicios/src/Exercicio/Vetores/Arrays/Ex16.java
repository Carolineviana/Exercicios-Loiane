package Exercicio.Vetores.Arrays;

import java.util.Scanner;

/**
 * Criar um vetor A com 10 elementos inteiros.
 * Escrever um programa que calcule e escreva:
 * a) a soma de elementos armazenados neste vetor que são inferiores a 15;
 * b) a quantidade de elementos armazenados no vetor que são iguais a 15;
 * c) a média dos elementos armazenados no vetor que são superiores a 15.
 */

public class Ex16 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
        }

        int somaMenor15 = 0;
        int somaMaior15 =0;
        int qtdMaior15 = 0;
        int igual15 = 0;
        for (int i=0; i<vetorA.length; i++) {
            if (vetorA[i] == 15) {
                igual15++;
            } else if (vetorA[i] < 15) {
                somaMenor15 += vetorA[i];
            } else {
                qtdMaior15++;
                somaMaior15 += vetorA[i];
            }
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("a) Soma números < 15: " + somaMenor15);
        System.out.println("b) Qtd números == 15: " + igual15);
        System.out.println("c) Média números > 15: " + (somaMaior15/qtdMaior15));
    }
}
