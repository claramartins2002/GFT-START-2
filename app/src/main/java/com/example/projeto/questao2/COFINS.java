package com.example.projeto.questao2;

public class COFINS implements Imposto{

    @Override
    public float calculaImposto(double valor) {
        float total;
        if (valor > 12000) {
             total = (float) (0.24*valor);

        } else {
             total = (float) (0);
        }

        return total;
    }
}
