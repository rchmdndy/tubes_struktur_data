package org.example;

public class Elemen {

    Elemen next;
    Elemen prev;
    Elemen(String nama, String penulis, String penerbit, int harga){
        info = new data(nama, penulis, penerbit, harga);
        next = null;
        prev = null;
    }

    data info;
}
