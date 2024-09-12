import java.util.Scanner;

public class GajiBulanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jamKerja ;
        float gajiSetelahBonus, gajiSetelahPajak, upah = 12000.0f, gajiKaryawan, gajiHarian;
        float pajak = 5/100f, bonus = 10/100f;
        System.out.println("Masukkan Jumlah Jam Kerja anda: ");
        jamKerja = input.nextInt();

        gajiHarian = jamKerja * upah;
        gajiKaryawan = gajiHarian * 30;
        gajiSetelahBonus = gajiKaryawan + (gajiKaryawan*bonus);
        gajiSetelahPajak = gajiSetelahBonus - (pajak*gajiSetelahBonus);

        System.out.println("Gaji Karyawan per bulan: " + gajiKaryawan);
        System.out.println("Gaji Karyawan setelah mendapatkan Bonus: " + gajiSetelahBonus);
        System.out.println("Gaji karyawan setelah terkena pajak 5%: " + gajiSetelahPajak);

    }
    
}
