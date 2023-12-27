abstract class LivingThing {
    
    public void walk(String Nama){}
    
    public void breath(String nama){
        System.out.println(nama + " bernafas ");
    }
    
    public void eat(String nama){
        System.out.println(nama + " makan ");
    }
    
}

class Human extends LivingThing {

    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void walk(String nama) {
        System.out.println(nama + " sedang berjalan ");
    }
}

public class Main {

	public static void main(String[] args) {
		 Human hm = new Human();
	     hm.setNama("Galih anggoro prasetya");
	     hm.walk(hm.getNama());
	     hm.breath(hm.getNama());
	     hm.eat(hm.getNama());
	}
}
