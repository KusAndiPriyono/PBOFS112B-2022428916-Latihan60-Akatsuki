package pbofs112b.pkg2022428916.latihan60.akatsuki;

/**
 *
 * @author Kus Andi Priyono
 */
public class Akatsuki {
    protected String nama, asalNegara, elemen, jutsu;
    
    public Akatsuki() {
        this.nama = " ";
        this.asalNegara = " ";
        this.elemen = " ";
        this.jutsu = " ";
    }
    public void tampilData() {
        System.out.println("-------------------");
        System.out.println("Nama        : " + nama);
        System.out.println("Asal Negara : " + asalNegara);
        System.out.println("Elemen      : " + elemen);
        System.out.println("Jutsu       : " + jutsu);
    }
    public void siapaAnda() {
        System.out.println(nama + "adalah anggota akatsuki");
    }
}
