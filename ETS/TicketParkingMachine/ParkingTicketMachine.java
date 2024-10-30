public class ParkingTicketMachine {
    private int balance;      // jumlah uang yang dimasukkan
    private int ticketPrice;  // harga tiket per jam
    private int ticketTime;   // jumlah waktu parkir yang dibeli dalam jam

    // Konstruktor untuk mengatur harga tiket per jam
    public ParkingTicketMachine(int ticketPrice) {
        this.balance = 0;
        this.ticketPrice = ticketPrice;
        this.ticketTime = 0;
    }

    // Menambah saldo yang dimasukkan pengguna
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Uang sebesar Rp" + amount + ",00 berhasil dimasukkan.");
        } else {
            System.out.println("Jumlah uang harus positif.");
        }
    }

    // Mengeluarkan tiket parkir dan menghitung waktu parkir yang bisa dibeli
    public void issueTicket() {
        if (balance >= ticketPrice) {
            ticketTime = balance / ticketPrice;
            balance %= ticketPrice;  // Menyimpan sisa saldo yang tidak cukup untuk 1 jam lagi
            System.out.println("Tiket parkir berhasil dikeluarkan untuk " + ticketTime + " jam.");
        } else {
            System.out.println("Saldo tidak cukup untuk mengeluarkan tiket.");
        }
    }

    // Mendapatkan jumlah waktu parkir yang telah dibeli
    public int getTimePurchase() {
        return ticketTime;
    }

    // Mendapatkan saldo yang tersisa setelah pembelian tiket
    public int getBalance() {
        return balance;
    }
}
