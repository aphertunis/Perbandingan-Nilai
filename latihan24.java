//Nama      : Nur Riskon Abdan Syakuro
//  NIM       : 23176031
//  Prodi     : Sistem Informasi
//  Deskripsi :   Program ini untuk membandingkan dua buah nilai dari user


import java.util.Scanner;

public class latihan24 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
          String ulangi;

          do {
              System.out.println("=======Program Perbandingan Nilai=======");
              
              System.out.print("Masukkan nilai pertama : ");
              int nilaiPertama = input.nextInt();
              
              System.out.print("Masukkan nilai kedua : ");
              int nilaiKedua = input.nextInt();
              
              if (nilaiPertama > nilaiKedua) {
                  System.out.println("Hasil : " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
              } else if (nilaiPertama < nilaiKedua) {
                  System.out.println("Hasil : " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
              } else {
                  System.out.println("Hasil : " + nilaiPertama + " Sama dengan " + nilaiKedua);
              }

              System.out.print("\nUlangi Aktivitas ? (Ya/Tidak) : ");
              input.nextLine();
              ulangi = input.nextLine();

              System.out.println();
          } while (ulangi.equalsIgnoreCase("Ya"));
        }
        System.out.println("BUILD SUCCESSFUL");
    }
}
