public class RentalKendaraan {
    public static void main(String[] args) {
        // Membuat objek langsung dari masing-masing kelas anak
        Mobil mobil = new Mobil("Toyota Avanza", "G 2023", 500000, 7);
        Motor motor = new Motor("Yamaha NMAX", "ABS 2022", 150000, "Matic");
        Bus bus = new Bus("Mitsubishi Rosa", "Deluxe 2021", 1000000, 25);

        // Menampilkan informasi kendaraan
        System.out.println("=== Daftar Kendaraan ===");
        System.out.println(mobil.infoMobil());
        System.out.println(motor.infoMotor());
        System.out.println(bus.infoBus());
    }
}