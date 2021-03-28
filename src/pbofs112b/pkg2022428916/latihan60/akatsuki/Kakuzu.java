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
public class Kakuzu extends Akatsuki{
    private String partnerTim;
    
    public Kakuzu() {
        this.nama = "Kakuzu";
        this.asalNegara = "Takigakure";
        this.elemen = "Tanah, Angin, Air, Petir, Api";
        this.jutsu = "-";
        this.partnerTim = "Hidan";
    }
    @Override
    public void siapaAnda() {
        System.out.println(nama + " adalah anggota akatsuki yang suka menabung dengan cara berburu buronan " +
                "\nlalu menebusnya dengan uang. Dia dapat memperpanjang hidupnya dengan cara mengambil jantung manusia. " +
                "\nKakuzu pernah melaksanakan misi dari negaranya untuk membunuh Hokage pertama (Hashirama) namun gagal " +
                "\ndan membuatnya dihukum berat. Hal tersebut membuatnya melarikan diri kemudian bergabung dengan Akatsuki.");
    }
    public String getPartnerTim() {
        return partnerTim;
    }
}
