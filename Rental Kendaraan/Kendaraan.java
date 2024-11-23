class Kendaraan {
    protected String nama;
    protected String jenis;
    protected String model;
    protected int hargaSewa;

    public Kendaraan(String nama, String jenis, String model, int hargaSewa) {
        this.nama = nama;
        this.jenis = jenis;
        this.model = model;
        this.hargaSewa = hargaSewa;
    }

    public String info() {
        return nama + " (" + jenis + ", Model: " + model + ") - Harga Sewa: Rp" + hargaSewa + "/hari";
    }
}