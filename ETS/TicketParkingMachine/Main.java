public class Main {
    public static void main(String[] args) {
        // Membuat mesin tiket dengan harga tiket per jam Rp5.000
        ParkingTicketMachine mesin = new ParkingTicketMachine(5000);

        // Memasukkan uang
        mesin.insertMoney(10000);  // Memasukkan Rp10.000,00

        // Mengeluarkan tiket
        mesin.issueTicket();  // Seharusnya berhasil membeli tiket untuk 2 jam

        // Mendapatkan waktu parkir yang telah dibeli
        System.out.println("Waktu parkir yang dibeli: " + mesin.getTimePurchase() + " jam");

        // Menampilkan saldo yang tersisa
        System.out.println("Sisa saldo: Rp" + mesin.getBalance() + ",00");
    }
}
