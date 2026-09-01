package ufc.qxd.src;

public class Pokemon {
    private String name;
    private Double height;
    private Double weight;
    private Double hp;
    private String type;

    public Pokemon(String name, Double height, Double weight, Double hp, String type) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hp = hp;
        this.type = type;
    }

    public void imprimirAtributos() {
        System.out.println("Nome: " + name);
        System.out.println("Altura: " + height);
        System.out.println("Peso: " + weight);
        System.out.println("Vida: " + hp);
        System.out.println("Tipo: " + type);
    }
}