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

        List[] terjual = {pengetahuan_terjual, fiksi_terjual, religi_terjual};

        // Inisiasi variable yang dibutuhkan
        String info;
        int total;
        Object[] attributes;
        Scanner s = new Scanner(System.in); // Scanner integer

        // Memasukkan raw_data ke dalam list
        pengetahuan_tersedia.insertRawData(raw_data.pengetahuan);
        fiksi_tersedia.insertRawData(raw_data.fiksi);
        religi_tersedia.insertRawData(raw_data.religi);

        do {
            switch (menu.menu_utama()) {
                // Gudang / tersedia
                case 1 -> {
                    do {
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
                                                    info = tidy.pados();
                                                    pengetahuan_tersedia.cari(info);
                                                }
                                                // Fiksi
                                                case 2 -> {
                                                    info = tidy.pados();
                                                    fiksi_tersedia.cari(info);
                                                }
                                                // Religi
                                                case 3 -> {
                                                    info = tidy.pados();
                                                    religi_tersedia.cari(info);
                                                }
                                            }
                                        }
                                        // Cari data setelah data yang di-input user
                                        case 2 -> {
                                            switch (menu.genre_buku()) {
                                                // Pengetahuan
                                                case 1 -> {
                                                    info = tidy.pados();
                                                    pengetahuan_tersedia.cariAfter(info);
                                                }
                                                // Fiksi
                                                case 2 -> {
                                                    info = tidy.pados();
                                                    fiksi_tersedia.cariAfter(info);
                                                }
                                                // Religi
                                                case 3 -> {
                                                    info = tidy.pados();
                                                    religi_tersedia.cariAfter(info);
                                                }
                                            }
                                        }
                                        // Cari data sebelum data yang di-input user
                                        case 3 -> {
                                            switch (menu.genre_buku()) {
                                                // Pengetahuan
                                                case 1 -> {
                                                    info = tidy.pados();
                                                    pengetahuan_tersedia.cariBefore(info);
                                                }
                                                // Fiksi
                                                case 2 -> {
                                                    info = tidy.pados();
                                                    fiksi_tersedia.cariBefore(info);
                                                }
                                                // Religi
                                                case 3 -> {
                                                    info = tidy.pados();
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
                                                    System.out.print("Masukkan jumlah judul buku yang ingin dimasukkan > ");
                                                    total = s.nextInt();
                                                    for (int i = 0; i < total; i++) {
                                                        attributes = tidy.input_buku();
                                                        pengetahuan_tersedia.insertFirst(((String) attributes[0]), ((String) attributes[1]), ((String) attributes[2]), ((float) attributes[3]));
                                                    }
                                                }
                                                // Tambah buku pada suatu lokasi
                                                case 2 -> {
                                                    System.out.print("Masukkan jumlah judul buku yang ingin dimasukkan > ");
                                                    total = s.nextInt();
                                                    for (int i = 0; i < total; i++) {
                                                        attributes = tidy.input_buku_at();
                                                        pengetahuan_tersedia.insertAt(((String) attributes[0]), ((String) attributes[1]), ((String) attributes[2]), ((float) attributes[3]), ((String) attributes[4]));
                                                    }
                                                }
                                                // Tambah belakang
                                                case 3 -> {
                                                    System.out.print("Masukkan jumlah judul buku yang ingin dimasukkan > ");
                                                    total = s.nextInt();
                                                    for (int i = 0; i < total; i++) {
                                                        attributes = tidy.input_buku();
                                                        pengetahuan_tersedia.insertLast(((String) attributes[0]), ((String) attributes[1]), ((String) attributes[2]), ((float) attributes[3]));
                                                    }
                                                }
                                            }
                                        }
                                        // Fiksi
                                        case 2 -> {
                                            switch (menu.menu_add()) {
                                                // Tambah depan
                                                case 1 -> {
                                                    System.out.print("Masukkan jumlah judul buku yang ingin dimasukkan > ");
                                                    total = s.nextInt();
                                                    for (int i = 0; i < total; i++) {
                                                        attributes = tidy.input_buku();
                                                        fiksi_tersedia.insertFirst(((String) attributes[0]), ((String) attributes[1]), ((String) attributes[2]), ((float) attributes[3]));
                                                    }
                                                }
                                                // Tambah buku pada suatu lokasi
                                                case 2 -> {
                                                    System.out.print("Masukkan jumlah judul buku yang ingin dimasukkan > ");
                                                    total = s.nextInt();
                                                    for (int i = 0; i < total; i++) {
                                                        attributes = tidy.input_buku_at();
                                                        fiksi_tersedia.insertAt(((String) attributes[0]), ((String) attributes[1]), ((String) attributes[2]), ((float) attributes[3]), ((String) attributes[4]));
                                                    }
                                                }
                                                // Tambah belakang
                                                case 3 -> {
                                                    System.out.print("Masukkan jumlah judul buku yang ingin dimasukkan > ");
                                                    total = s.nextInt();
                                                    for (int i = 0; i < total; i++) {
                                                        attributes = tidy.input_buku();
                                                        fiksi_tersedia.insertLast(((String) attributes[0]), ((String) attributes[1]), ((String) attributes[2]), ((float) attributes[3]));
                                                    }
                                                }
                                            }
                                        }
                                        // Religi
                                        case 3 -> {
                                            switch (menu.menu_add()) {
                                                // Tambah depan
                                                case 1 -> {
                                                    System.out.print("Masukkan jumlah judul buku yang ingin dimasukkan > ");
                                                    total = s.nextInt();
                                                    for (int i = 0; i < total; i++) {
                                                        attributes = tidy.input_buku();
                                                        religi_tersedia.insertFirst(((String) attributes[0]), ((String) attributes[1]), ((String) attributes[2]), ((float) attributes[3]));
                                                    }
                                                }
                                                // Tambah buku pada suatu lokasi
                                                case 2 -> {
                                                    System.out.print("Masukkan jumlah judul buku yang ingin dimasukkan > ");
                                                    total = s.nextInt();
                                                    for (int i = 0; i < total; i++) {
                                                        attributes = tidy.input_buku_at();
                                                        religi_tersedia.insertAt(((String) attributes[0]), ((String) attributes[1]), ((String) attributes[2]), ((float) attributes[3]), ((String) attributes[4]));
                                                    }
                                                }
                                                // Tambah belakang
                                                case 3 -> {
                                                    System.out.print("Masukkan jumlah judul buku yang ingin dimasukkan > ");
                                                    total = s.nextInt();
                                                    for (int i = 0; i < total; i++) {
                                                        attributes = tidy.input_buku();
                                                        religi_tersedia.insertLast(((String) attributes[0]), ((String) attributes[1]), ((String) attributes[2]), ((float) attributes[3]));
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
                                                    info = tidy.hapusTengah(pengetahuan_tersedia);
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
                                                    info = tidy.hapusTengah(fiksi_tersedia);
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
                                                    info = tidy.hapusTengah(religi_tersedia);
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
                                        case 1 -> tidy.tumbas(pengetahuan_tersedia, pengetahuan_terjual);
                                        // Fiksi
                                        case 2 -> tidy.tumbas(fiksi_tersedia, fiksi_terjual);
                                        // Religi
                                        case 3 -> tidy.tumbas(religi_tersedia, religi_terjual);
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
                            case 1 -> tidy.hitung_pendapatan(pengetahuan_terjual, fiksi_terjual, religi_terjual);
                            // Lihat penjualan
                            case 2 -> tidy.lihat_penjualan(terjual, pengetahuan_terjual, fiksi_terjual, religi_terjual);
                            // Hitung jumlah buku yang terjual
                            case 3 -> tidy.total_buku(pengetahuan_terjual, fiksi_terjual, religi_terjual);
                            // Keluar
                            case 4 -> {}
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