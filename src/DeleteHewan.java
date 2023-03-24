import java.util.ArrayList;

public class DeleteHewan {
    private String warna;

    public DeleteHewan(String warna) {
        this.warna = warna;
    }

    public void hapusHewan(Hewan hewan) {
        ArrayList<String> daftarHewan = hewan.getDaftarHewan();
        ArrayList<String> hewanYangDihapus = new ArrayList<String>();
        for (String h : daftarHewan) {
            if (h.contains(warna)) {
                hewanYangDihapus.add(h);
            }
        }
        daftarHewan.removeAll(hewanYangDihapus);
    }
}
