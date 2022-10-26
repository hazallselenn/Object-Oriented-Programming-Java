import java.util.Arrays;
import java.util.List;


public class ucuncu_soru {
    
    public static void main(String[] args) {
        /*10 elemanlı tam sayı dizisini ArrayList<Integer> sayilar, listine çeviren java kodunu yazınız. */

        Integer[] tamsayi_dizisi=new Integer[] {1,2,3,4,5,6,7,8,9,10};

        List <Integer> sayilar = Arrays.asList(tamsayi_dizisi);

        for(int i=0;i<sayilar.size();i++){
            System.out.println(sayilar.get(i));
        }







    }
}
