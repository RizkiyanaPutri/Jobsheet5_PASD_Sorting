package Praktikum05;

import java.util.Scanner;   // PERUBAHAN

public class MahasiswaDemo21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // PERUBAHAN

        MahasiswaBerprestasi21 list = new MahasiswaBerprestasi21();

        System.out.println("Masukkan data mahasiswa");

        for(int i = 0; i < 5; i++){   // PERUBAHAN
            System.out.println("Data mahasiswa ke-" + (i+1));

            System.out.print("NIM : ");
            String nim = sc.nextLine();

            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa21 m = new Mahasiswa21(nim, nama, kelas, ipk);

            list.tambah(m);

            System.out.println();
        }

        System.out.println("Data mahasiswa sebelum sorting");
        list.tampil();

        System.out.println("Data setelah Bubble Sort (Descending)");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data setelah Selection Sort (Ascending)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data setelah Insertion Sort (Ascending)");
        list.insertionSort();
        list.tampil();
    }
}