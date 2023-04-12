package org.example;

public class Main {
    public static void main(String[] args) {
        List pengetahuan_tersedia = new List();
        List pengetahuan_terjual = new List();
        List fiksi_tersedia = new List();
        List fiksi_terjual = new List();
        List religi_tersedia = new List();
        List religi_terjual = new List();
        String nama, penulis, penerbit;
        int harga;

        do {
            switch (tidy.menu_utama()) {
                case 1 -> tidy.menu_gudang();
                case 2 -> tidy.menu_penjualan();
                case 3 -> System.exit(0);
                default -> System.out.println("Pilihan tidak ada!");
            }
        }while(tidy.confirm());
    }
}
