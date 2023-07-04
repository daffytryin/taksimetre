import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int km;
       double perKm = 2.20, tutar = 10; //verilen değerler
       Scanner input = new Scanner(System.in); //kullanıcıdan km değeri alınır
        System.out.println("Gidilen mesafe (km cinsinden) :");
        km= input.nextInt();

        tutar += km*perKm; //tutarın initial 10 tl değeri üzerine gidilen km'ye göre denk gelen tutar tutara tekrar eklenir

        tutar = (tutar < 20) ? 20 : tutar; //tutarın 20 tl altında kalması durumunda indi-bindi tutarı olan 20 ekrana yazdırılır

        System.out.println("Toplam tutar : " + tutar);
    }
}