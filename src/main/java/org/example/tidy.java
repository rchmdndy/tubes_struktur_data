package org.example;
import java.util.Scanner;

public class tidy {
    static int kategori_buku() {
        Scanner s = new Scanner(System.in);
        System.out.println("1.Pengetahuan");
        System.out.println("2.Fiksi");
        System.out.println("3.Religi");
        System.out.print("Pilihan : ");
        return s.nextInt();
    }
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
        tidy.wait(1500);
        System.out.println();
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
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}