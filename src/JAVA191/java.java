package JAVA191;

import java.util.Scanner;

public class java {



    public static void main(String[] args) {
        // Degişkenleri oluştur
        int mat, fizik, biyoloji, turkce, tarih;

        Scanner inp = new Scanner(System.in);

        System.out.print("Fizik notunuz giriniz");
        mat = inp.nextInt();

        System.out.print("Biyoloji notunuz giriniz");
        fizik = inp.nextInt();

        System.out.print("Turkce notunuz giriniz");
        biyoloji = inp.nextInt();

        System.out.print("Tarih notunuz giriniz");
        turkce = inp.nextInt();

        System.out.print("Matematik notunuz giriniz");
        tarih = inp.nextInt();

        int toplam = (mat + fizik + biyoloji + turkce + tarih);
        double sonuc = toplam / 6.0 ;
       

        System.out.println("Ortalamanız :" + sonuc);

    }
}
