import java.util.Scanner;

public class Siakad26 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String nama, nim, kelas;
       //char kelas;
       byte absen;
       double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS;


       //Data Mahasiswa
       System.out.print("Masukkan nama: ");
       nama = sc.nextLine();
       System.out.print("Masukkan NIM: ");
       nim = sc.nextLine();
       System.out.print("Masukkan kelas: ");
       kelas = sc.nextLine()/*.charAt(0) */;
       System.out.print("Masukkan nomor absen: ");
       absen = sc.nextByte();

       //Nilai
       System.out.print("Masukkan nilai kuis: ");
       nilaiKuis = sc.nextDouble();
       System.out.print("Masukkan nilai tugas: ");
       nilaiTugas = sc.nextDouble();
       System.out.print("Masukkan nilai ujian: ");
       nilaiUTS = sc.nextDouble();
       System.out.print("Masukkan nilai ujian: ");
       nilaiUAS = sc.nextDouble();
       
       double nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUTS * 0.3) + (nilaiUAS * 0.35);

       System.out.printf("Mahasiswa dengan nama %s " + "(NIM: %s) ", nama, nim);
       System.out.printf("kelas %s" + " nomor absen %s\n", kelas, absen);
       System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}