import java.util.Scanner;

public class TarifListrik26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean cekPemakaian;
        double tagihanListrik,pemakaianKwh, harga= 1500, batasKwh=500;

        System.out.print("Masukkan nilai KWH anda: ");
        pemakaianKwh = input.nextDouble();

        tagihanListrik = pemakaianKwh * harga;
        
        cekPemakaian = pemakaianKwh > batasKwh;

        System.out.println("-------------------------------");
        System.out.println("--- CEK TAGIHAN LISTRIK LNP ---");
        System.out.println("-------------------------------");
        System.out.println("Tagihan listrik anda adalah Rp." + tagihanListrik);
        System.out.println("Jumlah pemakain listrik: " + pemakaianKwh);
        System.out.println("Pemakaian listrik anda melebihi 500Kwh: " + cekPemakaian);
    }
    
}
