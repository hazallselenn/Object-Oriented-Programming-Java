import java.util.Scanner;

public class ikinci_soru {
    public static void main(String[] args) {
        /*3x2 lik bir matris(iki boyutlu dizi) tanımlanan ve elemanlarının kullanıcı 
        tarafından girilerek ekrana yazdıran java kodunuz yazınız. */

        int[][] matris = new int [3][2];
        
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print((i+1)+".satir "+(j+1)+".sutun elemanini giriniz: ");
                matris[i][j]=sc.nextInt();
            }
        }
        System.out.println("\n");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(matris[i][j]+" ");
            }
            System.out.println("\n");
        }





    }
}
