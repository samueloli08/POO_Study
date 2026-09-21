package ufc.qxd.src;

public class Pokemon {
    private String name;
    private int level;

    public Pokemon(String name) {
        this.name = name;
        this.level = 0;

    }

    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }

    public void imprimirAtributos() {
        System.out.println("Nome: " + name);
        System.out.println("Nível: " + level);
    }
}