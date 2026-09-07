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
            this.wetness -= amount;
        }
    }

    public void WringOut() {
        this.wetness = 0;
    }

    public boolean MaxDry(int wetness) {
        if (this.size.equals("P") || this.size.equals("p")) {
            return wetness <= 50;
        }
        else if (this.size.equals("M") || this.size.equals("m")) {
            return wetness <= 75;
        }
        else if (this.size.equals("G") || this.size.equals("g")) {
            return wetness <= 100;
        }

        return false;
    }

    public void getMaxWetness() {
        if (this.size.equals("P") || this.size.equals("p")) {
            System.out.println("Sua toalha absorve até 50 de umidade");
        }

        else if (this.size.equals("M") || this.size.equals("m")) {
            System.out.println("Sua toalha absorve até 75 de umidade");
        }
        else if (this.size.equals("G") || this.size.equals("g")) {
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