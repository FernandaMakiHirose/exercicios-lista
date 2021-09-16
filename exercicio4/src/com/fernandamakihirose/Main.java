package com.fernandamakihirose;

import com.fernandamakihirose.domain.Caixa;
import com.fernandamakihirose.domain.Produto;

public class Main {

    public static void main(String[] args) {
        Caixa caixa = new Caixa();

        Produto produto1 = new Produto();
        produto1.setNome("Banana");
        produto1.setValor(0.99);
        produto1.setTipo(2);

        Produto produto2 = new Produto();
        produto2.setNome("Energético");
        produto2.setValor(5.49);
        produto2.setTipo(3);

        Produto produto3 = new Produto();
        produto3.setNome("Arroz");
        produto3.setValor(20.00);
        produto3.setTipo(1);

        Produto produto4 = new Produto();
        produto4.setNome("Chocolate");
        produto4.setValor(4.50);
        produto4.setTipo(1);

        Produto produto5 = new Produto();
        produto5.setNome("Leite");
        produto5.setValor(3.73);
        produto5.setTipo(3);

        Produto produto6 = new Produto();
        produto6.setNome("Abacaxi");
        produto6.setValor(2.40);
        produto6.setTipo(2);

        System.out.println(produto1.getNome() + " - " + caixa.calculaValorFinal(produto1, 3));
        System.out.println(produto2.getNome() + " - " + caixa.calculaValorFinal(produto2, 7));
        System.out.println(produto3.getNome() + " - " + caixa.calculaValorFinal(produto3, 1));
        System.out.println(produto4.getNome() + " - " + caixa.calculaValorFinal(produto4, 20));
        System.out.println(produto5.getNome() + " - " + caixa.calculaValorFinal(produto5, 3));
        System.out.println(produto6.getNome() + " - " + caixa.calculaValorFinal(produto6, 4));
    }
}

