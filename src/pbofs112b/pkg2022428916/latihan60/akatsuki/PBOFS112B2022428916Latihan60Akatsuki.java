package pbofs112b.pkg2022428916.latihan60.akatsuki;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Kus Andi Priyono
 * Kelas: FS112B
 * Nim  : 2022428916
 * Deskripsi : Menampilkan daftar karakter dengan memilih nomer, maka akan langsung menampilkan profil
 */
public class PBOFS112B2022428916Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,pilihan;
        char lanjut;
        
        String[] listnama = {
            "Itachi Uchiha", "Deidara"
        };
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        
        do {
            System.out.println("===Daftar Anggota Akatsuki===");
            for (i = 0; i < listnama.length; i++) {
                System.out.println(i+1 + " . " + listnama[i]);
            }
            System.out.print("\nMasukan Pilihan Anda (1~"+i+"): ");
            pilihan = scan1.nextInt();
            
            switch(pilihan) {
                case 1:
                    Itachi itachi = new Itachi();
                    itachi.tampilData();
                    System.out.println("Partner : " + itachi.getPartnerTim());
                    itachi.siapaAnda();
                    break;
                case 2:
                    Deidara deidara = new Deidara();
                    deidara.tampilData();
                    System.out.println("Partner : " + deidara.getPartnerTim());
                    deidara.siapaAnda();
                default:
                    System.out.println("Nomor yang anda pilih belum tersedia");
            }
            System.out.println("\nLanjut (y/n)? : ");
            lanjut = scan2.next().charAt(0);
        }while(lanjut != 'n');
    }
    
}
