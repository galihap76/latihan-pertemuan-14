interface GarisLurus {
	
    public int hitungGradien();
    
}

class Koordinat implements GarisLurus {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Koordinat(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2 ;
    }

    public int getY2() {
        return y2;
    }

    @Override
    public int hitungGradien() {
       return (y2-y1) / (x2-x1);
    }
}

public class Main {

	public static void main(String[] args) {
		    Koordinat kdt1 = new Koordinat(2, 10, 5, 7);
	        Koordinat kdt2 = new Koordinat(5, 1, 3, 12);

	        System.out.println("Garis yang melalui titik (2,10) dan titik (5,7) memiliki gradien sebesar "
	                + kdt1.hitungGradien());
	        System.out.println("Garis yang melalui titik (5,1) dan titik (3,12) memiliki gradien sebesar "
	                + kdt2.hitungGradien());

	}

}
