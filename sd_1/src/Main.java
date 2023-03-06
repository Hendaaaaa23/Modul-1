import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<konsumsi> Listkonsumsi = new ArrayList<>();
        konsumsi<makanan, minuman> breakfest = new konsumsi<>();
        konsumsi<makanan, minuman> lunch = new konsumsi<>();

        makanan roti = new makanan();
        roti.setNamahidangan("Roti Tawar");
        minuman susu = new minuman();
        susu.setNamahidangan("susu sapi");
        breakfest.setkonsumsi(roti, susu);
        Listkonsumsi.add(breakfest);

        makanan nasi = new makanan();
        nasi.setNamahidangan("Nasi putih");
        minuman air = new minuman();
        air.setNamahidangan("Air putih");
        lunch.setkonsumsi(nasi, air);
        Listkonsumsi.add(lunch);

        System.out.println("menu konsumsi");
        for(konsumsi<makanan,minuman> konsumsi : Listkonsumsi){
            makanan Makanan = konsumsi.getM();
            minuman Minuman = konsumsi.getI();

            System.out.println(Minuman.disantap());
            System.out.println(Makanan.disantap());
        }
    }
}
