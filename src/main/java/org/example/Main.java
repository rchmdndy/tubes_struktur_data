package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Fix insertAt method, integrate functioning method at the rest of the genre
        // Kumpulan list data tersedia
        List pengetahuan_tersedia = new List();
        List fiksi_tersedia = new List();
        List religi_tersedia = new List();

        // Kumpulan list data penjualan
        List pengetahuan_terjual = new List();
        List fiksi_terjual = new List();
        List religi_terjual = new List();

        String nama, penulis, penerbit, info;
        int harga, total;
        int i = 0;
        Scanner s = new Scanner(System.in);
        Scanner s2  = new Scanner(System.in);
        //Coba fungsi insert first
        pengetahuan_tersedia.insertFirst("Test 1", "test", "test", 45000);
        do {
            switch (menu.menu_utama()) {
                // Gudang / tersedia
                case 1 -> {
                    switch(menu.menu_gudang()){
                        // Lihat list buku
                        case 1 -> {
                            switch(tidy.kategori_buku()){
                                // Tampilkan seluruh buku dari list pengetahuan
                                case 1 -> {pengetahuan_tersedia.print();}
                                // Tampilkan seluruh buku dari list fiksi
                                case 2 -> {fiksi_tersedia.print();}
                                // Tampilkan seluruh buku dari list religi
                                case 3 -> {religi_tersedia.print();}
                            }
                        }
                        // Cari buku
                        case 2 -> {
                            switch (menu.menu_cari()){
                                // Cari dengan input user
                                case 1 -> {}
                                // Cari data setelah data yang di-input user
                                case 2 -> {}
                                // Cari data sebelum data yang di-input user
                                case 3 -> {}
                            }
                        }
                        // Tambah buku
                        case 3 -> {
                            switch(tidy.kategori_buku()){
                                // Pengetahuan
                                case 1 -> {
                                    switch (menu.menu_add()) {
                                        // Tambah depan
                                        case 1 -> {
                                            System.out.print("Masukkan jumlah buku yang ingin dimasukkan > ");
                                            total = s.nextInt();
                                            while (i < total) {
                                                System.out.print("Masukkan nama buku : ");
                                                nama = s2.nextLine();
                                                System.out.print("Masukkan nama penulis : ");
                                                penulis = s2.nextLine();
                                                System.out.print("Masukkan nama penerbit : ");
                                                penerbit = s2.nextLine();
                                                System.out.print("Masukkan harga : ");
                                                harga = s.nextInt();
                                                pengetahuan_tersedia.insertFirst(nama, penulis, penerbit, harga);
                                                i++;
                                            }
                                        }
                                        // Tambah buku pada suatu lokasi
                                        case 2 -> {
                                            System.out.print("Masukkan nama buku : ");
                                            nama = s2.nextLine();
                                            System.out.print("Masukkan nama penulis : ");
                                            penulis = s2.nextLine();
                                            System.out.print("Masukkan nama penerbit : ");
                                            penerbit = s2.nextLine();
                                            System.out.print("Masukkan harga : ");
                                            harga = s.nextInt();
                                            System.out.println("Buku akan dimasukkan setelah nama buku yang dicari");
                                            System.out.print("Masukkan buku yang dicari > ");
                                            info = s2.nextLine();
                                            pengetahuan_tersedia.insertAt(nama, penulis, penerbit, harga, info);
                                        }
                                        // Tambah belakang
                                        case 3 -> {
                                        System.out.print("Masukkan jumlah buku yang ingin dimasukkan > ");
                                        total = s.nextInt();
                                        while (i < total) {
                                            System.out.print("Masukkan nama buku : ");
                                            nama = s2.nextLine();
                                            System.out.print("Masukkan nama penulis : ");
                                            penulis = s2.nextLine();
                                            System.out.print("Masukkan nama penerbit : ");
                                            penerbit = s2.nextLine();
                                            System.out.print("Masukkan harga : ");
                                            harga = s.nextInt();
                                            pengetahuan_tersedia.insertLast(nama, penulis, penerbit, harga);
                                            i++;
                                            }
                                        }
                                    }
                                }
                                // Fiksi
                                case 2 -> {
                                    switch (menu.menu_add()) {
                                        // Tambah depan
                                        case 1 -> {}
                                        // Tambah buku pada suatu lokasi
                                        case 2 -> {}
                                        // Tambah belakang
                                        case 3 -> {}
                                    }
                                }
                                // Religi
                                case 3 -> {
                                    switch (menu.menu_add()) {
                                        // Tambah depan
                                        case 1 -> {break;}
                                        // Tambah buku pada suatu lokasi
                                        case 2 -> {;}
                                        // Tambah belakang
                                        case 3 -> {;}
                                    }
                                }
                            }
                        }
                        // Hapus buku
                        case 4-> {
                            switch(tidy.kategori_buku()){
                                // Pengetahuan
                                case 1 -> {
                                    switch (menu.menu_delete()) {
                                        // Hapus depan
                                        case 1 -> {break;}
                                        // Hapus buku pada suatu lokasi
                                        case 2 -> {break;}
                                        // Hapus belakang
                                        case 3 -> {break;}
                                    }
                                }
                                // Fiksi
                                case 2 -> {
                                    switch (menu.menu_delete()) {
                                        // Hapus depan
                                        case 1 -> {;}
                                        // Hapus buku pada suatu lokasi
                                        case 2 -> {;}
                                        // Hapus belakang
                                        case 3 -> {;}
                                    }
                                }
                                // Religi
                                case 3 -> {
                                    switch (menu.menu_delete()) {
                                        // Hapus depan
                                        case 1 -> {break;}
                                        // Hapus buku pada suatu lokasi
                                        case 2 -> {}
                                        // Hapus belakang
                                        case 3 -> {}
                                    }
                                }
                            }
                        }
                        // Beli
                        case 5 -> {
                            switch(tidy.kategori_buku()){
                                // Pengetahuan
                                case 1 -> {
                                    pengetahuan_tersedia.print();
                                }
                                // Fiksi
                                case 2 -> {
                                    fiksi_tersedia.print();
                                }
                                // Religi
                                case 3 -> {
                                    religi_tersedia.print();
                                }
                            }
                        }
                        // Keluar
                        case 6 -> {break;}
                        default -> System.out.println("Pilihan tidak ada!");
                    }
                }
                // Penjualan
                case 2 -> {
                    switch(menu.menu_penjualan()){
                        // Hitung pendapatan
                        case 1 -> {}
                        // Lihat penjualan
                        case 2 -> {}
                        // Hitung jumlah buku yang terjual
                        case 3 -> {}
                        // Keluar
                        case 4 -> {break;}
                        default -> System.out.println("Pilihan tidak ada");
                    }
                }
                case 3 -> System.exit(0);
                default -> System.out.println("Pilihan tidak ada!");
            }
        }while(tidy.confirm());
    }
}