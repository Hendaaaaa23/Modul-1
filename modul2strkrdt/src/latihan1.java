import java.util.ArrayList;

public class latihan1 {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("gajah");
        hewan.add("jerapah");
        hewan.add("singa");
        hewan.add("kuda");
        hewan.add("zebra");
        hewan.add("jerapah");

        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("jerapah");
        deleteHewan.add("kucing");

        for (String warna : deleteHewan) {
            hewan.removeIf(h -> h.equalsIgnoreCase(warna));
        }

        System.out.println("Hasil setelah penghapusan:");
        for (String h : hewan) {
            System.out.println(h);
        }
    }
}
