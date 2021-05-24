package tr.com.atm.yapılanislemler;

import tr.com.atm.dahil.musteri;

import java.util.Scanner;

public class paraYatırmaCekme extends islemler {
    public static void main(String[] args)

    Scanner scan = new Scanner(System.in);
    int bakiye = hesapBakiyesi();

    private int hesapBakiyesi() {
        musteri bakiye = new musteri();
        System.out.println("Bakiyeniz = " + bakiye);
        System.out.println("\n****İSLEMLER****\n");
        System.out.println("1. Para Çekme");
        System.out.println("2. Para Yatırma");


        System.out.print("\nİsleminizi Seciniz: ");
        int islem = scan.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Bakiyeniz = " + bakiye);
                System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                int tutar = scan.nextInt();
                if (tutar > bakiye) {
                    System.out.print("Yetersiz bakiye Tekrar giriniz: ");
                    tutar = scan.nextInt();
                }
                bakiye -= tutar;
                System.out.println("Yeni bakiyeniz = " + bakiye);
                break;
            case 2:
                System.out.println("Bakiyeniz = " + bakiye);
                System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                tutar = scan.nextInt();
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz = " + bakiye);
                break;

        }
    }
}
