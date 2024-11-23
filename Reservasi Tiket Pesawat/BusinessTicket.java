public class BusinessTicket extends Ticket {

    public BusinessTicket(String passengerName, String destination, double baseFare) {
        super(passengerName, destination, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 1.25; // Tambahan 25%
    }

    @Override
    public String getClassType() {
        return "Bisnis";
    }

    @Override
    public String getFacilities() {
        return "Fasilitas: Kursi lebih luas, 2 bagasi 30kg, makanan ringan";
    }
}
