package com.example.projeto.questao2;

public class ICMS implements Imposto{

    @Override
    public float calculaImposto(double valor) {
        float total;
        total = (float) (0.24*valor);
        return total;
    }
}
