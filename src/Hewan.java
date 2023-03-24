import java.util.ArrayList;

public class Hewan {
    private String warna;
    private ArrayList<String> daftarHewan;

    public Hewan(String warna) {
        this.warna = warna;
        this.daftarHewan = new ArrayList<String>();
        daftarHewan.add("Sapi");
        daftarHewan.add("Kelinci");
        daftarHewan.add("Kambing");
        daftarHewan.add("Unta");
        daftarHewan.add("Domba");
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public ArrayList<String> getDaftarHewan() {
        return daftarHewan;
    }

    public void hapusDaftarHewan() {
        daftarHewan.clear();
    }
}