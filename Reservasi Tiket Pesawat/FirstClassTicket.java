public class FirstClassTicket extends Ticket {

    public FirstClassTicket(String passengerName, String destination, double baseFare) {
        super(passengerName, destination, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 1.5; // Tambahan 50%
    }

    @Override
    public String getClassType() {
        return "First Class";
    }

    @Override
    public String getFacilities() {
        return "Fasilitas: Kursi premium, 2 bagasi 50kg, makanan lengkap, layanan prioritas";
    }
}
