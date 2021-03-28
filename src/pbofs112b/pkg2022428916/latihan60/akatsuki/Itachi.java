package pbofs112b.pkg2022428916.latihan60.akatsuki;

/**
 *
 * @author Kus Andi Priyono
 */
public class Itachi extends Akatsuki {
    private String partnerTim;
    
    public Itachi() {
        this.nama = "Itachi Uchiha";
        this.asalNegara = "Konohagakure";
        this.elemen = "Api, Angin, Air";
        this.jutsu = "Amaterasu, Sharingan, Susanoo, Tsukoyomi";
        this.partnerTim = "Kisame";
    }
    @Override
    public void siapaAnda() {
        System.out.println(nama + "adalah anggota Akatsuki dan bekerja untuk " + asalNegara);
    }
    public String getPartnerTim() {
        return partnerTim;
    }
}
