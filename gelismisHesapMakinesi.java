import java.util.Scanner;
public class gelismisHesapMakinesi {
    static int sum(int a,int b){
        return a+b;
    }
    static int ext(int a,int b){
        return a-b;
    }
    static int mult(int a,int b){
        return a*b;
    }
    static double div(double a,double b){
        return a/b;
    }
    static int pow(int a,int b){
       int total=1;
       for(int i=1;i<=b;i++){
           total*=a;
       }
       return total;
    }
    static int mod(int a,int b){
        return a % b;
    }
    static double sqr(double a){
        return Math.sqrt(a);
    }
    static void calc(int a,int b){
        System.out.println("Çevresi ="+ 2*(a+b));
        System.out.println("Alanı ="+a*b);
    }
    static double calc2(double a,double b){
        return (a*b)/2;
    }
    static void calc3(double a,double b){
        double alan=(3.14*(a*a)*b)/360;
        double cevre=2*3.14*a;

        System.out.println("Dairenin alanı:"+alan);
        System.out.println("Dairenin çevresi:"+cevre);
    }
    static double avarage(double a,double b){
        return (a+b)/2;
    }
    static int fac(int a){
        int faktoryel=1;
        while(a>0){
            faktoryel=faktoryel*a;
            a--;
        }
        return faktoryel;
    }
    static void trigo(int a){
        double s=Math.sin(Math.toRadians(a));
        System.out.println("Sinüsü ="+s);
        double x=Math.cos(Math.toRadians(a));
        System.out.println("Kosinüsü ="+x);
        double q=Math.tan(Math.toRadians(a));
        System.out.println("Tanjantı ="+q);
        double we=Math.tan(Math.toRadians(a));
        System.out.println("Kotanjantı ="+1/we);
    }
    static void loga(double a){
        double h=Math.log(a);
        System.out.println("Doğal Logaritması (ln) ="+h);
        double kt=Math.log10(a);
        System.out.println("10 tabanındaki Logaritma değeri (log) ="+kt);
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int select;

        System.out.println("       #  HESAP MAKİNESİ  #\n");

        String menu= """
                1-Toplama İşlemi
                2-Çıkarma İşlemi
                3-Çarpma İşlemi
                4-Bölme İşlemi
                5-Üslü Sayı Hesaplama
                6-Mod Alma
                7-Karekök Alma
                8-Dikdörtgen Alan ve Çevre Hesabı
                9-Üçgen Alan Hesabı
                10-Daire Alan ve Çevre Hesabı
                11-Aritmetik Ortalama Hesabı
                12-Faktöriyel İşlemi
                13-Açı-Trigonometrik Değer Dönüşümü
                14-Logaritma Alma
                0- * ÇIKIŞ *""";

        System.out.println(menu+"\n");

        do{
            System.out.print("Bir işlem seçiniz:");
            select= input.nextInt();

            switch (select) {
                case 1 -> {
                    System.out.println("Toplamak istediğiniz iki değeri giriniz:");
                    int a = input.nextInt();
                    int b = input.nextInt();
                    System.out.println("Cevap =" + sum(a, b));
                }
                case 2 -> {
                    System.out.println("Çıkartmak istediğiniz iki değeri giriniz:");
                    int c = input.nextInt();
                    int d = input.nextInt();
                    System.out.println("Cevap =" + ext(c, d));
                }
                case 3 -> {
                    System.out.println("Çarpmak istediğiniz iki değeri giriniz:");
                    int e = input.nextInt();
                    int f = input.nextInt();
                    System.out.println("Cevap =" + mult(e, f));
                }
                case 4 -> {
                    System.out.println("Bölmek istediğiniz iki değeri giriniz:");
                    int g = input.nextInt();
                    int h = input.nextInt();
                    if (h == 0) {
                        System.out.println("Cevap = TANIMSIZ");
                    } else {
                        System.out.println("Cevap =" + div(g, h));
                    }
                }
                case 5 -> {
                    System.out.println("İlk olarak sayıyı sonra da üssünü giriniz:");
                    int j = input.nextInt();
                    int k = input.nextInt();
                    System.out.println("Cevap =" + pow(j, k));
                }
                case 6 -> {
                    System.out.println("Mod alma işlemi için sayıları giriniz:");
                    int l = input.nextInt();
                    int i = input.nextInt();
                    System.out.println("Cevap =" + mod(l, i));
                }
                case 7 -> {
                    System.out.println("Karekökü alınacak sayıyı giriniz:");
                    int yt = input.nextInt();
                    System.out.println("Cevap =" + sqr(yt));
                }
                case 8 -> {
                    System.out.println("Dikdörtgenin iki kenarının uzunluğunu giriniz");
                    int z = input.nextInt();
                    int y = input.nextInt();
                    System.out.println("Cevap ");
                    calc(z, y);
                }
                case 9 -> {
                    System.out.println("Sırasıyla üçgeninin taban uzunluğunu ve yüksekliğini giriniz:");
                    int n = input.nextInt();
                    int m = input.nextInt();
                    System.out.println("Cevap =" + calc2(n, m));
                }
                case 10 -> {
                    System.out.print("Dairenin yarıçapını giriniz:");
                    int r = input.nextInt();
                    System.out.print("Daire diliminin merkez açı ölçüsünü giriniz:");
                    int alfa = input.nextInt();
                    System.out.println("Cevap");
                    calc3(r, alfa);
                }
                case 11 -> {
                    System.out.println("Ortalamasını almak istediğiniz iki sayıyı giriniz:");
                    int u = input.nextInt();
                    int p = input.nextInt();
                    System.out.println("Cevap =" + avarage(u, p));
                }
                case 12 -> {
                    System.out.println("Faktöryelini almak istediğniz sayıyı giriniz:");
                    int w = input.nextInt();
                    System.out.println("Cevap =" + fac(w));
                }
                case 13 -> {
                    System.out.println("Trigonometrik değerini bulmak istediğiniz açı ölçüsünü giriniz:");
                    int t = input.nextInt();
                    System.out.println("Cevap ");
                    trigo(t);
                }
                case 14 -> {
                    System.out.println("Logaritmasını almak istediğniz değeri giriniz:");
                    int cv = input.nextInt();
                    System.out.println("Cevap");
                    loga(cv);
                }
                default -> System.out.println("GEÇERSİZ KOMUT!");
            }
        }
        while(select!=0);
        System.out.println("     * ÇIKIŞ YAPILDI *");
    }
}
