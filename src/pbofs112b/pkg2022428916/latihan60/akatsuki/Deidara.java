package pbofs112b.pkg2022428916.latihan60.akatsuki;

/**
 *
 * @author Kus Andi Priyono
 */
public class Deidara extends Akatsuki{
    private String partnerTim;
    
    public Deidara() {
        this.nama = "Deidara";
        this.asalNegara = "Iwagakure";
        this.elemen = "Bom kertas (ledakan), Tanah liat";
        this.jutsu = "-";
        this.partnerTim = "Sasori";
    }
    @Override
    public void siapaAnda() {
        System.out.println(nama + " adalah anggota Akatsuki ninja pelarian, dan asal negara " + asalNegara );
    }
    public String getPartnerTim() {
        return partnerTim;
    }
}
