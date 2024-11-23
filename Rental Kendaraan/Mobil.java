class Mobil extends Kendaraan {
    private int kapasitasPenumpang;

    public Mobil(String nama, String model, int hargaSewa, int kapasitasPenumpang) {
        super(nama, "Mobil", model, hargaSewa);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String infoMobil() {
        return super.info() + ", Kapasitas: " + kapasitasPenumpang + " penumpang";
    }
}