package org.example;
/**
 *
 * @author vina
 */
public class List {

    Elemen first, last;

    List() {
        first = null;
        last = null;
    }

    void insertRawData(Elemen first, Elemen last, data[] buku){
        for (data books : buku){
            Elemen newElemen = new Elemen(null, null, null, 0);
        }
    }

    void insertFirst(String nama, String penulis, String penerbit, int harga) {
        Elemen elemen_baru = new Elemen(nama, penulis, penerbit, harga);
        if (first == null) {
            first = elemen_baru;
            last = elemen_baru;
        }
        else {
            elemen_baru.next = first;
            first.prev = elemen_baru;
            first = elemen_baru;
        }
    }

    void insertAt(String nama, String penulis, String penerbit, int harga, String info) {
        Elemen elemenBaru = new Elemen(nama, penulis, penerbit, harga);
        if (first == null) {
            // Linked list kosong
            first = elemenBaru;
            last = elemenBaru;
        } else {
            Elemen current = first;
            while (true) {
                if (current.info.nama.equals(info)) {
                    elemenBaru.next = current.next;
                    current.next.prev = elemenBaru;
                    current.next = elemenBaru;
                    elemenBaru.prev = current;
                    break;
                } else {
                    current = current.next;
                    if (current.next == null) {
                        // Tidak ada elemen yang sesuai dengan info_dicari
                        break;
                    }
                }
            }
        }
    }
    void insertLast(String nama, String penulis, String penerbit, int harga) {
        // buat elemen baru
        Elemen elemenBaru = new Elemen(nama, penulis, penerbit, harga);

        // Blok kode yang dijalankan jika list kosong
        if (first == null) {
            first = elemenBaru;
            last = elemenBaru;
        }

        // Blok kode yang dijalankan jika list tidak kosong
        else {
            // Buat elemen current, yang menunjuk ke first
            Elemen current = first;

            /* Selama next sebuah elemen belum null(atau belum last, dikarenakan last.next adalah null)
            maka pindah current ke elemen selanjutnya */
            while (current.next != null) {
                current = current.next;
            }

            // Jika sudah sampai pada elemen dengan next = null, jalankan kode blok ini
            current.next = elemenBaru;
            elemenBaru.prev = current;
        }
    }

    void deleteLast() {
        if (first.next == null){
            first = null;
        }

        else if (first != null) {
            Elemen current = first;
            Elemen beforeLast = null;

            while (current.next != null) {
                beforeLast = current;
                current = current.next;

            }
            beforeLast.next = null;
            current.prev = null;

        }
    }

    void deleteFirst() {
        if (first != null) {
            first = first.next;
            first.prev = null;
        }
        else {
            System.out.println("Data kosong!");
        }
    }

    void deleteAt(int index) {
        if (first == null) {
            System.out.println("List Kosong");
        } else {
            Elemen current = first;
            int count = 0;
            while (current != null) {
                if (count == index) {
                    if (current == first) {
                        first = first.next;
                    }
                    else if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                    else if (current.prev != null) {
                        current.prev.next = current.next;
                    }
                    current = null;
                    System.out.println("Elemen pada indeks " + index + " berhasil dihapus");
                    break;
                }
                current = current.next;
                count++;
                if (current == first) {
                    System.out.println("Indeks yang diminta melebihi batas");
                    break;
                }
            }
        }
    }

    void print() {
        Elemen current = first;
        if(current == null){
            System.out.println("KOSONG");
        }
        else{
            int i = 0;
            while(current != null) {
                i++;
                System.out.println("================================");
                System.out.println("Buku " + i);
                System.out.println("Nama buku : "+(current.info.nama));
                System.out.println("Nama penulis : "+(current.info.penulis));
                System.out.println("Nama penerbit : "+(current.info.penerbit));
                System.out.println("Harga : Rp."+(current.info.harga));
                System.out.println("================================");
                current = current.next;
            }
        }
    }
}
