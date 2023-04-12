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