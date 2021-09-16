package com.fernandamakihirose;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        int quantidadeCalorias = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite a quantidade de calorias: ");

        try {
            quantidadeCalorias = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("----- Alimentos consumidos -----");

        int totalCalorias = 0;
        String alimentoConsumido = "";

        do {
            try {
                System.out.print("Nome do alimento: ");
                alimentoConsumido = br.readLine();

                System.out.print("Quantidade: ");

                try {
                    totalCalorias = totalCalorias + Integer.parseInt(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (!alimentoConsumido.equals("sair"));

        if (totalCalorias < quantidadeCalorias){
            System.out.print("Você consumiu " + totalCalorias + " calorias e ficou abaixo da meta");
        }
        else{
            System.out.print("Você consumiu " + totalCalorias + " calorias e ficou acima da meta");
        }
    }
}
