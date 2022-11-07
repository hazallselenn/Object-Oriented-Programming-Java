import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class proje {
    public static void main(String[] args) {
        /*-Dört girişli bir menü oluşturmanız istenmektedir.
            1.Karekter sayısını say.
            2.İki kelime arasındaki ortak karakterleri bul.
            3.Cümleyi ArrayList'e dönüştür.
            4.Çıkış */

        Scanner sc = new Scanner(System.in);

        int secim = 0;

        while (true) {

            // menü oluşturulması
            System.out.println(
                    "\n1.Karakter sayisini say\n2.Iki kelime arasindaki ortak karakterleri bul\n3.Cümleyi ArrayList'e dönüstür\n4.Çikis");
            System.out.println("Secim:");
            secim = sc.nextInt();

            /*
             * 1. seçeneği seçerse Kullanıcı tarafından girilen bir cümlenin karakter
             * sayısını sayıp ekrana yazmaktadır.
             */
            if (secim == 1) {

                System.out.println("\n");
                Scanner sc2 = new Scanner(System.in, "ISO-8859-9");

                int sayac_bosluksuz = 0;
                int tr_karakter = 0;
                String cumle;

                System.out.println("Bir cümle giriniz");
                cumle = sc2.nextLine();

                for (int i = 0; i < cumle.length(); i++) {
                    if ((cumle.charAt(i) >= 65 && cumle.charAt(i) <= 90)
                            || (cumle.charAt(i) >= 97 && cumle.charAt(i) <= 122)) {
                        sayac_bosluksuz++;
                    }
                }

                // türkçe karakterlerin katılması
                for (int i = 0; i < cumle.length(); i++) {
                    String harf = cumle.substring(i, i + 1);
                    if (harf.contains("ç") || harf.contains("ü") || harf.contains("ş") || harf.contains("ı")
                            || harf.contains("ö")
                            || harf.contains("ğ") || harf.contains("Ç") || harf.contains("Ü") || harf.contains("Ş")
                            || harf.contains("I")
                            || harf.contains("Ö")) {
                        sayac_bosluksuz++;
                        tr_karakter++;
                    }
                }

                int sayac_bosluklu = cumle.length();

                System.out.println("Bosluklu karakter sayisi:" + sayac_bosluklu);
                System.out.println("Bosluksuz karakter sayisi:" + sayac_bosluksuz);
                System.out.println("Türkce karakter sayisi:" + tr_karakter);
                System.out.println("\n");

            } else if (secim == 2) {
                /*
                 * 2. seçeneği seçerse;
                 * Kullanıcı tarafından girilen iki kelime arasındaki ortak karakterleri bulup
                 * ekrana yazmaktadır.
                 */

                Scanner sc3 = new Scanner(System.in);
                String kelime1;
                String kelime2;
                int uzunluk1 = 0; // 1.kelime uzunluğunu tutar
                int uzunluk2 = 0; // 2.kelime uzunluğunu tutar
                int sayac = 0; // ortak elemanların toplamını tutar

                System.out.println("birinci kelimeyi giriniz:");
                kelime1 = sc3.next();
                uzunluk1 = kelime1.length();

                char[] dizi1 = new char[uzunluk1];

                System.out.println("ikinci kelimeyi giriniz:");
                kelime2 = sc3.next();
                uzunluk2 = kelime2.length();

                char[] dizi2 = new char[uzunluk2];

                // 1.kelimeyi diziye atar
                for (int i = 0; i < uzunluk1; i++) {
                    dizi1[i] = kelime1.charAt(i);
                }

                // 2.kelimeyi diziye atar
                for (int i = 0; i < uzunluk2; i++) {
                    dizi2[i] = kelime2.charAt(i);
                }

                // ortak elemanları diziye atama işlemi
                for (int i = 0; i < dizi1.length; i++) {
                    for (int k = 0; k < dizi2.length; k++) {
                        if (dizi1[i] == dizi2[k]) {
                            sayac++;
                        }
                    }
                }

                char[] ortak_dizi = new char[sayac];

                int z = 0; // diziler statik yapı olduğu için dizinin indisini tutması gerekiyor i=1 ve i=5
                           // te bulursa ortak karakter
                // 1 ve 5.indislere atar aralar boş kalır. statik yapıda hataya sebep olur. bu
                // yüzden z değişkeni 0 dan başlar
                // ve ortak karakter buldukça sırayla gider.

                for (int i = 0; i < dizi1.length; i++) {
                    for (int k = 0; k < dizi2.length; k++) {
                        if (dizi1[i] == dizi2[k]) {
                            ortak_dizi[z] = dizi2[k];
                            z++;
                        }
                    }
                }

                for (int i = 0; i < z; i++) {
                    int flag = 0;
                    for (int s = 0; s < i; s++) {
                        if (ortak_dizi[i] == ortak_dizi[s]) {
                            // flag 1 olduğunda i li döngüye geri döner boşa çalışmaz
                            flag = 1;
                            break;
                        }
                    }

                    // döngüden çıktıktan ve flag 0 olduğu zaman ekrana 1 kere basar
                    if (flag == 0) {
                        System.out.println(ortak_dizi[i] + " ");
                    }
                }

                System.out.println('\n');

            } else if (secim == 3) {
                /**
                 * 3. seçeneği seçerse;
                 * Kullanıcı tarafından girilen cümledeki kelimelerin her birini ArrayList
                 * içerisine yerleştirerek döngü kullanıp ekrana yazılmasını sağlamaktadır.
                 * Ekrana yazdırma şekli toString metodunun çıktısı ile aynı olması
                 * gerekmektedir.
                 */

                Scanner sc5 = new Scanner(System.in);
                String cumle;
                int kelimesayisi = 1;
                String kelime;

                ArrayList<String> kelimeler = new ArrayList<String>();

                System.out.println("\ncumle giriniz:");
                cumle = sc5.nextLine();

                for (int i = 0; i < cumle.length(); i++) {
                    if (cumle.charAt(i) == 32) {
                        kelimesayisi++;
                    }
                }

                int i = 0;
                int j = 0;

                // System.out.println(cumle.substring(0, 4));

                // döngü içerisinde boşluğa kadar olan kısmı bulup substring ile aradaki
                // kelimeyi alıp arrayliste atama işleminin gerçekleştirilmesi
                while (true) {

                    if (cumle.charAt(i) == 32) {
                        // System.out.println(i);
                        kelime = cumle.substring(j, i + 1);
                        j = i + 1;
                        kelimeler.add(kelime);
                    }

                    else if (i == cumle.length() - 1) {
                        kelime = cumle.substring(j);
                        kelimeler.add(kelime);
                        break;
                    }
                    i++;
                }

                System.out.println("Arraylist içindeki kelimeler:");
                for (int k = 0; k < kelimeler.size(); k++) {
                    System.out.print(kelimeler.get(k) + " ");
                }

                System.out.println("\n");

            } else if (secim == 4) {
                /*
                 * 4. seçeneği seçerse;
                 * program exit ile sonlanması gerekmektedir.
                 */
                System.exit(0);

            } else {
                System.out.println("Hatali giriş yaptiniz yeniden deneyiniz");
            }

        }

    }

}
