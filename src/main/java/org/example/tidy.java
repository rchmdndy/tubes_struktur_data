package org.example;
import java.util.Scanner;

public class tidy {
    public static void wait(int ms)
    {
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
}