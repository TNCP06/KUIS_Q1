import java.util.Scanner;

public class MobilMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Banyak koleksi mobil: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Mobil[] mbl = new Mobil[n];
        
        for (int i = 0; i < mbl.length; i++) {
            System.out.print("Nama mobil: ");
            String nama = sc.nextLine();
            System.out.print("CC mobil: ");
            int cc = sc.nextInt();
            System.out.print("Harga Beli: ");
            int hargaBeli = sc.nextInt();
            System.out.print("Tahun Produksi: ");
            int thnProduksi = sc.nextInt();
            sc.nextLine();
            System.out.println();
            
            mbl[i] = new Mobil(nama, cc, hargaBeli, thnProduksi);
        }

        double avgBiayaPerawatan = 0;
        double maxBiayaTotal = 0;
        int x = 0;
        for (int i = 0; i < mbl.length; i++) {
            if (mbl[i].thnProduksi > 2010) {
                avgBiayaPerawatan += mbl[i].hitungBiayaPerawatan();
                x++;
            } else if (mbl[i].cc > 1500 && mbl[i].thnProduksi < 2010) {
                if (maxBiayaTotal < mbl[i].hitungBiayaTotal()) {
                    maxBiayaTotal += mbl[i].hitungBiayaTotal();
                }
            }
        }
        avgBiayaPerawatan = avgBiayaPerawatan/x;
        
        for (int i = 0; i < mbl.length; i++) {
            mbl[i].printData();
        }

        System.out.println("Rata-rata Biaya Perawatan Mobil Tahun 2010 ke-atas: " + avgBiayaPerawatan);
        System.out.println("Biaya Mobil Terbesar untuk CC > 1500 & Tahun Produksi 2010 ke-bawah: " + maxBiayaTotal);

        sc.close();
    }
}