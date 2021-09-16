package com.example.projeto.questao4;

public class Caixa {
    double valor;
    public double calculaValorFinal(double preco, int produto, int quantidade) {
        switch (produto){
            case 1:
                valor = preco* 0.95*quantidade;
                break;
            case 2:
                valor = preco * 0.88*quantidade;
                break;
            case 3:
                if(quantidade > 5){
                    valor = preco* 0.93*quantidade;
                }
                break;
        }
        return valor;
    }

}
