/**
 * ikinci_Soru
 */
public class ikinci_Soru {

    public static void main(String[] args) {
        String cumle="Java Programlama Dersi Fall 2012";
        //System.out.println(cumle.indexOf("Programlama Dersi")); 5.indexten başlıyor
        //System.out.println(cumle.indexOf("Fall")); //23.indexten başlıyor.
        System.out.print(cumle.substring(0, 5));
        System.out.print(cumle.substring(23));
    }
}