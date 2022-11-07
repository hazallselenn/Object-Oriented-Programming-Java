import java.util.*;

public class proje2 {
    public static void main(String[] args) {
        // menü oluşturma

        int secim = 0;

        while (true) {
            System.out.println(
                    "\n1.Karakter sayisini say\n2.Iki kelime arasindaki ortak karakterleri bul\n3.Cümleyi ArrayList'e dönüstür\n4.Çikis");
            System.out.println("Secim:");
            Scanner sc = new Scanner(System.in);
            secim = sc.nextInt();

            switch (secim) {
                // karakter sayma işlemi
                case 1:

                    Scanner sc1 = new Scanner(System.in, "ISO-8859-9");
                    String cumle;
                    int karakter_sayisi = 0;
                    int bosluk = 1;

                    System.out.println("bir cumle giriniz:");
                    cumle = sc1.nextLine();

                    int j = 0;

                    // cumlenin toplam karakter sayısından boşluğun çıkarılması
                    while (j != cumle.length()) {
                        if (cumle.charAt(j) == 32) {
                            bosluk++;
                        }

                        j++;
                    }

                    karakter_sayisi = (cumle.length()) - bosluk + 1;

                    System.out.println("Toplam karakter sayisi:" + karakter_sayisi);
                    break;

                case 2:
                    // girilen 2 kelime arasındaki ortak karakterleri bulup yazdırma işlemi

                    Scanner sc2 = new Scanner(System.in);
                    String kelime1;
                    String kelime2;
                    int uzunluk1 = 0; // 1.kelime uzunluğunu tutar
                    int uzunluk2 = 0; // 2.kelime uzunluğunu tutar
                    int sayac = 0; // ortak elemanların toplamını tutar

                    System.out.println("birinci kelimeyi giriniz:");
                    kelime1 = sc2.next();
                    uzunluk1 = kelime1.length();

                    char[] dizi1 = new char[uzunluk1];

                    System.out.println("ikinci kelimeyi giriniz:");
                    kelime2 = sc2.next();
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

                    break;

                case 3:
                    // cümleyi arrayliste dönüştürme işlemi

                    Scanner sc3 = new Scanner(System.in);
                    String girilen_cumle;
                    String kelime;

                    // istenilen arraylistin oluşturulması
                    ArrayList<String> kelime_list = new ArrayList<String>();

                    System.out.println("Cumle giriniz:");
                    girilen_cumle = sc3.nextLine();

                    int a = 0;

                    // substring ile boşluklar arasındaki kelimelerin arrayliste atanması ve
                    // yazdırılması
                    for (int i = 0; i < girilen_cumle.length(); i++) {
                        if (girilen_cumle.charAt(i) == 32) {
                            kelime = girilen_cumle.substring(a, i + 1);
                            a = i + 1;
                            kelime_list.add(kelime);
                        } else if (i == (girilen_cumle.length() - 1)) {
                            kelime = girilen_cumle.substring(a);
                            kelime_list.add(kelime);
                        }
                    }

                    System.out.println("Array List:");
                    for (int i = 0; i < kelime_list.size(); i++) {
                        System.out.print(kelime_list.get(i) + " ");
                    }
                    break;

                case 4:
                    System.out.println("Basarili bir sekilde cikis yapildi");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Hatali giris yaptiniz yeniden deneyiniz");
                    break;
            }

        }
    }
}
