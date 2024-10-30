public class Main {
    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();
        order.addMenuItem("Nasi Goreng", 20000);
        order.addMenuItem("Ayam Bakar", 25000);
        order.addMenuItem("Es Teh Manis", 5000);
        
        order.showOrder();
        
        order.markAsPaid();
        System.out.println("Status Pembayaran setelah update: " + (order.isPaid() ? "Sudah Dibayar" : "Belum Dibayar"));
    }
}