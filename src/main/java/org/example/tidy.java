package org.example;
import java.util.Scanner;

public class tidy {
    public static void wait(int ms) {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    static void loading(){
        System.out.print("Mencari .");
        tidy.wait(800);
        System.out.print(".");
        tidy.wait(800);
        System.out.print(".");
        tidy.wait(1200);
        System.out.println();
    }
    public static boolean confirm(String option) {
            Scanner s = new Scanner(System.in);
            String pilihan;
            switch (option) {
                case "utama" ->{
                    while (true) {
                        System.out.print("Kembali ke menu utama [y/n]? > ");
                        String menu = s.next().toLowerCase();
                        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                        if (menu.equals("y")) {
                            return true;
                        }else if (menu.equals("n")) {
                            System.exit(0);
                        }else {
                            System.out.println("Pilihan anda salah!");
                        }
                    }
                }
                case "gudang" -> {
                    while (true){
                        System.out.print("Kembali ke menu gudang? [y/n]> ");
                        pilihan = s.nextLine().toLowerCase();
                        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                        if (pilihan.equals("y")) {
                            return true;
                        }else if (pilihan.equals("n")) {
                            return false;
                        }else {
                            System.out.println("Pilihan anda salah!");
                        }
                    }
                }
                case "terjual" -> {
                    while (true){
                        System.out.print("Kembali ke menu terjual? [y/n]> ");
                        pilihan = s.nextLine().toLowerCase();
                        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                        if (pilihan.equals("y")) {
                            return true;
                        }else if (pilihan.equals("n")) {
                            return false;
                        }else {
                            System.out.println("Pilihan anda salah!");
                        }
                    }
                }
                case "cari" -> {
                    while (true) {
                        System.out.print("Cari buku lagi? [y/n]> ");
                        pilihan = s.nextLine().toLowerCase();
                        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                        if (pilihan.equals("y")) {
                            return true;
                        } else if (pilihan.equals("n")) {
                            return false;
                        } else {
                            System.out.println("Pilihan anda salah!");
                        }
                    }
                }
                case "tambah" -> {
                    while (true) {
                        System.out.print("Tambah buku lagi? [y/n]> ");
                        pilihan = s.nextLine().toLowerCase();
                        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                        if (pilihan.equals("y")) {
                            return true;
                        } else if (pilihan.equals("n")) {
                            return false;
                        } else {
                            System.out.println("Pilihan anda salah!");
                        }
                    }
                }
                case "hapus" -> {
                    while (true) {
                        System.out.print("Hapus buku lagi? [y/n]> ");
                        pilihan = s.nextLine().toLowerCase();
                        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                        if (pilihan.equals("y")) {
                            return true;
                        } else if (pilihan.equals("n")) {
                            return false;
                        } else {
                            System.out.println("Pilihan anda salah!");
                        }
                    }
                }
                case "beli" -> {
                    while (true) {
                        System.out.print("Beli buku lagi? [y/n]> ");
                        pilihan = s.nextLine().toLowerCase();
                        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                        if (pilihan.equals("y")) {
                            return true;
                        } else if (pilihan.equals("n")) {
                            return false;
                        } else {
                            System.out.println("Pilihan anda salah!");
                        }
                    }
                }
                case "genre" -> {
                    while (true) {
                        System.out.print("Lihat genre lain? [y/n]> ");
                        pilihan = s.nextLine().toLowerCase();
                        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                        if (pilihan.equals("y")) {
                            return true;
                        } else if (pilihan.equals("n")) {
                            return false;
                        } else {
                            System.out.println("Pilihan anda salah!");
                        }
                    }
                }
            }
            return true;
        }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static Object[] input_buku(){
        Scanner ss = new Scanner(System.in);
        Scanner ss2 = new Scanner(System.in);
        System.out.print("Masukkan nama buku : ");
        String nama = ss2.nextLine();
        System.out.print("Masukkan nama penulis : ");
        String penulis = ss2.nextLine();
        System.out.print("Masukkan nama penerbit : ");
        String penerbit = ss2.nextLine();
        System.out.print("Masukkan harga : ");
        float harga = ss.nextFloat();
        Object[] attributes = {nama, penulis, penerbit, harga};
        return attributes;
    }

    public static Object[] input_buku_at(){
        Scanner ss = new Scanner(System.in);
        Scanner ss2 = new Scanner(System.in);
        System.out.print("Masukkan nama buku : ");
        String nama = ss2.nextLine();
        System.out.print("Masukkan nama penulis : ");
        String penulis = ss2.nextLine();
        System.out.print("Masukkan nama penerbit : ");
        String penerbit = ss2.nextLine();
        System.out.print("Masukkan harga : ");
        float harga = ss.nextFloat();
        System.out.println("Buku akan dimasukkan setelah nama buku yang dicari");
        System.out.print("Masukkan buku yang dicari > ");
        String info = ss2.nextLine();
        Object[] attributes = {nama, penulis, penerbit, harga, info};
        return attributes;
    }

    static void hitung_pendapatan(List pengetahuan, List fiksi, List religi){
        System.out.println("Pendapatan dari buku yang terjual pada setiap genre");
        for (int i = 0; i < 40; i++){
            System.out.print("━");
        }
        System.out.println();
        System.out.printf("┃ %-24s ┃ Rp%-7.3f ┃\n","Pengetahuan ", pengetahuan.totalHarga());
        System.out.printf("┃ %-24s ┃ Rp%-7.3f ┃\n","Fiksi ", fiksi.totalHarga());
        System.out.printf("┃ %-24s ┃ Rp%-7.3f ┃\n","Religi ", religi.totalHarga());
        for (int i = 0; i < 40; i++){
            System.out.print("━");
        }
        System.out.println();
        System.out.printf("┃ %-24s ┃ Rp%-7.3f ┃\n", "Total pendapatan ", (pengetahuan.totalHarga() + fiksi.totalHarga() + religi.totalHarga()));
        for (int i = 0; i < 40; i++){
            System.out.print("━");
        }
        System.out.println();
    }

    static void lihat_penjualan(List[] terjual, List pengetahuan, List fiksi, List religi){
        for (List current : terjual) {
            if (current == pengetahuan) {
                System.out.println("GENRE PENGETAHUAN");
                current.print();
                System.out.println();
            } else if (current == fiksi) {
                System.out.println("GENRE FIKSI");
                current.print();
                System.out.println();
            } else if ((current == religi)) {
                System.out.println("GENRE RELIGI");
                current.print();
                System.out.println();
            }
        }
    }

    static void total_buku(List pengetahuan, List fiksi, List religi){
        System.out.println("Jumlah buku yang terjual pada setiap genre");
        for (int i = 0; i < 33; i++){
            System.out.print("━");
        }
        System.out.println();
        System.out.printf("┃ %-24s ┃ %-2d ┃\n","Pengetahuan ", pengetahuan.hitungBuku());
        System.out.printf("┃ %-24s ┃ %-2d ┃\n","Fiksi ", fiksi.hitungBuku());
        System.out.printf("┃ %-24s ┃ %-2d ┃\n","Religi ", religi.hitungBuku());
        for (int i = 0; i < 33; i++){
            System.out.print("━");
        }
        System.out.println();
        System.out.printf("┃ %-24s ┃ %-2d ┃\n", "Total buku yang terjual ", (pengetahuan.hitungBuku() + fiksi.hitungBuku() + religi.hitungBuku()));
        for (int i = 0; i < 33; i++){
            System.out.print("━");
        }
        System.out.println();
    }
}