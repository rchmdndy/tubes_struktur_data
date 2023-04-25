package org.example;
import java.util.Scanner;

public class menu {
    static int menu_utama() {
        Scanner s = new Scanner(System.in);
        System.out.println("=============");
        System.out.println("List buku");
        System.out.println("1. GUDANG");
        System.out.println("2. PENJUALAN");
        System.out.println("3. KELUAR");
        System.out.print("Pilihan menu utama > ");
        int pilihan = s.nextInt();
        System.out.println("=============");
        return pilihan;
    }
    static int genre_buku() {
        Scanner s = new Scanner(System.in);
        System.out.println("1.Pengetahuan");
        System.out.println("2.Fiksi");
        System.out.println("3.Religi");
        System.out.print("Pilihan genre > ");
        return s.nextInt();
    }
    static int menu_gudang() {
        Scanner s = new Scanner(System.in);
        System.out.println("=============");
        System.out.println("Input fungsi");
        System.out.println("1. Lihat buku");
        System.out.println("2. Cari buku");
        System.out.println("3. Tambah buku");
        System.out.println("4. Hapus buku");
        System.out.println("5. Beli buku");
        System.out.println("6. Keluar");
        System.out.print("Pilihan menu gudang > ");
        int pilihan = s.nextInt();
        System.out.println("=============");
        return pilihan;
    }static int menu_penjualan() {
        Scanner s = new Scanner(System.in);
        System.out.println("=============");
        System.out.println("Input fungsi");
        System.out.println("1. Hitung pendapatan");
        System.out.println("2. Lihat buku yang terjual");
        System.out.println("3. Hitung jumlah buku yang terjual");
        System.out.println("4. Keluar");
        System.out.print("Pilihan menu penjualan > ");
        int pilihan = s.nextInt();
        System.out.println("=============");
        return pilihan;
    }
    static int menu_add() {
        Scanner s = new Scanner(System.in);
        System.out.println("1. Tambah buku di depan");
        System.out.println("2. Tambah buku pada suatu lokasi");
        System.out.println("3. Tambah buku di belakang");
        System.out.print("Pilihan tambah > ");
        return s.nextInt();
    }

    static int menu_delete() {
        Scanner s = new Scanner(System.in);
        System.out.println("1.Hapus buku di depan");
        System.out.println("2.Hapus buku pada suatu lokasi");
        System.out.println("3.Hapus buku di belakang");
        System.out.print("Pilihan hapus > ");
        return s.nextInt();
    }

    static int menu_cari() {
        Scanner s = new Scanner(System.in);
        System.out.println("1. Nama");
        System.out.println("2. Data setelahnya");
        System.out.println("3. Data sebelumnya");
        System.out.print("Pilihan cari > ");
        return s.nextInt();
    }
}
