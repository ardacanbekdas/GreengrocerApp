package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class GreengrocerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? :");
        int armut = input.nextInt();
        final double armutPerKg = 2.14;


        System.out.print("Elma kaç kilo ? :");
        int elma = input.nextInt();
        final double elmaPerKg = 3.67;

        System.out.print("Domates kaç kilo ? :");
        int domates = input.nextInt();
        final double domatesPerKg = 1.11;

        System.out.print("Muz kaç kilo ? :");
        int muz = input.nextInt();
        final double muzPerKg = 0.95;

        System.out.print("Patlican kaç kilo ? :");
        int patlican = input.nextInt();
        final double patlicanPerKg = 5.00;

        System.out.println("Toplam Tutar : " + ((armutPerKg * armut) + (elma * elmaPerKg) + (domatesPerKg * domates) + (muzPerKg * muz) + (patlicanPerKg * patlican)) + "TL");


    }
}



/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL*/
