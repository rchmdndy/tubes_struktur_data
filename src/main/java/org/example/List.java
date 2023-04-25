package org.example;
import java.util.Scanner;
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

    void insertRawData(Elemen[] elemen) {
        for (Elemen eleman : elemen) {
            insertLast(eleman.info.nama, eleman.info.penulis, eleman.info.penerbit, eleman.info.harga);
        }
    }

    void hitung(){
        Elemen current = first;
        int total = 0;
        while (current != null){
            total += 1;
            current = current.next;
        }
        System.out.println("Total buku yang terjual adalah > " + total);
    }

    void beli(String info, List lt) {
        Elemen current = first;
        if (current == null) {
            System.out.println("List kosong!");
        } else {
            while (current != null) {
                if (current.info.nama.equals(info)) {
                    lt.insertLast(current.info.nama, current.info.penulis, current.info.penerbit, current.info.harga);
                    deleteAt(info);
                    break;
                }
                current = current.next;
            }
            if (current == null){
                System.out.println("Buku yang dibeli tidak terdaftar!");
            }
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
    }void cariAfter(String info) {
        Elemen current = first;
        if (current == null) {
            System.out.println("Data buku kosong!");
        } else {
            while (current.next != null) {
                if (current.info.nama.equals(info)) {
                    System.out.println("Buku tersedia !");
                    System.out.println("================================");
                    System.out.println("Judul buku : " + (current.next.info.nama));
                    System.out.println("Nama penulis : " + (current.next.info.penulis));
                    System.out.println("Nama penerbit : " + (current.next.info.penerbit));
                    System.out.println("Harga : Rp." + (current.next.info.harga));
                    System.out.println("================================");
                    break;
                }
                current = current.next;
            }
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
            else if (!info.equals(current.info.nama)){
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
    void totalHarga() {
        Elemen current = first;
        int sum = 0;
        if (current == null) {
            System.out.println("Belum ada buku pada genre ini yang terjual!");
        } else {
            while (current != null) {
                sum += current.info.harga;
                current = current.next;
            }
            System.out.println("Jumlah harga buku yang terjual = Rp." + sum);
        }
    }
    void print() {
        Elemen current = first;
        if(current == null){
            System.out.println("KOSONG");
        }
        else{
            int i = 0;
            for (int a = 0; a < 230; a++) {
                System.out.print("=");
            }
            System.out.println();
            System.out.printf("%-5s %-100s %-50s %-50s %-15s\n", "No", "Nama Buku", "Nama Penulis", "Nama Penerbit", "Harga");
            for (int a = 0; a < 230; a++) {
                System.out.print("=");
            }
            System.out.println();
            while (current != null) {
                i++;
                System.out.printf("%-5d %-100s %-50s %-50s Rp.%-15d\n", i, current.info.nama, current.info.penulis, current.info.penerbit, current.info.harga);
                current = current.next;
            }
            for (int a = 0; a < 230; a++) {
                System.out.print("=");
            }
            System.out.println();

        }
    }
}
