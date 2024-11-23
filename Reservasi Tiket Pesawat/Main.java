import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistem Reservasi Tiket Pesawat ===");
        System.out.print("Masukkan nama penumpang: ");
        String passengerName = scanner.nextLine();

        System.out.print("Masukkan tujuan penerbangan: ");
        String destination = scanner.nextLine();

        System.out.print("Masukkan harga dasar tiket: ");
        double baseFare = scanner.nextDouble();

        System.out.println("Pilih kelas tiket:");
        System.out.println("1. Ekonomi");
        System.out.println("2. Bisnis");
        System.out.println("3. First Class");
        System.out.print("Masukkan pilihan: ");
        int classChoice = scanner.nextInt();

        Ticket ticket;
        if (classChoice == 1) {
            ticket = new EconomyTicket(passengerName, destination, baseFare);
        } else if (classChoice == 2) {
            ticket = new BusinessTicket(passengerName, destination, baseFare);
        } else if (classChoice == 3) {
            ticket = new FirstClassTicket(passengerName, destination, baseFare);
        } else {
            System.out.println("Pilihan tidak valid. Menggunakan kelas Ekonomi sebagai default.");
            ticket = new EconomyTicket(passengerName, destination, baseFare);
        }

        System.out.println("\n=== Informasi Tiket Anda ===");
        ticket.displayTicketInfo();
        scanner.close();
    }
}
