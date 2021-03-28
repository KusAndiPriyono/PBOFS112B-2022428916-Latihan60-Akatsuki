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
public class Kisame extends Akatsuki{
    private String partnerTim;
    
    public Kisame() {
        this.nama = "Kisame Hoshigaki";
        this.asalNegara = "Kirigakure";
        this.elemen = "Air";
        this.jutsu = "Jurus Elemen Air";
        this.partnerTim = "Itachi Uchiha";
    }
    
    @Override
    public void siapaAnda() {
        System.out.println(nama + " dijuluki sebagai bijuu tanpa ekor karna dia memiliki cakra yang sangat banyak " +
                "\nseperti para bijuu, dia pengguna pedang Samehadaku yang dapat menyerap cakra lawan.\n");
    }
    public String getPartnerTim() {
        return partnerTim;
    }
}
