/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan51.gajikaryawan;

import java.util.Scanner;
/**
 *
 * @author
 * NAMA : Agus Awaludin
 * NIM : 10118067
 * KELAS : PBO2
 * Latihan ini berisi tentang cara menampilkan Gaji Karyawan dengan metode
 * polymorpism
 */
public class PBO210118067Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        Manager mng = new Manager();
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        mng.setNik(scanner.nextLine());
        System.out.print("Masukkan Nama : ");
        mng.setNama(scanner.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        mng.setGolongan(scanner.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        mng.setJabatan(scanner.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        mng.setKehadiran(scanner.nextInt());
        System.out.println();
        
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK     : " + mng.getNik());
        System.out.println("NAMA    : " + mng.getNama());
        System.out.println("GOLONGAN: " + mng.getGolongan());
        System.out.println("JABATAN : " + mng.getJabatan());
        System.out.println();
        
        System.out.println("TUNJANGAN GOLONGAN      : " 
                + mng.tunjanganGolongan(mng.getGolongan()));
        System.out.println("TUNJANGAN JABATAN       : "
                + mng.tunjanganJabatan(mng.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN     : "
                + mng.tunjanganKehadiran(mng.getKehadiran()));
        System.out.println();
        System.out.println("GAJI TOTAL      : " + mng.gajiTotal());
        
        
    }
    
}
