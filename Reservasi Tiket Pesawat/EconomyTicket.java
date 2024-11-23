public class EconomyTicket extends Ticket {

    public EconomyTicket(String passengerName, String destination, double baseFare) {
        super(passengerName, destination, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 0.9; // Diskon 10%
    }

    @Override
    public String getClassType() {
        return "Ekonomi";
    }

    @Override
    public String getFacilities() {
        return "Fasilitas: Kursi standar, 1 bagasi 20kg";
    }
}
