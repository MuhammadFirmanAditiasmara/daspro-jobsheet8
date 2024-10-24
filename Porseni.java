
import java.util.Scanner;

public class Porseni {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaCabor, namaPoliteknik;
        int N;

        System.out.println("Selamat Datang di Porseni Politeknik Negeri Malang Tahun 2024");
        System.out.println("=============================================================");
        System.out.print("Masukkan Nama Politeknik : ");
        namaPoliteknik = sc.nextLine();

        System.out.print("Masukkan banyak cabor yang diikuti = ");
        N = sc.nextInt();

        int j = 1;
        sc.nextLine();
        for (int i = 1; i <= N; i++) {
            System.out.print("Masukkan Jenis Cabang Olahraga ke-" + i + " = ");
            namaCabor = sc.nextLine();

            if (namaCabor.equalsIgnoreCase("voli")
                    || namaCabor.equalsIgnoreCase("badminton")
                    || namaCabor.equalsIgnoreCase("tenis meja")
                    || namaCabor.equalsIgnoreCase("basket")) {

                for (j = 1; j <= 5; j++) {
                    System.out.print("Masukkan nama atlet ke-" + j + " = ");
                    String namaAtlet = sc.nextLine();
                }
            } else {
                System.out.println("Jenis cabang olahraga yang anda masukkan salah");
                i--;
            }

            System.out.println();

        }
        System.out.println("=============================================================");
        System.out.println("Selamat! semua nama atlet telah berhasil ditambahkan");

    }
}
