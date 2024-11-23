class Bus extends Kendaraan {
    private int kapasitasPenumpang;

    public Bus(String nama, String model, int hargaSewa, int kapasitasPenumpang) {
        super(nama, "Bus", model, hargaSewa);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String infoBus() {
        return super.info() + ", Kapasitas Penumpang: " + kapasitasPenumpang;
    }
}