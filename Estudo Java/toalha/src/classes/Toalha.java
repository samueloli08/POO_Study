package classes;

import java.awt.*;

public class Toalha {

    private String color;
    private String size;
    private int wetness;

    public Toalha(String color, String size, int wetness) {
        this.color = color;
        this.size = size;
        this.wetness = wetness;
    }

    public void Dry(int amount) {
        this.wetness += amount;
        if (MaxDry(wetness)) {
            System.out.println("Você se secou");
        }
        else {
            System.out.println("Essa toalha não consegue te secar");
        }
    }

    public void WringOut() {
        this.wetness = 0;
    }

    public boolean MaxDry(int wetness) {
        if (this.size == "P" || this.size == "p") {
            if(wetness <= 50) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (this.size == "M" || this.size == "m") {
            if(wetness <= 75) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (this.size == "G" || this.size == "g") {
            if(wetness <= 100) {
                return true;
            }
            else {
                return false;
            }
        }

        return false;
    }

    public void getMaxWetness() {
        if (this.size == "P" || this.size == "p") {
            System.out.println("Sua toalha absorve até 50 de umidade");
        }

        else if (this.size == "M" || this.size == "m") {
            System.out.println("Sua toalha absorve até 75 de umidade");
        }
        else if (this.size == "G" || this.size == "g") {
            System.out.println("Sua toalha absorve até 100 de umidade");
        }
    }

    public void isDry () {
        if (this.wetness == 0) {
            System.out.println("Toalha Seca");
        }
        else {
            System.out.println("Toalha Molhada");
        }
    }

}