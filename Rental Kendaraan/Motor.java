class Motor extends Kendaraan {
    private String tipeMotor;

    public Motor(String nama, String model, int hargaSewa, String tipeMotor) {
        super(nama, "Motor", model, hargaSewa);
        this.tipeMotor = tipeMotor;
    }

    public String infoMotor() {
        return super.info() + ", Tipe: " + tipeMotor;
    }
}