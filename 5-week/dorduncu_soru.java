import java.util.*;
public class dorduncu_soru {
    public static void main(String[] args) {
        /*Elemanları kullanıcı tarafından girilen 5 boyutlu iki tamsayı dizinin eşit olup olmadığını kontrol eden java kodunuz yazınız. */

        Scanner sc=new Scanner(System.in);

        int[] dizi1= new int[5];
        int[] dizi2= new int[5];

        for(int i=0;i<5;i++){
            System.out.println("birinci dizinin "+(i+1)+".elemanini giriniz:");
            dizi1[i]=sc.nextInt();
        }

        for (int i = 0; i < dizi2.length; i++) {
            System.out.println("ikinci dizinin "+(i+1)+".elemanini giriniz");
            dizi2[i]=sc.nextInt();
        }

        int sayac=0;
        for(int i=0;i<5;i++){
            if(dizi1[i]==dizi2[i]){
                sayac++;
            }
        }

        if(sayac==5){
            System.out.println("diziler birbirine esit");
        }else{System.out.println("diziler birbirine esit degil");}




    }
}
