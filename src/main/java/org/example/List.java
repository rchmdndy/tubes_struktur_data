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
        Elemen current = first;
        Elemen elemenBaru = new Elemen(nama, penulis, penerbit, harga);
        if (first == null) {
            first = elemenBaru;
        } else {
            while (current != null) {
                if (current.info.nama.equals(info)) {
                    elemenBaru.next = current.next;
                    if (current.next != null) {
                        current.next.prev = elemenBaru;
                    }
                    elemenBaru.prev = current;
                    current.next = elemenBaru;
                    break;
                }
                current = current.next;
            }
        }
    }
    
    void insertLast(String nama, String penulis, String penerbit, int harga) {
        Elemen elemenBaru = new Elemen(nama, penulis, penerbit, harga);
        if (first == null) {
            first = elemenBaru;
            last = elemenBaru;
        }
        else {
            Elemen current = first;
            while (current.next != null) {
                current = current.next;
            }
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

            while (current != last) {
                beforeLast = current;
                current = current.next;
            }
            beforeLast.next = null;
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

    void deleteAt(String info){
        if (first == null) {
            System.out.println("Data kosong!");
        }
        else{
            Elemen current = first;
            Elemen beforeLast = null;
            while (!current.info.nama.equals(info)){
                beforeLast = current;
                current = current.next;
            }
            if (current.next == null){
                beforeLast.next = null;
            } else if (info.equals(first.info.nama)) {
                first = current.next;
                first.prev = null;
                if (first.next == null) {
                    last = first;
                }
            } else if (current.info.nama.equals(info)){
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }else{
                System.out.println("Data yang dicari tidak ada!");
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
