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
public class Sasori extends Akatsuki{
    private String partnerTim;
    
    public Sasori() {
        this.nama = "Sasori";
        this.asalNegara = "Sunagakure";
        this.elemen = "-";
        this.jutsu = "Kugutsu";
        this.partnerTim = "Orochimaru setelah itu Deidara";
    }
    @Override
    public void siapaAnda() {
        System.out.println(nama + " dikenal sebagai \"Sasori si Pasir merah\"");
    }
    public String getPartnerTim() {
        return partnerTim;
    }
}
