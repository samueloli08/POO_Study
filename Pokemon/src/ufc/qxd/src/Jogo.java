package ufc.qxd.src;
import java.util.Scanner;

public class Jogo {
    Scanner sc = new Scanner(System.in);

    private Mapa mapa;
    private Treinador treinador;

    public Jogo (String nomeTreinador) {
        this.treinador = new Treinador(nomeTreinador, 0, 0);
        this.mapa = new Mapa (10, 10);
    }

    public void iniciar() {
        while (true) {
            mapa.exibirMapa(treinador);

            System.out.println("Digite Direção");


            int xPreMove = treinador.getX();
            int yPreMove = treinador.getY();

            treinador.mover(sc.nextLine());
            if (!mapa.posiçãoValida(treinador.getX(), treinador.getY())) {
                System.out.println("Movimento Inválido");
                treinador.setPosition(xPreMove, yPreMove);
            }
        }
    }
}
