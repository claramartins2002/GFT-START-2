package com.example.projeto.questao4;

public class classeTeste {
    public static void main (String [] args) {
        Produto p1 = new Produto();
        p1.nome = "banana";
        p1.valor = 0.99f;
        p1.tipo = 2;
        Produto p2 = new Produto();
        p2.nome = "Eneergético";
        p2.valor = 5.49;
        p2.tipo = 3;
        Produto p3 = new Produto();
        p3.nome = "arroz";
        p3.valor = 20.00;
        p3.tipo = 1;
        Produto p4 = new Produto();
        p4.nome = "chocolate";
        p4.valor = 4.50;
        p4.tipo = 1;
        Produto p5 = new Produto();
        p5.nome = "leite";
        p5.valor = 3.73;
        p5.tipo = 3;
        Produto p6 = new Produto();
        p6.nome = "abacaxi";
        p6.valor = 2.40;
        p6.tipo = 2;

        Caixa c1 = new Caixa();
        System.out.println("Preço banana: R$ "+c1.calculaValorFinal(0.99, 2, 3));
        System.out.println("Preço energético: R$ "+c1.calculaValorFinal(5.49,3, 7));
        System.out.println("Preço arroz: R$ "+c1.calculaValorFinal(20,1, 1));
        System.out.println("Preço chocolate: R$ "+c1.calculaValorFinal(4.50,1, 20));
        System.out.println("Preço leite: R$ "+c1.calculaValorFinal(3.73,3, 3));
        System.out.println("Preço abacaxi: R$ "+c1.calculaValorFinal(2.40,2, 4));





    }
}
