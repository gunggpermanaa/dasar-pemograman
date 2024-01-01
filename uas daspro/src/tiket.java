import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class tiket {
    Scanner input = new Scanner(System.in);
    private HashMap<Integer, user> users = new HashMap<>();
    String nama;
    String email;
    int kode = 0;

    public void daftarUser() {
        kode++;
        System.out.println("==================Daftar User===============");
        System.out.println("masukan nama anda");
        nama = input.nextLine();
        System.out.println("Masukan Email Anda");
        email = input.nextLine();

        user User = new user();
        User.setUser(nama);
        User.setEmail(email);

        users.put(kode, User);
    }

    HashMap<Integer, listTiket> tikets = new HashMap<>();
    ArrayList<listTiket> tiketlist = new ArrayList<>();
    HashMap<Integer, struk> struks = new HashMap<>();

    public void DaftarTiket() {
        listTiket listtiket1 = new listTiket();
        listTiket listtiket2 = new listTiket();
        listTiket listtiket3 = new listTiket();

        listtiket1.setKey(1).SetTujuan("Jakarta").SetHarga(100000);
        listtiket2.setKey(2).SetTujuan("Yogyakarta").SetHarga(200000);
        listtiket3.setKey(3).SetTujuan("Surabaya").SetHarga(300000);

        tikets.put(listtiket1.getKey(), listtiket1);
        tikets.put(listtiket2.getKey(), listtiket2);
        tikets.put(listtiket3.getKey(), listtiket3);
    }

    public void pesanTiket() {
        int kunci = 0;
        System.out.println("============Menu Pesan Tiket============");
        System.out.println("Kota Asal");
        String asals = input.nextLine();
        System.out.println("Mau Pesan Tiket Apa (jakarta=1,yogyakarta=2,surabaya=3)");
        int tujuans = input.nextInt();
        System.out.println("Mau pesan berapa tiket");
        int jumlah = input.nextInt();

        if (tujuans == 1) {
            kunci++;
            System.out.println("============STRUK ANDA============");
            System.out.println("Tiket yang di pesan : " + tikets.get(tujuans).GetTujuan());
            System.out.println("Asal :" + asals);
            System.out.println("Total Harga yang harus di bayar : " + tikets.get(tujuans).GetHarga() * jumlah);

            struk Struk = new struk();
            Struk.setIdstruk(kunci);
            Struk.setAsal(asals);
            Struk.setTujuan(tikets.get(tujuans).GetTujuan());
            Struk.setHarga(tikets.get(tujuans).GetHarga());
            Struk.setTotal(tikets.get(tujuans).GetHarga() * jumlah);

            struks.put(tikets.get(tujuans).getKey(), Struk);
        } else if (tujuans == 2) {
            System.out.println("============STRUK ANDA============");
            System.out.println("Tiket yang di pesan : " + tikets.get(tujuans).GetTujuan());
            System.out.println("Asal :" + asals);
            System.out.println("Total Harga yang harus di bayar : " + tikets.get(tujuans).GetHarga() * jumlah);

            struk Struk = new struk();
            user User = new user();
            Struk.setIdstruk(kunci);
            Struk.setAsal(asals);
            Struk.setTujuan(tikets.get(tujuans).GetTujuan());
            Struk.setHarga(tikets.get(tujuans).GetHarga());
            Struk.setTotal(tikets.get(tujuans).GetHarga() * jumlah);

            struks.put(tikets.get(tujuans).getKey(), Struk);
        } else if (tujuans == 3) {
            System.out.println();
            System.out.println("============STRUK ANDA============");
            System.out.println("Tiket yang di pesan : " + tikets.get(tujuans).GetTujuan());
            System.out.println("Asal :" + asals);
            System.out.println("Total Harga yang harus di bayar : " + tikets.get(tujuans).GetHarga() * jumlah);
            System.out.println();

            struk Struk = new struk();
            user User = new user();
            Struk.setIdstruk(kunci);
            Struk.setAsal(asals);
            Struk.setTujuan(tikets.get(tujuans).GetTujuan());
            Struk.setHarga(tikets.get(tujuans).GetHarga());
            Struk.setTotal(tikets.get(tujuans).GetHarga() * jumlah);

            struks.put(tikets.get(tujuans).getKey(), Struk);
        }
    }

}
