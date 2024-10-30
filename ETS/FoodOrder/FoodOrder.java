import java.util.ArrayList;

public class FoodOrder {
    private ArrayList<MenuItem> menuItems;
    private double totalPrice;
    private boolean isPaid;

    public FoodOrder() {
        menuItems = new ArrayList<>();
        totalPrice = 0.0;
        isPaid = false;
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
        calculateTotal();
    }

    public void calculateTotal() {
        totalPrice = 0.0;
        for (MenuItem item : menuItems) {
            totalPrice += item.getPrice();
        }
    }

    public void markAsPaid() {
        isPaid = true;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void showOrder() {
        System.out.println("Pesanan:");
        for (MenuItem item : menuItems) {
            System.out.println("- " + item.getName() + ": Rp" + item.getPrice());
        }
        System.out.println("Total Harga: Rp" + totalPrice);
        System.out.println("Status Pembayaran: " + (isPaid ? "Sudah Dibayar" : "Belum Dibayar"));
    }
}
