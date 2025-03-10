import  java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList<Buku> listBuku = new LinkedList<Buku>();

        listBuku.add(new Buku(1, "Pemrograman Java", "Komputer", 10000, "Tersedia"));
        listBuku.addLast(new Buku(2, "Pemrograman C++", "Komputer", 20000, "Tersedia"));
        listBuku.addFirst(new Buku(3, "Pemrograman Python", "Komputer", 30000, "Tidak Tersedia"));
        listBuku.add(2, new Buku(4, "Pemrograman PHP", "Komputer", 40000, "Tersedia"));

        System.out.println("CetakBuku");
        ListIterator<Buku> print = listBuku.listIterator();
        while (print.hasNext()) {
            System.out.println(print.next());
        }

        System.out.println();

        System.out.println("Cetak Mundur Buku");
        while (print.hasPrevious()) {
            System.out.println(print.previous());
        }

        System.out.println();

        ListIterator<Buku> delete = listBuku.listIterator();
        while (delete.hasNext()) {
            Buku buku = delete.next();
            if (buku.getIsbn() == 2) {
                delete.remove();
            }
        }

        System.out.println("Cetak Buku setelah dihapus");
        for (Buku book : listBuku) {
            System.out.println(book);
        }

        System.out.println();

        ListIterator<Buku> update = listBuku.listIterator();
        while (update.hasNext()) {
            Buku buku = update.next();
            if (buku.getIsbn() == 3) {
                buku.setJudul("Pemrograman Javascript");
                buku.setKategori("Komputer");
                buku.setStatus("Tersedia");
                update.set(buku);
            }
        }

        System.out.println("Cetak Buku setelah diupdate");
        for (Buku book : listBuku) {
            System.out.println(book);
        }


    }
}