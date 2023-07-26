package javaapplication1;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> sehirler = new LinkedList<>();
        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirler.add("Afyon");

        sehirleriTurla(sehirler);

    }

    public static void sehirleriTurla(LinkedList<String> sehirler) {
        ListIterator iterator = sehirler.listIterator();
        int islem;
        islemleriBastir();

        Scanner scanner = new Scanner(System.in);

        if (!iterator.hasNext()) {
            System.out.println("Herhangi bir şehir bulunmuyor.");
        }

        boolean cikis = false;
        boolean yon;

        while (!cikis) {
            System.out.println("Bir işlem seçiniz: ");
            islem = scanner.nextInt();

            switch (islem) {
                case 0:
                    islemleriBastir();
                    break;

                case 1:

                    // sonrası var mı
                    if (iterator.hasNext()) {
                        System.out.println("Şehre gidiliyor: " + iterator.next());

                    } else {
                        System.out.println("Gidilecek şehir kalmadı..");
                    }

                    break;

                case 2:
                    // öncesi var mı
                    if (iterator.hasPrevious()) {
                        System.out.println("Şehre gidiliyor: " + iterator.previous());
                    } else {
                        System.out.println("Şehir turu başladı..");
                    }

                    break;

                case 3:
                    cikis = true;
                    System.out.println("Uygulamadan çıkılıyor...");
                    break;

            }
        }
    }

    private static void islemleriBastir() {
        System.out.println("0 - İşlemleri görüntüle");
        System.out.println("1 - Sonraki şehre git");
        System.out.println("2 - Önceki şehre git");
        System.out.println("3 - Uygulamadan çık ");
    }
}