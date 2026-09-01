package ufc.qxd.src;
import java.util.Objects;

public class Treinador {
    private String name;
    private int x, y;
    private Pokemon[] pokemons;

    public Treinador(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.pokemons = new Pokemon[6];
    }

    public String getName() {
        return this.name;
    }

    public void Mover(String direction) {
        if (Objects.equals(direction, "North")) {
            this.y++;
        }
        else if (Objects.equals(direction, "South")) {
            this.y--;
        }
        else if (Objects.equals(direction, "West")) {
            this.x++;
        }
        else if (Objects.equals(direction, "East")) {
            this.x--;
        }
    }

    public void listar() {
        System.out.println("Your Pokemons: ");
        for (int i = 0; i < this.pokemons.length; i++) {
            if (pokemons[i] != null) {
                System.out.print (i+1 + ". ");
                this.pokemons[i].imprimirAtributos();
            }
            else {
                System.out.println(i+1 + ". Espaço Vazio");
            }
        }
    }

    public boolean Capturar (Pokemon pokemon) {
        for (int i = 0; i < this.pokemons.length; i++) {
            if (this.pokemons[i] == null) {
                this.pokemons[i] = pokemon;
                System.out.println("Você Capturou");
                return true;
            }
        }
        System.out.println("Sua mochila está cheia, o Pokemon fugiu!!");
        return false;
    }
}