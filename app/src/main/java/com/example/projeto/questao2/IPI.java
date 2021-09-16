package com.example.projeto.questao2;

public class IPI implements Imposto {
    @Override
    public float calculaImposto(double valor) {
        float total;


        if (valor < 20000) {
            total = (float) (0.05*valor);
        }
        else{
            total = (float) (0.11*valor);
        }
        return total;
    }
}
