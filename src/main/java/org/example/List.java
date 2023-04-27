package org.example;
import java.util.Scanner;
/**
 * @author
 * -vina
 **/
public class List {

    Elemen first;

    List() {
        first = null;
    }

    /**FUNGSI MEMASUKKAN RAW DATA*/
    void insertRawData(Elemen[] elemen) {
        for (Elemen eleman : elemen) {
            insertLast_raw(eleman.info.nama, eleman.info.penulis, eleman.info.penerbit, eleman.info.harga);
        }
    }
    void insertLast_raw(String nama, String penulis, String penerbit, float harga) {
        Elemen elemenBaru = new Elemen(nama, penulis, penerbit, harga);
        if (first == null) {
            first = elemenBaru;
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

    /**FUNGSI PRINT LIST*/
    void print() {
        Elemen current = first;
        if(current == null){
            System.out.println("KOSONG");
        }
        else{
            int i = 0;
            for (int a = 0; a < 208; a++) {
                System.out.print("━");
            }
            System.out.println();
            System.out.printf("┃ %-3s ┃ %-95s ┃ %-40s ┃ %-45s ┃ %-9s ┃\n", "NO", "NAMA BUKU", "PENULIS", "PENERBIT", "HARGA");
            for (int a = 0; a < 208; a++) {
                System.out.print("━");
            }
            System.out.println();
            while (current != null) {
                i++;
                System.out.printf("┃ %-3d ┃ %-95s ┃ %-40s ┃ %-45s ┃ Rp%-7.3f ┃\n", i, current.info.nama, current.info.penulis, current.info.penerbit, current.info.harga);
                current = current.next;
            }
            for (int a = 0; a < 208; a++) {
                System.out.print("━");
            }
            System.out.println();

        }
    }

    /**FUNGSI CARI*/
    void cari(String info) {
        Elemen current = first;
        if (current == null) {
            System.out.println("Data buku kosong!");
        } else {
            while (current != null) {
                if (info.equals(current.info.nama)) {
                    System.out.println("Buku tersedia !");
                    System.out.println("================================");
                    System.out.println("Judul buku : " + (current.info.nama));
                    System.out.println("Nama penulis : " + (current.info.penulis));
                    System.out.println("Nama penerbit : " + (current.info.penerbit));
                    System.out.println("Harga : Rp." + (current.info.harga));
                    System.out.println("================================");
                    break;
                }
                current = current.next;
            }
            if (current == null) {
                System.out.println("Buku tidak tersedia!");
            }
        }
    }
    void cariAfter(String info) {
        Elemen current = first;
        if (current == null) {
            System.out.println("Data buku kosong!");
        } else {
            while (current != null) {
                if (current.info.nama.equals(info)) {
                    if (current.next == null) {
                        Scanner s = new Scanner(System.in);
                        System.out.println("Ini merupakan data terakhir!");
                        while (true) {
                            System.out.print("Tampilkan atribut buku? [Y/N] > ");
                            String inp = s.nextLine().toLowerCase();
                            if (inp.equals("y")) {
                                System.out.println("================================");
                                System.out.println("Nama buku : " + (current.info.nama));
                                System.out.println("Nama penulis : " + (current.info.penulis));
                                System.out.println("Nama penerbit : " + (current.info.penerbit));
                                System.out.println("Harga : Rp." + (current.info.harga));
                                System.out.println("================================");
                                break;
                            } else if (inp.equals("n")) {
                                break;
                            } else {
                                System.out.println("Input tidak sesuai");
                            }
                        }
                    }
                    else{
                        System.out.println("Buku tersedia !");
                        System.out.println("================================");
                        System.out.println("Judul buku : " + (current.next.info.nama));
                        System.out.println("Nama penulis : " + (current.next.info.penulis));
                        System.out.println("Nama penerbit : " + (current.next.info.penerbit));
                        System.out.println("Harga : Rp." + (current.next.info.harga));
                        System.out.println("================================");
                    }
                    break;
                }
                current = current.next;
            }
            if (current == null) {
                System.out.println("Data tidak ada!");
            }
            }
    }
    void cariBefore(String info) {
        Elemen current = first;
        Scanner s = new Scanner(System.in);
        if (current == null) {
            System.out.println("Data buku kosong!");
        } else {
            try {
                while (!current.info.nama.equals(info)) {
                    current = current.next;
                }
                if (current.prev == null) {
                    System.out.println("Buku tersebut merupakan buku pertama!");
                    while (true) {
                        System.out.print("Tampilkan data ? [Y/N]");
                        String inp = s.nextLine().toLowerCase();
                        if (inp.equals("y")) {
                            System.out.println("================================");
                            System.out.println("Nama buku : " + (current.info.nama));
                            System.out.println("Nama penulis : " + (current.info.penulis));
                            System.out.println("Nama penerbit : " + (current.info.penerbit));
                            System.out.println("Harga : Rp." + (current.info.harga));
                            System.out.println("================================");
                            break;
                        } else if (inp.equals("n")) {
                            break;
                        } else {
                            System.out.println("Input tidak sesuai");
                        }
                    }
                } else if (current.info.nama.equals(info)) {
                    System.out.println("Buku tersedia!");
                    System.out.println("================================");
                    System.out.println("Judul buku : " + (current.prev.info.nama));
                    System.out.println("Nama penulis : " + (current.prev.info.penulis));
                    System.out.println("Nama penerbit : " + (current.prev.info.penerbit));
                    System.out.println("Harga : Rp." + (current.prev.info.harga));
                    System.out.println("================================");
                } else if (current == null) {
                    System.out.println("Buku tidak ditemukan!");
                }
            }catch(NullPointerException e){
                System.out.println("Buku tidak ditemukan!");
            }
        }
        }

    /**FUNGSI TAMBAH / INSERT */
    void insertFirst(String nama, String penulis, String penerbit, float harga) {
        Elemen elemen_baru = new Elemen(nama, penulis, penerbit, harga);
        if (first == null) {
            first = elemen_baru;
            System.out.println("Buku berhasil ditambahkan!");
        }
        else {
            elemen_baru.next = first;
            first.prev = elemen_baru;
            first = elemen_baru;
            System.out.println("Buku berhasil ditambahkan");
        }
    }
    void insertAt(String nama, String penulis, String penerbit, float harga, String info) {
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
                    System.out.println("Buku berhasil ditambakan!");
                    break;
                }

                current = current.next;
            }
            if (current == null) {
                System.out.println("Buku yang dicari tidak ditemukan!");
            }
        }
    }
    void insertLast(String nama, String penulis, String penerbit, float harga) {
        Elemen elemenBaru = new Elemen(nama, penulis, penerbit, harga);
        if (first == null) {
            first = elemenBaru;
            System.out.println("Buku berhasil ditambahkan!");
        }
        else {
            Elemen current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = elemenBaru;
            elemenBaru.prev = current;
            System.out.println("Buku berhasil ditambahkan!");
        }
    }

    /**FUNGSI HAPUS / DELETE*/
    void deleteFirst() {
        if (first != null) {
            first = first.next;
            first.prev = null;
            System.out.println("Buku berhasil dihapus!");
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
            Elemen beforeLast = current;
            while (!current.info.nama.equals(info)){
                beforeLast = current;
                current = current.next;
            }
            if (current.next == null){
                beforeLast.next = null;
                System.out.println("Buku berhasil dihapus!");
            } else if (info.equals(first.info.nama)) {
                first = current.next;
                first.prev = null;
                System.out.println("Buku berhasil dihapus!");
            } else if (current.info.nama.equals(info)){
                current.prev.next = current.next;
                current.next.prev = current.prev;
                System.out.println("Buku berhasil dihapus!");
            }else{
                System.out.println("Data yang dicari tidak ada!");
            }
        }
    }
    void deleteLast() {
        if (first.next == null){
            first = null;
            System.out.println("Buku berhasil dihapus!");
        }
        else if (first != null) {
            Elemen current = first;
            Elemen beforeLast = null;

            while (current.next != null) {
                beforeLast = current;
                current = current.next;
            }
            beforeLast.next = null;
            System.out.println("Buku berhasil dihapus!");
        }
    }

    /**FUNGSI BELI*/
    void beli(String info, List lt) {
        Elemen current = first;
        if (current == null) {
            System.out.println("List kosong!");
        } else {
            while (current != null) {
                if (current.info.nama.equals(info)) {
                    lt.insert_beli(current.info.nama, current.info.penulis, current.info.penerbit, current.info.harga);
                    delete_beli(info);
                    System.out.println("Buku berhasil dibeli!");
                    System.out.println("--------------------------------");
                    break;
                }
                current = current.next;
            }
            if (current == null){
                System.out.println("Buku yang dibeli tidak terdaftar!");
            }
        }
    }
    void delete_beli(String info){
        if (first == null) {
            System.out.println("Data kosong!");
        }
        else{
            Elemen current = first;
            Elemen beforeLast = current;
            while (!current.info.nama.equals(info)){
                beforeLast = current;
                current = current.next;
            }
            if (current.next == null){
                beforeLast.next = null;
            } else if (info.equals(first.info.nama)) {
                first = current.next;
                first.prev = null;
            } else if (current.info.nama.equals(info)){
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }else{
                System.out.println("Data yang dicari tidak ada!");
            }
        }
    }
    void insert_beli(String nama, String penulis, String penerbit, float harga) {
        Elemen elemenBaru = new Elemen(nama, penulis, penerbit, harga);
        if (first == null) {
            first = elemenBaru;
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

    /**FUNGSI UNTUK MENGHITUNG TOTAL PENDAPATAN*/
    float totalHarga() {
        Elemen current = first;
        float sum = 0;
        while (current != null) {
            sum += current.info.harga;
            current = current.next;
        }
        return sum;
    }

    /**FUNGSI UNTUK MENGHITUNG JUMLAH BUKU*/
    int hitung(){
        Elemen current = first;
        int total = 0;
        while (current != null){
            total += 1;
            current = current.next;
        }
        return total;
    }
}
