package ufc.qxd.src;

public class Mapa {
    private int[] x;
    private int[] y;

    public void PreencherMapa() {
        for (int i = 0; i < this.x.length; i++) {
            x[i] = i;
        }
        for (int i = 0; i < this.y.length; i++) {
            y[i] = i;
        }

    }

}