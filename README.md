# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Tokosepatu`, `Tokosepatu1`, dan `Tokosepatu2` adalah contoh dari class.

```bash
public class Tokosepatu {
    ...
}

public class Tokosepatu2 extends Tokosepatu1 {
    ...
}

public class Tokosepatu {
    ...
}
```

2. **Object** adalah instance dari Tokosepatu. Pada kode ini, `objek.transaksi` adalah contoh pembuatan object.

```bash
if (objek.beli>=2){
objek.diskon ();
}
```

3. **Atribut** adalah variabel yang ada dalam Tokosepatu. Pada kode ini, `Jenis` adalah contoh atribut.

```bash
String jenis;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam Tokosepatu `Tokosepatu2`.

```bash
public class Tokosepatu2 extends Tokosepatu1 {
    this.beli = beli;
}


5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setBeli` adalah contoh method mutator.

```bash
public void setbeli (int beli){
        this.beli = beli;
}

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNpm`, `getTahunMasuk`, `getFakultas`, `getProdi`, dan `getNoRegistrasi` adalah contoh method accessor.


```


8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Tokosepatu2` mewarisi `Tokosepatu1` dengan sintaks `extends`.

```bash
public class Tokosepatu2 extends Tokosepatu1 {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
public String displayInfo(String kelas) {
    return displayInfo() + "\nKelas: " + kelas;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
 void diskon(){
        if(this.jenis.equals("Nike SB dunk")){
            this.total=600000*this.beli;
            this.diskon=total*0.10;
        }
        else if (this.jenis.equals("Skechers")){
            this.total=1200000*this.beli;
            this.diskon=total*0.10;
        }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `do` untuk meminta input dan menampilkan data.

```bash
 do{
            System.out.print("Masukkan uang pembayaran anda : Rp. ");
            pembayaran = in.nextInt();
        }while(pembayaran<total);
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner in = new Scanner (System.in);
    public int beli (){
        return this.beli;
    }
    public void setbeli (int beli){
        this.beli = beli;
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Tokosepatu1 input = new Tokosepatu1();` adalah contoh penggunaan array.

```bash
Tokosepatu1 input = new Tokosepatu1();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash


## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Areza
NPM: 18630646
