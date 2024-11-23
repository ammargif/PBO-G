public abstract class Ticket {
    protected String passengerName;
    protected String destination;
    protected double baseFare;

    public Ticket(String passengerName, String destination, double baseFare) {
        this.passengerName = passengerName;
        this.destination = destination;
        this.baseFare = baseFare;
    }

    // Menghitung harga tiket (akan dioverride di subclass)
    public abstract double calculateFare();

    // Mengembalikan jenis kelas tiket
    public abstract String getClassType();

    // Mengembalikan daftar fasilitas
    public abstract String getFacilities();

    // Menampilkan informasi tiket
    public void displayTicketInfo() {
        System.out.println("=== Tiket Pesawat ===");
        System.out.println("Nama Penumpang : " + passengerName);
        System.out.println("Tujuan         : " + destination);
        System.out.println("Kelas          : " + getClassType());
        System.out.println("Harga Tiket    : Rp" + calculateFare());
        System.out.println("Fasilitas      : " + getFacilities());
    }
}
