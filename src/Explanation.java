import org.w3c.dom.ls.LSOutput;

public class Explanation {

    public String _oyunNedir;
    public  int _oyuncuSayisi;


    public void Acıklama(int oyuncuSayisi)
    {
        _oyuncuSayisi=oyuncuSayisi;
        System.out.println("XOX Oyununun Temel Mantığı 3x3'lük bir satır-sütün üzerinde oyuncuların sırayla \nX ve O yerleştikleri" +
                "sıralı üç(XXX veya OOO) yapanın kazandığı bir oyundur.\n" +
                "Oynaması Basit ve Eğlencelidir");


        System.out.println("Oyun "+oyuncuSayisi+"  oyuncu tarafıından oynanır.");
    }


}
