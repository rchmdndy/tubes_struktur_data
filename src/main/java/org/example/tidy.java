package org.example;
import java.util.Scanner;

public class tidy {

    static int menu_utama() {
        Scanner s = new Scanner(System.in);
        System.out.println("=============");
        System.out.println("List buku");
        System.out.println("1. GUDANG");
        System.out.println("2. PENJUALAN");
        System.out.println("3. KELUAR");
        System.out.print("Pilihan : ");
        int pilihan = s.nextInt();
        System.out.println("=============");
        return pilihan;
    }static int menu_gudang() {
        Scanner s = new Scanner(System.in);
        System.out.println("=============");
        System.out.println("Input fungsi");
        System.out.println("1. Lihat buku");
        System.out.println("2. Cari buku");
        System.out.println("3. Tambah buku");
        System.out.println("4. Hapus buku");
        System.out.println("5. Beli buku");
        System.out.println("6. Keluar");
        System.out.print("Pilihan : ");
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
        System.out.println("6. Keluar");
        System.out.print("Pilihan : ");
        int pilihan = s.nextInt();
        System.out.println("=============");
        return pilihan;
    }
    static int menu_add() {
        Scanner s = new Scanner(System.in);
        System.out.println("1. Tambah buku di depan");
        System.out.println("2. Tambah buku di belakang");
        System.out.println("3. Tambah buku pada suatu lokasi");
        System.out.print("Pilihan > ");
        int inp = s.nextInt();
        return inp;
    }

    static int menu_delete() {
        Scanner s = new Scanner(System.in);
        System.out.println("1.Hapus buku di depan");
        System.out.println("2.Hapus buku di belakang");
        System.out.println("3.Hapus buku pada suatu lokasi");
        System.out.print("Pilihan : ");
        int user = s.nextInt();
        return user;
    }static int kategori_buku() {
        Scanner s = new Scanner(System.in);
        System.out.println("1.Pengetahuan");
        System.out.println("2.Fiksi");
        System.out.println("3.Religi");
        System.out.print("Pilihan : ");
        int user = s.nextInt();
        return user;
    }

    static boolean confirm() {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Kembali ke Menu (y/n)? > ");
            String menu = s.next().toLowerCase();
            if (menu.equals("y")) {
                return true;
            }else if (menu.equals("n")) {
                System.exit(0);
            }else {
                System.out.println("Pilihan anda salah!");
            }
        }
    }
}