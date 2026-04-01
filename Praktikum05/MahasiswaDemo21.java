package Praktikum05;

public class MahasiswaDemo21 {
    public static void main(String[] args) {

        MahasiswaBerprestasi21 list = new MahasiswaBerprestasi21();

        Mahasiswa21 m1 = new Mahasiswa21("22001", "Andi", "TI-1A", 3.5);
        Mahasiswa21 m2 = new Mahasiswa21("22002", "Budi", "TI-1A", 3.9);
        Mahasiswa21 m3 = new Mahasiswa21("22003", "Citra", "TI-1A", 3.2);
        Mahasiswa21 m4 = new Mahasiswa21("22004", "Dina", "TI-1A", 3.7);
        Mahasiswa21 m5 = new Mahasiswa21("22005", "Eka", "TI-1A", 3.4);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting");
        list.tampil();

        System.out.println("Data setelah Bubble Sort (Descending IPK)");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data setelah Selection Sort (Ascending IPK)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data setelah Insertion Sort (Ascending IPK)");
        list.insertionSort();
        list.tampil();
    }
}