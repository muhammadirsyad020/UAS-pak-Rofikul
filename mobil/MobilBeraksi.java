/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author LENOVO
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobiltemanku = new Mobil();
        
        mobiltemanku.warna = "Putih";
        mobiltemanku.tahunProduksi = 2024;
        
        System.out.println("Warna :" + mobiltemanku.warna);
        System.out.println("Tahun Produksi :" + mobiltemanku.tahunProduksi);
                
    }
    
}
