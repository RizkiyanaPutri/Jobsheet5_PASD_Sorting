package Tugas05;

class Dosen {
    String kode;
    String nama;
    boolean jenisKelamin; // true = L, false = P
    int usia;

    Dosen(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        String jk = jenisKelamin ? "Laki-laki" : "Perempuan";
        System.out.println(kode + " | " + nama + " | " + jk + " | " + usia);
    }
}
