package com.example.projeto;

import java.util.Scanner;

public class Questao1 {
    public static void main (String [] args) {
        System.out.println("Digite a quantidade de calorias: ");
        Scanner input=new Scanner(System.in);
        int limite;
        int qtdCalorias = 0;
        String nome = "";
        limite = input.nextInt();
        while(nome != "sair") {
            System.out.println("------Alimentos consumidos ------ ");
            System.out.println("Nome do alimento: ");
            Scanner sc = new Scanner(System.in);
            nome = sc.nextLine();
            if (nome != "sair") {


            System.out.println("Quantidade de calorias: ");
            Scanner input2 = new Scanner(System.in);
            int caloria;
            caloria = input.nextInt();
            qtdCalorias = qtdCalorias +caloria;
            System.out.println(nome);
            nome = "";
            System.out.println(nome);
        }
        if(limite > qtdCalorias ){
            System.out.println("Você consumiu "+qtdCalorias+" e ficou abaixo da média");
        }
        if(limite == qtdCalorias ){
            System.out.println("Você consumiu "+qtdCalorias+" e ficou dentro da média");
        }
        if(limite < qtdCalorias ){
            System.out.println("Você consumiu "+qtdCalorias+" e ficou acima da média");
        }}

    }
}
