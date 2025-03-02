import java.util.Scanner;

public class Main {
    static Scanner asd = new Scanner(System.in);

    public static void tambahAwal(SinglyLinkedList<Resep> daftarResep) {
        System.out.print("Masukkan Nama Masakan: ");
        String nama = asd.nextLine();
        System.out.print("Masukkan Bahan Utama: ");
        String bahan = asd.nextLine();
        System.out.print("Masukkan Waktu Memasak: ");
        int waktu = asd.nextInt();
        asd.nextLine();
        Resep newResep =(new Resep(nama, bahan, waktu));
        daftarResep.insertAtFront(newResep);
    }

    public static void tambahAkhir(SinglyLinkedList<Resep> daftarResep) {
        System.out.print("Masukkan Nama Masakan: ");
        String nama = asd.nextLine();
        System.out.print("Masukkan Bahan Utama: ");
        String bahan = asd.nextLine();
        System.out.print("Masukkan Waktu Memasak: ");
        int waktu = asd.nextInt();
        asd.nextLine();
        Resep newResep = (new Resep(nama, bahan, waktu));
        daftarResep.insertAtBack(newResep);
    }

    public static void hapusAwal(SinglyLinkedList<Resep> daftarResep) {
            daftarResep.removeFromFront();
    }

    public static void hapusAkhir(SinglyLinkedList<Resep> daftarResep) {
            daftarResep.removeFromBack();
    }

    public static void tampilkanSemua(SinglyLinkedList<Resep> daftarResep) {
        daftarResep.print();
    }

    public static void cariResep(SinglyLinkedList<Resep> daftarResep) {
        System.out.print("Masukkan Nama Masakan yang dicari: ");
        String nama = asd.nextLine();
        daftarResep.search(nama);
    }

    public static void menu(SinglyLinkedList<Resep> daftarResep) {
        System.out.println("1. Tambah Resep di Awal");
        System.out.println("2. Tambah Resep di Akhir");
        System.out.println("3. Hapus di Awal Resp");
        System.out.println("4. Hapus di Akhir Resep");
        System.out.println("5. Tampilkan Semua Resep");
        System.out.println("6. Cari Resep");
        System.out.println("7. Keluar");
        System.out.print("Pilih Menu: ");

        int pilihan = asd.nextInt();
        asd.nextLine();

        switch (pilihan) {
            case 1:
                tambahAwal(daftarResep);
                break;
            case 2:
                tambahAkhir(daftarResep);
                break;
            case 3:
                hapusAwal(daftarResep);
                break;
            case 4:
                hapusAkhir(daftarResep);
                break;
            case 5:
                tampilkanSemua(daftarResep);
                break;
            case 6:
                cariResep(daftarResep);
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }

        menu(daftarResep);
    }



    public static void main(String[] args) {
        SinglyLinkedList<Resep> daftarResep = new SinglyLinkedList<>();
        menu(daftarResep);
    }
}
