import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name;
        String gender;
        String jenisKelamin = "Tidak diketahui"; // Inisialisasi default
        int tahunSekarang = LocalDateTime.now().getYear();
        int tahunLahir;
        int umur;

        System.out.print("Masukkan nama: ");
        name = input.nextLine();
        System.out.print("Masukkan jenis kelamin (L/P): ");
        gender = input.nextLine().trim().toUpperCase(); // Menghilangkan spasi & uppercase
        System.out.print("Masukkan tahun lahir: ");
        tahunLahir = input.nextInt();

        // Perhitungan umur
        umur = tahunSekarang - tahunLahir;

        switch (gender){
            case "L":
                jenisKelamin = "Laki-laki";
                break;

            case "P":
                jenisKelamin = "Perempuan";
                break;

            default:
                System.out.println("Jenis kelamin tidak diketahui.");
        }

        System.out.println("\n===== Data Diri =====");
        System.out.println("Nama         : " + name);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur         : " + umur + " tahun");

        input.close(); // Menutup Scanner
    }
}
