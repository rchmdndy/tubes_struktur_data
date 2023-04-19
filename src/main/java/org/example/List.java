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

    void insertAt(String nama, String penulis, String penerbit, int harga, String info_dicari) {
        Elemen elemenBaru = new Elemen(nama, penulis, penerbit, harga);
        if (first == null) {
            // Linked list kosong
            first = elemenBaru;
            first.next = first;
            first.prev = first;
        } else {
            Elemen current = first;
            while (true) {
                if (current.info.nama.equals(info_dicari)) {
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
            Elemen elemenSementara = first;
            Elemen beforeLast = null;

            while (elemenSementara.next != null) {
                beforeLast = elemenSementara;
                elemenSementara = elemenSementara.next;

            }
            beforeLast.next = null;
            elemenSementara.prev = null;

        }
    }

    void deleteFirst() {
        if (first != null) {
            first = first.next;
            first.prev = null;
        }
    }

    void deleteAt(int index) {
        if (first == null) {
            System.out.println("List Kosong");
        } else {
            Elemen elemenSementara = first;
            int count = 0;
            while (elemenSementara != null) {
                if (count == index) {
                    if (elemenSementara == first) {
                        first = first.next;
                    }
                    else if (elemenSementara.next != null) {
                        elemenSementara.next.prev = elemenSementara.prev;
                    }
                    else if (elemenSementara.prev != null) {
                        elemenSementara.prev.next = elemenSementara.next;
                    }
                    elemenSementara = null;
                    System.out.println("Elemen pada indeks " + index + " berhasil dihapus");
                    break;
                }
                elemenSementara = elemenSementara.next;
                count++;
                if (elemenSementara == first) {
                    System.out.println("Indeks yang diminta melebihi batas");
                    break;
                }
            }
        }
    }

    void print() {
        Elemen elemenSementara = first;
        if(elemenSementara == null){
            System.out.println("KOSONG");
        }
        else{

            while(elemenSementara != null) {
                int i = 0;
                i++;
                System.out.println("================================");
                System.out.println("Buku " + i);
                System.out.println("Nama pahlawan : "+(elemenSementara.info.nama));
                System.out.println("Nama penulis : "+(elemenSementara.info.penulis));
                System.out.println("Nama penerbit : "+(elemenSementara.info.penerbit));
                System.out.println("Harga : Rp."+(elemenSementara.info.harga));
                System.out.println("================================");
                elemenSementara = elemenSementara.next;
            }
        }
    }
}
