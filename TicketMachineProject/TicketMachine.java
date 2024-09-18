public class TicketMachine {
        
    private int price, balance, total;
    
    public TicketMachine(int ticketPrice) {
        price = ticketPrice;
        balance = total = 0;
    }
    
    public int getPrice() {
        return price;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Please insert a positive amount of money.");
        }
    }
    
    public void printTicket() {
        if (balance >= price) {
            // Simulate printing a ticket
            System.out.println("##################");
            System.out.println("# Ticket");
            System.out.println("# Price: " + price + " cents");
            System.out.println("##################");

            total += price;
            balance -= price;
            
        } else {
            System.out.println("You must insert at least: " + (price - balance) + " more cents.");
        }
    }
    
    public int refundBalance() {
        int amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
