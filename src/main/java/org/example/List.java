package org.example;
/**
 *
 * @author vina
 */
public class List {

    Elemen first;

    List() {
        first = null;
    }

    void insertFirst(String nama, String penulis, String penerbit, int harga) {
        Elemen elemen_baru = new Elemen(nama, penulis, penerbit, harga);
        if (first == null) first = elemen_baru;
        else{
            elemen_baru.next = first;
            first.prev = elemen_baru;
            //3. Arahkan first ke elemenfirst.prev = elemen_baru; baru
            first = elemen_baru;
        }
    }

    void insertAt(String nama, String penulis, String penerbit, int harga, String info_dicari) {
        if (first == null) {
            // Linked list kosong
            first = new Elemen(nama, penulis, penerbit, harga);
            first.next = first;
            first.prev = first;
        } else {
            Elemen elemenSementara = first;
            Elemen elemen_baru = new Elemen(nama, penulis, penerbit, harga);
            while (true) {
                if (elemenSementara.info.nama.equals(info_dicari)) {
                    elemen_baru.next = elemenSementara.next;
                    elemenSementara.next.prev = elemen_baru;
                    elemen_baru.prev = elemenSementara;
                    elemenSementara.next = elemen_baru;
                    break;
                } else {
                    elemenSementara = elemenSementara.next;
                    if (elemenSementara == first) {
                        // Tidak ada elemen yang sesuai dengan info_dicari
                        break;
                    }
                }
            }
        }
    }
    void insertLast(String nama, String penulis, String penerbit, int harga) {
        // buat elemen baru
        Elemen elemen = new Elemen(nama, penulis, penerbit, harga);
        if (first == null) {
            first = elemen;
        } else {
            Elemen elementSementara = first;
            while (elementSementara.next != null) {
                elementSementara = elementSementara.next;
            }
            elementSementara.next = elemen;
            elemen.prev = elementSementara.next;
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
                System.out.println("Buku " + i);
                System.out.println("Nama pahlawan : "+(elemenSementara.info.nama));
                System.out.println("Nama penulis : "+(elemenSementara.info.penulis));
                System.out.println("Nama penerbit : "+(elemenSementara.info.penerbit));
                System.out.println("Harga : Rp."+(elemenSementara.info.harga));
                elemenSementara = elemenSementara.next;
            }
        }
    }
}
