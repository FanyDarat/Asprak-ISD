public class Resep {
    private String nama;
    private String bahan;
    private int waktu;

    public Resep(String nama, String bahan, int waktu) {
        this.nama = nama;
        this.bahan = bahan;
        this.waktu = waktu;
    }

    public String getNama() {
        return nama;
    }



    @Override
    public String toString() {
        return "\nNama Masakan: " + nama + '\n' +
                "Bahan Utama: " + bahan + '\n' +
                "Waktu Memasak: " + waktu + "Menit";

    }
}
