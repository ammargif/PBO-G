import java.util.ArrayList;

public class Auction {
    private ArrayList<Lot> lots;
    
    public Auction() {
        lots = new ArrayList<>();
    }
    
    public void addLot(Lot lot) {
        lots.add(lot);
    }
    
    public Lot getLot(int lotNumber) {
        for (Lot lot : lots) {
            if (lot.getLotNumber() == lotNumber) {
                return lot;
            }
        }
        return null;
    }
    
    public void placeBid(int lotNumber, Person person, double amount) {
        Lot lot = getLot(lotNumber);
        if (lot != null) {
            lot.placeBid(new Bid(person, amount));
            System.out.println("Bid placed: " + amount + " by " + person.getName());
        } else {
            System.out.println("Lot not found.");
        }
    }
    
    public void showAllLots() {
        for (Lot lot : lots) {
            System.out.println("Lot Number: " + lot.getLotNumber() + ", Description: " + lot.getDescription());
        }
    }
}
