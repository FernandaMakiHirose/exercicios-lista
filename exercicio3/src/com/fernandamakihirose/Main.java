package com.fernandamakihirose;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> vetor = new ArrayList<Integer>();

        System.out.print("Digite o primeiro número: ");
        try {
            vetor.add(Integer.parseInt(br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Digite o segundo número: ");
        try {
            vetor.add(Integer.parseInt(br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Digite o terceiro número: ");
        try {
            vetor.add(Integer.parseInt(br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Digite o quarto número: ");
        try {
            vetor.add(Integer.parseInt(br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Digite o quinto número: ");
        try {
            vetor.add(Integer.parseInt(br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("O maior número é: " + Collections.max(vetor));
        System.out.println("O menor número é: " + Collections.min(vetor));

        System.out.println("Os números maiores que 10 são: ");
        for (int i = 0; i < vetor.size(); i++) {
            if (vetor.get(i) > 10){
                System.out.println(vetor.get(i));
            }
        }

        System.out.println("Os números menores que 10 são: ");
        for (int i = 0; i < vetor.size(); i++) {
            if (vetor.get(i) < 10){
                System.out.println(vetor.get(i));
            }
        }

        int soma = 0;
        for (int i = 0; i < vetor.size(); i++) {
            soma = soma + vetor.get(i);
        }
        System.out.println("A soma desses números é: " + soma);
    }
}

