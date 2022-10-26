import java.util.Arrays;
import java.util.List;

public class altinci_soru {
    public static void main(String[] args) {
        
        /*10 elemanlı kelime dizisini ArrayList<String> kelimeler, listine çeviren java kodunu yazınız. */

        String[] sehirler=new String[]{"Ankara","Istanbul","Kocaeli","Edirne","Eskisehir","Izmir","Antalya","Mugla","Bursa","Isparta"};
        
        List<String> kelimeler = List.of("Ankara","Istanbul","Kocaeli","Edirne","Eskisehir","Izmir","Antalya","Mugla","Bursa","Isparta");

        for(int i=0;i<kelimeler.size();i++){
            System.out.println(kelimeler.get(i));
        }



    }
}
