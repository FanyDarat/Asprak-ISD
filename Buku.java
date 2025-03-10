public class Buku {

    private int isbn;
    private String judul;
    private String kategori;
    private double hargaPinjam;
    private String status;


    public Buku(int isbn, String judul, String kategori, double hargaPinjam, String status) {
        this.isbn = isbn;
        this.judul = judul;
        this.kategori = kategori;
        this.hargaPinjam = hargaPinjam;
        this.status = status;
    }

    public int getIsbn() {
        return isbn;
    }


    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Buku: " +
                "ISBN:" + isbn +
                ", Judul:'" + judul + '\'' +
                ", Kategori:'" + kategori + '\'' +
                ", Harga Pinjam:" + hargaPinjam +
                ", Status:'" + status + '\'';
    }
}
