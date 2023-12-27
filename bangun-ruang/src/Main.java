abstract class BangunRuang {

    public abstract int hitungVolume();

}

class BolaBasket extends BangunRuang {

    private int jari;

    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    @Override
    public int hitungVolume() {
        return (int) Math.round((4.0 / 3.0) * Math.PI * Math.pow(jari, 3));
    }

}

class Tabung extends BangunRuang {

    private int tinggi;
    private int jari;

    public int getTinggi() {
        return tinggi;
    }

    public int getJari() {
        return jari;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    @Override
    public int hitungVolume() {
        return (int) Math.round(Math.PI * Math.pow(jari, 2) * tinggi);
    }

}

class Kerucut extends BangunRuang {

    private int tinggi;
    private int jari;

    public int getTinggi() {
        return tinggi;
    }

    public int getJari() {
        return jari;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    @Override
    public int hitungVolume() {
        return (int) Math.round((1.0 / 3.0) * Math.PI * Math.pow(jari, 2) * tinggi);
    }

}

public class Main {

    public static void main(String[] args) {

        BolaBasket bola = new BolaBasket();
        bola.setJari(7);
        System.out.println("=========HitungBola=========");
        System.out.println("Jari Jari Bola : " + bola.getJari());
        System.out.println("Volume Bola : " + bola.hitungVolume());
        System.out.println("");
        Tabung tabung = new Tabung();
        tabung.setTinggi(21);
        tabung.setJari(10);

        System.out.println("=========HitungTabung==========");
        System.out.println("Tinggi Tabung : " + tabung.getTinggi());
        System.out.println("Jari Jari Tabung : " + tabung.getJari());
        System.out.println("Volume Tabung : " + tabung.hitungVolume());
        System.out.println("");
        Kerucut kerucut = new Kerucut();
        kerucut.setJari(14);
        kerucut.setTinggi(9);
        System.out.println("=========HitungKerucut===========");
        System.out.println("Volume kerucut : " + kerucut.hitungVolume());

    }

}
