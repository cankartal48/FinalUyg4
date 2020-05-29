
package thisanahtar_maku4;

public class ThisAnahtarKelimesi {
    String ad;
    String soyad;
    public ThisAnahtarKelimesi(String ad){ //tek parametre alan yapıcı
    this(ad,"KARTAL");//this ile 2 parametreli yapıcı çağırıldı
    }
    public ThisAnahtarKelimesi(String ad,String soyad){//2 parametreli yapıcı
        System.out.println(ad+" "+soyad);
    }
}
