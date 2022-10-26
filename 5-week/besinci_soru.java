import java.util.Scanner;

public class besinci_soru {
    public static void main(String[] args) {
        /*int[][] matris=new int[4][]; şeklinde tanımlanan iki boyutlu diziye, uzunlukları 
        birbirlerinden farklı Ragged Array "Düzensiz Diziler" atanan ve kullanıcıdan 
        matris(iki boyutlu dizi) değerlerini alip tüm matrisi ekrana yazan java kodunuz yazınız. */

        int boyut, eleman=0;
        int [] eleman_sayisi=new int[30];
        

        Scanner sc=new Scanner(System.in);

        int[][] matris=new int[4][];
        
        for(int i=0;i<4;i++){
            System.out.println((i+1)+".satirdaki eleman sayisi:");
            boyut=sc.nextInt();
            matris[i]=new int[boyut];
            eleman_sayisi[i]=boyut;
            
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<eleman_sayisi[i];j++){
                System.out.println((i+1)+".satir "+(j+1)+".sutun icin deger giriniz:");
                eleman=sc.nextInt();
                matris[i][j]=eleman;
            }
        }
        
        for(int i=0;i<4;i++){
            for(int j=0;j<eleman_sayisi[i];j++){
                System.out.print(matris[i][j]+" ");
            }
            System.out.println("\n");
        }
        





    }
}
