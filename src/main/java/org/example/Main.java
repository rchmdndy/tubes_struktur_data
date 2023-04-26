package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* TODO :
            TRY EVERY FUNCTION, FIX EVERY ERROR
            - FUNCTION CARI
        */

        // Kumpulan list data tersedia
        List pengetahuan_tersedia = new List();
        List fiksi_tersedia = new List();
        List religi_tersedia = new List();

        // Kumpulan list data penjualan
        List pengetahuan_terjual = new List();
        List fiksi_terjual = new List();
        List religi_terjual = new List();

        // Inisiati variable yang dibutuhkan
        String nama, penulis, penerbit, info;
        int harga, total;
        Scanner s = new Scanner(System.in); // Scanner integer
        Scanner s2  = new Scanner(System.in); // Scanner string

        // Memasukkan raw_data ke dalam list
        pengetahuan_tersedia.insertRawData(raw_data.pengetahuan);
        fiksi_tersedia.insertRawData(raw_data.fiksi);
        religi_tersedia.insertRawData(raw_data.religi);

        do {
            switch (menu.menu_utama()) {
                // Gudang / tersedia
                case 1 -> {
                    do {
                        tidy.clearScreen();
                        switch (menu.menu_gudang()) {
                            // Lihat list buku
                            case 1 -> {
                                do {
                                    switch (menu.genre_buku()) {
                                        // Tampilkan seluruh buku dari list pengetahuan
                                        case 1 -> pengetahuan_tersedia.print();
                                        // Tampilkan seluruh buku dari list fiksi
                                        case 2 -> fiksi_tersedia.print();
                                        // Tampilkan seluruh buku dari list religi
                                        case 3 -> religi_tersedia.print();
                                    }
                                } while (tidy.confirm("genre"));
                            }
                            // Cari buku
                            case 2 -> {
                                do {
                                    switch (menu.menu_cari()) {
                                        // Cari dengan input user
                                        case 1 -> {
                                            switch (menu.genre_buku()) {
                                                // Pengetahuan
                                                case 1 -> {
                                                    System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                                    info = s2.nextLine();
                                                    tidy.loading();
                                                    pengetahuan_tersedia.cari(info);
                                                }
                                                // Fiksi
                                                case 2 -> {
                                                    System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                                    info = s2.nextLine();
                                                    tidy.loading();
                                                    fiksi_tersedia.cari(info);
                                                }
                                                // Religi
                                                case 3 -> {
                                                    System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                                    info = s2.nextLine();
                                                    tidy.loading();
                                                    religi_tersedia.cari(info);
                                                }
                                            }
                                        }
                                        // Cari data setelah data yang di-input user
                                        case 2 -> {
                                            switch (menu.genre_buku()) {
                                                // Pengetahuan
                                                case 1 -> {
                                                    System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                                    info = s2.nextLine();
                                                    tidy.loading();
                                                    pengetahuan_tersedia.cariAfter(info);
                                                }
                                                // Fiksi
                                                case 2 -> {
                                                    System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                                    info = s2.nextLine();
                                                    tidy.loading();
                                                    fiksi_tersedia.cariAfter(info);
                                                }
                                                // Religi
                                                case 3 -> {
                                                    System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                                    info = s2.nextLine();
                                                    tidy.loading();
                                                    religi_tersedia.cariAfter(info);
                                                }
                                            }
                                        }
                                        // Cari data sebelum data yang di-input user
                                        case 3 -> {
                                            switch (menu.genre_buku()) {
                                                // Pengetahuan
                                                case 1 -> {
                                                    System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                                    info = s2.nextLine();
                                                    tidy.loading();
                                                    pengetahuan_tersedia.cariBefore(info);
                                                }
                                                // Fiksi
                                                case 2 -> {
                                                    System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                                    info = s2.nextLine();
                                                    tidy.loading();
                                                    fiksi_tersedia.cariBefore(info);
                                                }
                                                // Religi
                                                case 3 -> {
                                                    System.out.print("Masukkan nama buku sesuai yang dicari > ");
                                                    info = s2.nextLine();
                                                    tidy.loading();
                                                    religi_tersedia.cariBefore(info);
                                                }
                                            }
                                        }
                                    }
                                } while (tidy.confirm("cari"));
                            }
                            // Tambah buku
                            case 3 -> {
                                do {
                                    switch (menu.genre_buku()) {
                                        // Pengetahuan
                                        case 1 -> {
                                            switch (menu.menu_add()) {
                                                // Tambah depan
                                                case 1 -> {
                                                    System.out.print("Masukkan jumlah buku yang ingin dimasukkan > ");
                                                    total = s.nextInt();
                                                    for (int i = 0; i < total; i++) {
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
                                                    for (int i = 0; i < total; i++) {
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
                                                    for (int i = 0; i < total; i++) {
                                                        System.out.print("Masukkan nama buku : ");
                                                        nama = s2.nextLine();
                                                        System.out.print("Masukkan nama penulis : ");
                                                        penulis = s2.nextLine();
                                                        System.out.print("Masukkan nama penerbit : ");
                                                        penerbit = s2.nextLine();
                                                        System.out.print("Masukkan harga : ");
                                                        harga = s.nextInt();
                                                        fiksi_tersedia.insertFirst(nama, penulis, penerbit, harga);
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
                                                }
                                                // Tambah belakang
                                                case 3 -> {
                                                    System.out.print("Masukkan jumlah buku yang ingin dimasukkan > ");
                                                    total = s.nextInt();
                                                    for (int i = 0; i < total; i++) {
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
                                                    for (int i = 0; i < total; i++) {
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
                                                }
                                                // Tambah belakang
                                                case 3 -> {
                                                    System.out.print("Masukkan jumlah buku yang ingin dimasukkan > ");
                                                    total = s.nextInt();
                                                    for (int i = 0; i < total; i++) {
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
                                } while (tidy.confirm("tambah"));
                            }
                            // Hapus buku
                            case 4 -> {
                                do {
                                    switch (menu.genre_buku()) {
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
                                } while (tidy.confirm("hapus"));
                            }
                            // Beli
                            case 5 -> {
                                do {
                                    switch (menu.genre_buku()) {
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
                                } while (tidy.confirm("beli"));
                            }
                            // Keluar
                            case 6 -> {}
                            default -> System.out.println("Pilihan tidak ada!");
                        }
                    }while(tidy.confirm("gudang"));
                }
                // Penjualan
                case 2 -> {
                    do {
                        switch (menu.menu_penjualan()) {
                            // Hitung pendapatan
                            case 1 -> {
                                do {
                                    switch (menu.genre_buku()) {
                                        // Pengetahuan
                                        case 1 -> pengetahuan_terjual.totalHarga();
                                        // Fiksi
                                        case 2 -> fiksi_terjual.totalHarga();
                                        // Religi
                                        case 3 -> religi_terjual.totalHarga();
                                    }
                                } while (tidy.confirm("genre"));
                            }
                            // Lihat penjualan
                            case 2 -> {
                                do {
                                    switch (menu.genre_buku()) {
                                        // Pengetahuan
                                        case 1 -> pengetahuan_terjual.print();
                                        // Fiksi
                                        case 2 -> fiksi_terjual.print();
                                        // Religi
                                        case 3 -> religi_terjual.print();
                                    }
                                } while (tidy.confirm("genre"));
                            }
                            // Hitung jumlah buku yang terjual
                            case 3 -> {
                                do {
                                    switch (menu.genre_buku()) {
                                        // Pengetahuan
                                        case 1 -> pengetahuan_terjual.hitung();
                                        // Fiksi
                                        case 2 -> fiksi_terjual.hitung();
                                        // Religi
                                        case 3 -> religi_terjual.hitung();
                                    }
                                } while (tidy.confirm("genre"));
                            }
                            // Keluar
                            case 4 -> {
                            }
                            default -> System.out.println("Pilihan tidak ada");
                        }
                    }while(tidy.confirm("terjual"));
                }
                // Keluar
                case 3 -> System.exit(0);
                default -> System.out.println("Pilihan tidak ada!");
            }
        }while(tidy.confirm("utama"));
    }
}