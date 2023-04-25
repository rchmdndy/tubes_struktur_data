package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        Scanner s = new Scanner(System.in); // Scanner integer
        Scanner s2  = new Scanner(System.in); // Scanner string
        //Coba fungsi insert first

        pengetahuan_tersedia.insertRawData(raw_data.pengetahuan);
        fiksi_tersedia.insertRawData(raw_data.fiksi);
        religi_tersedia.insertRawData(raw_data.religi);

        do {
            switch (menu.menu_utama()) {
                // Gudang / tersedia
                case 1 -> {
                    tidy.clearScreen();
                    switch(menu.menu_gudang()){
                        // Lihat list buku
                        case 1 -> {
                            switch(tidy.kategori_buku()){
                                // Tampilkan seluruh buku dari list pengetahuan
                                case 1 -> pengetahuan_tersedia.print();
                                // Tampilkan seluruh buku dari list fiksi
                                case 2 -> fiksi_tersedia.print();
                                // Tampilkan seluruh buku dari list religi
                                case 3 -> religi_tersedia.print();
                            }
                        }
                        // Cari buku
                        case 2 -> {
                            switch (menu.menu_cari()){
                                // Cari dengan input user
                                case 1 -> {
                                    switch(tidy.kategori_buku()){
                                        // Pengetahuan
                                        case 1 -> {
                                            System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                            info = s2.nextLine();
                                            tidy.loading();
                                            pengetahuan_tersedia.cari(info);
                                        }case 2 -> {
                                            System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                            info = s2.nextLine();
                                            tidy.loading();
                                            fiksi_tersedia.cari(info);
                                        }case 3 -> {
                                            System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                            info = s2.nextLine();
                                            tidy.loading();
                                            religi_tersedia.cari(info);
                                        }
                                    }
                                }
                                // Cari data setelah data yang di-input user
                                case 2 -> {
                                    switch(tidy.kategori_buku()){
                                        // Pengetahuan
                                        case 1 -> {
                                            System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                            info = s2.nextLine();
                                            tidy.loading();
                                            pengetahuan_tersedia.cariAfter(info);
                                        }case 2 -> {
                                            System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                            info = s2.nextLine();
                                            tidy.loading();
                                            fiksi_tersedia.cariAfter(info);
                                        }case 3 -> {
                                            System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                            info = s2.nextLine();
                                            tidy.loading();
                                            religi_tersedia.cariAfter(info);
                                        }
                                    }
                                }
                                // Cari data sebelum data yang di-input user
                                case 3 -> {
                                    switch(tidy.kategori_buku()){
                                        // Pengetahuan
                                        case 1 -> {
                                            System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                            info = s2.nextLine();
                                            tidy.loading();
                                            pengetahuan_tersedia.cariBefore(info);
                                        }case 2 -> {
                                            System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                            info = s2.nextLine();
                                            tidy.loading();
                                            fiksi_tersedia.cariBefore(info);
                                        }case 3 -> {
                                            System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                            info = s2.nextLine();
                                            tidy.loading();
                                            religi_tersedia.cariBefore(info);
                                        }
                                    }
                                }
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
                                            i++;
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
                                            fiksi_tersedia.insertFirst(nama, penulis, penerbit, harga);
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
                                            fiksi_tersedia.insertAt(nama, penulis, penerbit, harga, info);
                                            i++;
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
                                            fiksi_tersedia.insertLast(nama, penulis, penerbit, harga);
                                            i++;
                                            }
                                        }
                                    }
                                }
                                // Religi
                                case 3 -> {
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
                                                religi_tersedia.insertFirst(nama, penulis, penerbit, harga);
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
                                            religi_tersedia.insertAt(nama, penulis, penerbit, harga, info);
                                            i++;
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
                                                religi_tersedia.insertLast(nama, penulis, penerbit, harga);
                                                i++;
                                            }
                                        }
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
                                        case 1 -> pengetahuan_tersedia.deleteFirst();
                                        // Hapus buku pada suatu lokasi
                                        case 2 -> {
                                            pengetahuan_tersedia.print();
                                            System.out.println("Masukkan nama buku yang ingin dihapus : ");
                                            info = s2.nextLine();
                                            pengetahuan_tersedia.deleteAt(info);
                                        }
                                        // Hapus belakang
                                        case 3 -> pengetahuan_tersedia.deleteLast();
                                    }
                                }
                                // Fiksi
                                case 2 -> {
                                    switch (menu.menu_delete()) {
                                        // Hapus depan
                                        case 1 -> fiksi_tersedia.deleteFirst();
                                        // Hapus buku pada suatu lokasi
                                        case 2 -> {
                                            fiksi_tersedia.print();
                                            System.out.println("Masukkan nama buku yang ingin dihapus : ");
                                            info = s2.nextLine();
                                            fiksi_tersedia.deleteAt(info);
                                        }
                                        // Hapus belakang
                                        case 3 -> fiksi_tersedia.deleteLast();
                                    }
                                }
                                // Religi
                                case 3 -> {
                                    switch (menu.menu_delete()) {
                                        // Hapus depan
                                        case 1 -> religi_tersedia.deleteFirst();
                                        // Hapus buku pada suatu lokasi
                                        case 2 -> {
                                            religi_tersedia.print();
                                            System.out.println("Masukkan nama buku yang ingin dihapus : ");
                                            info = s2.nextLine();
                                            religi_tersedia.deleteAt(info);
                                        }
                                        // Hapus belakang
                                        case 3 -> religi_tersedia.deleteLast();
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
                                    System.out.print("Pilih nama buku yang ingin dibeli (HARUS SESUAI!) > ");
                                    nama = s2.nextLine();
                                    pengetahuan_tersedia.beli(nama, pengetahuan_terjual);
                                }
                                // Fiksi
                                case 2 -> {
                                    fiksi_tersedia.print();
                                    System.out.print("Pilih nama buku yang ingin dibeli (HARUS SESUAI!) > ");
                                    nama = s2.nextLine();
                                    fiksi_tersedia.beli(nama, fiksi_terjual);
                                }
                                // Religi
                                case 3 -> {
                                    religi_tersedia.print();
                                    System.out.print("Pilih nama buku yang ingin dibeli (HARUS SESUAI!) > ");
                                    nama = s2.nextLine();
                                    religi_tersedia.beli(nama, pengetahuan_terjual);
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
                        case 1 -> {
                            switch (tidy.kategori_buku()){
                                // Pengetahuan
                                case 1 -> pengetahuan_terjual.totalHarga();
                                // Fiksi
                                case 2 -> fiksi_terjual.totalHarga();
                                // Religi
                                case 3 -> religi_terjual.totalHarga();
                            }
                        }
                        // Lihat penjualan
                        case 2 -> {
                            switch (tidy.kategori_buku()){
                                // Pengetahuan
                                case 1 -> pengetahuan_terjual.print();
                                // Fiksi
                                case 2 -> fiksi_terjual.print();
                                // Religi
                                case 3 -> religi_terjual.print();
                            }
                        }
                        // Hitung jumlah buku yang terjual
                        case 3 -> {
                            switch (tidy.kategori_buku()){
                                // Pengetahuan
                                case 1 -> pengetahuan_terjual.hitung();
                                // Fiksi
                                case 2 -> fiksi_terjual.hitung();
                                // Religi
                                case 3 -> religi_terjual.hitung();
                            }
                        }
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