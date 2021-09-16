package com.example.projeto.questao2;

import java.util.Scanner;

public class classeTeste {
    public static void main (String [] args) {
        float valor = 1;
        float total = 0;
        int escolha;
        while (valor != 0) {
            System.out.println("Digite um valor ou 0 para finalizar: ");
            Scanner input = new Scanner(System.in);
            valor = input.nextInt();
            if(valor !=0) {
                System.out.println("Tipo de imposto: 1. Cofins 2. ICMS 3.IPI");
                Scanner input2 = new Scanner(System.in);
                escolha = input2.nextInt();
                switch (escolha) {
                    case 1:
                        COFINS i = new COFINS();
                        total+=i.calculaImposto(valor);
                        System.out.println("Valor: R$ "+i.calculaImposto(valor));
                        break;
                    case 2:
                        ICMS j = new ICMS();
                        total+=j.calculaImposto(valor);
                        System.out.println("Valor: R$ "+j.calculaImposto(valor));
                        break;
                    case 3:
                        ICMS k = new ICMS();
                        total+=k.calculaImposto(valor);
                        System.out.println("Valor: R$ "+k.calculaImposto(valor));
                        break;
                    default:
                        System.out.println("Erro!");
                }

            }
        }
System.out.println("Total: R$ "+total);
    }
}
