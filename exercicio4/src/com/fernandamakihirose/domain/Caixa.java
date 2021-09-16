package com.fernandamakihirose.domain;

public class Caixa {
    public double calculaValorFinal(Produto produto, int quantidade){
        double valor = produto.getValor() * quantidade;
        double valorFinal = valor;

        if (produto.getTipo() == 1){
            valorFinal = valor * 0.95;
        }
        else if (produto.getTipo() == 2) {
            valorFinal = valor * 0.88;
        }
        else if (produto.getTipo() == 3) {
            if (quantidade > 5){
                valorFinal = valor * 0.93;
            }
        }

        return valorFinal;
    }
}
