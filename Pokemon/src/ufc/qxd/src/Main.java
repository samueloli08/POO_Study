package ufc.qxd.src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-Vindo ao Pokemon Game");
        System.out.println("Aperte ENTER e inicie a sua Aventura");
        sc.nextLine();

        Pokemon meuPrimeiroPokemon = new Pokemon("Pikachu", 1.1,
                                    0.5, 100.0, "electric");
        Treinador jogador = new Treinador("Ash", 0, 0);
        Mapa mapa = new Mapa();
        mapa.PreencherMapa();

        boolean jogando = true;
        int rodadas = 0;
        while (jogando) {
            rodadas++;
            if (rodadas == 1) {
                System.out.println("Olá Ash!! Você está no mundo de Pokemon - Comece a EXPLORAR");
                System.out.println("Press Enter");
                sc.nextLine();
            }
            else {
                System.out.println("Vamos pra mais Aventuras - Continue a EXPLORAR");
                System.out.println("Press Enter");
                sc.nextLine();
            }

            System.out.println("Você Avistou seu primeiro Pokemon, Chegue perto para ver seus Atributos");
            System.out.println("Press Enter");
            sc.nextLine();
            meuPrimeiroPokemon.imprimirAtributos();

            System.out.println("\nVAMOS, tente captura-lo");
            System.out.println("Press Enter - Jogar Pokebola");
            sc.nextLine();
            jogador.Capturar(meuPrimeiroPokemon);

            System.out.println("Vamos dar uma olhada na sua Mochila");
            System.out.println("Press Enter - Olhar Mochila");
            sc.nextLine();

            jogador.listar();

            System.out.println("Deseja sair do Mundo de Pokemon - [1] SIM - [2] NÃO");
            int acao = sc.nextInt();
            sc.nextLine();
            if(acao==1) {
                jogando = false;
            }
        }
    }
}