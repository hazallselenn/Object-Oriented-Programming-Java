/**
 * ucuncu_Soru
 */
import java.util.*;
public class ucuncu_Soru {

    public static void main(String[] args) {
        //boşluk karakter sayisi ve küçük harf karakter sayisini bulma

        String cumle;
        Scanner sc = new Scanner(System.in,"ISO-8859-9");

        System.out.println("Bir cümle giriniz:");
        cumle=sc.nextLine();
        

        int sayac1=0,sayac2=0;
         for(int i=0;i<cumle.length();i++){
            if(cumle.charAt(i)==' '){
                sayac1++;
            }
            else if(cumle.charAt(i)>=97 && cumle.charAt(i)<=122){
                sayac2++;
            }

        }
         
        for(int i=0;i<cumle.length();i++){
            String harf=cumle.substring(i,i+1);
            if(harf.contains("ç")||harf.contains("ü") || harf.contains("ş")||harf.contains("ı")||harf.contains("ö")
                    || harf.contains("ğ") || harf.contains("Ç") || harf.contains("Ü")||harf.contains("Ş") || harf.contains("I")
                    ||harf.contains("Ö")){
                sayac2++;
            }
        
        } 
        System.out.println("Boşluk karakteri sayisi:"+sayac1);
        System.out.println("Küçük harfli karakter sayisi:"+sayac2);

    }
}