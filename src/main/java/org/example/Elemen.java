package org.example;

public class Elemen {

    Elemen next;
    Elemen prev;
    data info;
    
    Elemen(String nama, String penulis, String penerbit, float harga){
        info = new data(nama, penulis, penerbit, harga);
        next = null;
        prev = null;
    }
}
