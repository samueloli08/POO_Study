package classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color;
        String size;
        Double wetness;

        System.out.println("Sua Toalha Atributos - DIGITE A COR");
        color = sc.nextLine();

        System.out.println("Sua Toalha Atributos - DIGITE O TAMANHO (P, M ou G)");
        size = sc.nextLine();

        Toalha toalha = new Toalha(color, size, 0);

        while(true) {
            System.out.println("Escolha o que fazer com sua Toalha - Digite o Número da Ação");
            System.out.println("[1] - Usa-lá pra se Secar");
            System.out.println("[2] - Torce-lá");
            System.out.println("[3] - Ver o Maximo de Água que ela Absorve");
            System.out.println("[4] - Ver se está Seca ou Molhada");

            int acao = sc.nextInt();

            if (acao == 1) {
                System.out.println("Usar toalha pra se secar digite sua Umidade atual");
                int amount = sc.nextInt();
                toalha.Dry(amount);
            }
            else if (acao == 2) {
                toalha.WringOut();
                System.out.println("Toalha Torcida");
            }
            else if (acao == 3) {
                toalha.getMaxWetness();
            }
            else if (acao == 4) {
                toalha.isDry();
            }
            else {
                System.out.println("Comando Inválido");
            }
        }
    }
}