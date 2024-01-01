import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class tiketKereta {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Registrasi pengguna
        int lanjut = 0;
        do {
            System.out.println();
            System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
            System.out.println("Selamat Datang Di Tiketkereta.com");
            System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
            System.out.println();
            System.out.println();
            tiket tiketss = new tiket();
            listTiket listtiket = new listTiket();
            System.out.println();
            tiketss.daftarUser();
            System.out.println();
            tiketss.DaftarTiket();
            System.out.println();
            tiketss.pesanTiket();

            System.out.println("Ingin lanjut pesan? (ya=1/tidak=2)");
            lanjut = scan.nextInt();
        } while (lanjut == 1);
        System.out.println("TERIMAKASIH SAMPAI JUMPA");

    }
}
