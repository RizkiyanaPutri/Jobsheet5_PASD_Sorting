# PASD Jobsheet 5 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

## 5.2 Praktikum 1 - Mengimplementasikan Sorting menggunakan object

## 5.2.2 Verifikasi Hasil Percobaan
![alt text](image.png)
## 5.2.3 Verifikasi Hasil Percobaan
![alt text](image-1.png)
## 5.2.4 Verifikasi Hasil Percobaan
![alt text](image-2.png)

## 5.2.5 Pertanyaan!
## 1. Jelaskan fungsi kode program berikut
```java
if (data[j - 1] > data[j]) {
    temp = data[j];
    data[j] = data[j - 1];
    data[j -1 ] = temp;
}
```
Kode tersebut berfungsi untuk menukar (swap) dua elemen yang bersebelahan jika urutannya salah.
data[j - 1] > data[j] → mengecek apakah elemen kiri lebih besar dari elemen kanan.
Jika benar, maka kedua nilai ditukar menggunakan variabel sementara temp.

Langkah proses:

Simpan nilai data[j] ke temp.
Pindahkan nilai data[j-1] ke data[j].
Masukkan nilai temp ke data[j-1].
## 2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!
```java
int min = i;
for (int j = i + 1; j < jumData; j++) {
    if (data[j] < data[min]) {
        min = j;
    }
}
```
## 3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan
```java
 while (j >= 0 && data[j] > temp)
```

Kondisi ini berarti perulangan akan terus berjalan selama:
## j >= 0
→ indeks masih berada dalam batas array.
## data[j] > temp
→ nilai yang sedang dibandingkan lebih besar dari nilai yang akan disisipkan.
Artinya:
Selama elemen di sebelah kiri lebih besar, maka elemen tersebut digeser ke kanan untuk memberi ruang bagi nilai temp.
## 4. Pada Insertion sort, apakah tujuan dari perintah 
```java
data[j + 1] = data[j];
```
Perintah ini berfungsi untuk menggeser elemen satu posisi ke kanan.
Penjelasan:
Nilai pada indeks j dipindahkan ke indeks j + 1.
Pergeseran ini dilakukan untuk membuka ruang bagi elemen temp agar dapat dimasukkan pada posisi yang benar.