import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data login untuk Admin dan Mahasiswa
        String adminUsername = "admin";
        String adminPassword = "admin123";
        String mahasiswaUsername = "mahasiswa";
        String mahasiswaPassword = "mahasiswa123";

        System.out.println("===== Sistem Login =====");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Pilih peran (1/2): ");
        int pilihan = input.nextInt();
        input.nextLine(); // Menangani newline

        System.out.print("Masukkan Username: ");
        String username = input.nextLine();
        System.out.print("Masukkan Password: ");
        String password = input.nextLine();

        // Logika login dengan if-else
        if (pilihan == 1) { // Admin
            if (username.equals(adminUsername) && password.equals(adminPassword)) {
                System.out.println("Login berhasil sebagai Admin!");
            } else {
                System.out.println("Username atau Password Admin salah!");
            }
        } else if (pilihan == 2) { // Mahasiswa
            if (username.equals(mahasiswaUsername) && password.equals(mahasiswaPassword)) {
                System.out.println("Login berhasil sebagai Mahasiswa!");
            } else {
                System.out.println("Username atau Password Mahasiswa salah!");
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
