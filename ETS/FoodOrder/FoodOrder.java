import java.util.ArrayList;

public class FoodOrder {
    private ArrayList<String> menuItems;
    private ArrayList<Double> itemPrices;
    private double totalPrice;
    private boolean isPaid;

    public FoodOrder() {
        menuItems = new ArrayList<>();
        itemPrices = new ArrayList<>();
        totalPrice = 0.0;
        isPaid = false;
    }

    public void addMenuItem(String item, double price) {
        menuItems.add(item);
        itemPrices.add(price);
        calculateTotal();
    }

    public void calculateTotal() {
        totalPrice = 0.0;
        for (double price : itemPrices) {
            totalPrice += price;
        }
    }

    public void markAsPaid() {
        isPaid = true;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public ArrayList<String> getMenuItems() {
        return menuItems;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void showOrder() {
        System.out.println("Pesanan:");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println("- " + menuItems.get(i) + ": Rp" + itemPrices.get(i));
        }
        System.out.println("Total Harga: Rp" + totalPrice);
        System.out.println("Status Pembayaran: " + (isPaid ? "Sudah Dibayar" : "Belum Dibayar"));
    }
}
