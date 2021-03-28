/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbofs112b.pkg2022428916.latihan60.akatsuki;

/**
 *
 * @author Kus Andi Priyono
 */
public class Zetsu extends Akatsuki{
    private String partnerTim;
    
    public Zetsu() {
        this.nama = "Zetsu";
        this.asalNegara = "-";
        this.elemen = "Kayu";
        this.jutsu = "menyerap cakra";
        this.partnerTim = "Obito";
    }
    @Override
    public void siapaAnda() {
        System.out.println(nama + " adalah mata-mata Akatsuki. Zetsu terdiri dari zetsu hitam dan putih, " +
                "\n sehingga membuatnya memiliki dua kepribadian. Kanibal. Zetsu Hitam diciptakan oleh Kaguya");
    }
    public String getPartnerTim() {
        return partnerTim;
    }
}
