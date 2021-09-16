package com.example.projeto;

import java.util.Scanner;

public class Questao3 {
    public static void main (String [] args) {
        int[] numero = new int[5];
        int maior = -99999999;
        int menor = 999999999;
        int soma = 0;
        for(int i =0; i<5;i++){
            System.out.println("Digite um número: ");
            Scanner input = new Scanner(System.in);
            numero[i] = input.nextInt();
        }
        for(int j = 0; j<5;j++){
            if (numero[j] >= 10) {
                System.out.println(numero[j]+" é maior ou igual a 10");
            }
            else {
                System.out.println(numero[j]+" é menor que 10");
            }
            if(numero[j] > maior){
                maior = numero[j];
            }
            if(numero[j] < menor){
                menor = numero[j];
            }
            soma += numero[j];

        }
        System.out.println("O maior número é "+maior+ " e o menor é "+menor);
        System.out.println("A soma é "+ soma);

    }
}




