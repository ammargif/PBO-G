import java.util.ArrayList;

public class Lot {
    private int lotNumber;
    private String description;
    private Bid highestBid;
    private ArrayList<Bid> bids;
    
    public Lot(int lotNumber, String description) {
        this.lotNumber = lotNumber;
        this.description = description;
        this.bids = new ArrayList<>();
    }
    
    public int getLotNumber() {
        return lotNumber;
    }
    
    public String getDescription() {
        return description;
    }
    
    public Bid getHighestBid() {
        return highestBid;
    }
    
    public void placeBid(Bid bid) {
        bids.add(bid);
        if (highestBid == null || bid.getAmount() > highestBid.getAmount()) {
            highestBid = bid;
        }
    }
    
    public void showBids() {
        for (Bid bid : bids) {
            System.out.println("Bidder: " + bid.getBidder().getName() + " Amount: " + bid.getAmount());
        }
    }
}
