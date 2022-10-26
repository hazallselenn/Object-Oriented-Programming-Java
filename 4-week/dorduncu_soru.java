public class dorduncu_soru {
    public static void main(String[] args) {
        
        String cumle="Dersi Java 2012 Programlama Fall";
        //System.out.println(cumle.indexOf("Java"));//6-10 arası
        //System.out.println(cumle.indexOf("Programlama"));//16-27 arası
        //System.out.println(cumle.indexOf("2012")); //11-15 arası
        //System.out.println(cumle.indexOf("Fall")); //28

        System.out.print(cumle.substring(6,10)+" ");
        System.out.print(cumle.substring(16, 27)+" ");
        System.out.print(cumle.substring(0, 5)+" ");
        System.out.print(cumle.substring(28)+" ");
        System.out.print(cumle.substring(11, 15));
    }
}
