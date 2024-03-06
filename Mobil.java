public class Mobil {
    String nama;
    int cc, hargaBeli, thnProduksi;

    Mobil(String nm, int c, int hrg, int thn) {
        nama = nm;
        cc = c;
        hargaBeli = hrg;
        thnProduksi = thn;
    }
    
    double hitungPajak() {
        double x = 0;
        if (cc > 1500) {
            x = hargaBeli * 0.1;
        } else {
            x = hargaBeli * 0.075;
        }
        return x;
    }

    double hitungBiayaPerawatan() {
        double x = 0;
        if (thnProduksi < 2010) {
            x = hargaBeli * 0.08;
        } else if(thnProduksi > 2010) {
            x = hargaBeli * 0.05;
        }
        return x;
    }

    double hitungBiayaTotal() {
        double x = 0;
        x = hitungPajak() + hitungBiayaPerawatan();
        return x;
    }

    void printData() {
        System.out.println("Nama mobil: " + nama);
        System.out.println("CC mobil: " + cc);
        System.out.println("Harga Beli Mobil: " + hargaBeli);
        System.out.println("Tahun Produksi Mobil: " + thnProduksi);
        System.out.println("Pajak Mobil: " + hitungPajak());
        System.out.println("Biaya Perawatan Mobil: " + hitungBiayaPerawatan());
        System.out.println("Total Biaya Mobil: " + hitungBiayaTotal());
        System.out.println();
    }
}