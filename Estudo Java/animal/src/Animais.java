
public class Animais {
    private String species;
    private int age;
    private String sound;

    public Animais(String species, int age, String sound) {
        this.species = species;
        this.age = age;
        this.sound = sound;
    }

    public String toString () {
        return "Animal (" + this.species +  ", " + age + " anos, som:" + sound + ")";
    }

    public void ageBy () {
        this.age++;
        if (this.age >= 4) {
            System.out.println("ESSE ANIMAL MORREU");
        }
    }

    public void makeSound () {
        if (this.age < 1) {
            System.out.println("--");
        }
        else if (this.age > 3) {
            System.out.println("RIP");
        }
        else {
            System.out.println(this.sound);
        }
    }
}