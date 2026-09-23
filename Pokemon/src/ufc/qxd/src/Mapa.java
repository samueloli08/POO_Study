package ufc.qxd.src;

import java.util.Random;

public class Mapa {
    String[][] layout;
    private final int largura;
    private final int altura;

    public Mapa (int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
        this.layout = new String[altura][largura];
        inicializarMapa(altura, largura);
    }

    private void inicializarMapa (int altura, int largura) {
        Random random = new Random();
        for(int i = 0; i < largura; i++) {
            for(int j = 0; j < altura; j++) {
                if (random.nextDouble() <= 0.20) {
                this.layout[i][j] = "W ";
                }
                else {
                    this.layout[i][j] = "  ";
                }
            }
        }
    }

    public void exibirMapa (Treinador treinador) {
        for(int i = 0; i < largura; i++) {
            for(int j = 0; j < altura; j++) {
                if (i == treinador.getY() && j == treinador.getX()) {
                    System.out.print("T ");
                }
                else {
                    System.out.print(this.layout[i][j]);
                }
            }
        System.out.println();
        }
    }

    public boolean posicaoValida(int x, int y) {
        return x >= 0 && x < largura && y >= 0 && y < altura;
    }
}