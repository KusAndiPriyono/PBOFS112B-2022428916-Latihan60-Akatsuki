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
public class Pain extends Akatsuki{
    private String partnerTim;
    
    public Pain() {
        this.nama = "Pain / Nagato Uzumaki";
        this.asalNegara = "Amegakure";
        this.elemen = "Angin, Petir, Tanah, Air, Api, Yang ";
        this.jutsu = "Banshō Tenin, Chibaku Tensei, Shinra Tensei";
        this.partnerTim = "Konan";
    }
    @Override
    public void siapaAnda() {
        System.out.println(nama + " ketua organisasi akatsuki, pain berjumlah 6 orang yang ternyata "+
                "\ndikendalikan dari jarak jauh oleh Nagato dengan mata rinnegan. ia mulai memimpin " +
                "\nAkatsuki yang baru, yang akan menggunakan cara kekerasan untuk mencapai tujuan mereka.   " +
                "\nSebenarnya Pain bukanlah ketua akatsuki karna yang mengepalai akatsuki yang sebenarnya " +
                "\nadalah Tobi yang mengaku sebagai Madara Uchiha.");
    }
    public String getPartnerTim() {
        return partnerTim;
    }
}
