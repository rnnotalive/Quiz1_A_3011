/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quiz1_si05a_3011;

/**
 *
 * @author Nadya Kusuma 21103011
 */
public class Quiz1_SI05A_3011 {

    public static void main(String[] args) {
        Penduduk_3011 penduduk = new Penduduk_3011();
        Dosen_3011 dosen = new Dosen_3011();
        
        penduduk.nama_3011 = "Abin Cahyana";      
        penduduk.nik_3011 = "11071";
        penduduk.umur_3011 = 35;      
        penduduk.alamat_3011 = "Solo";      
        dosen.nidn_3011 = "A071";      
        dosen.gol_3011 = "I";
        
        penduduk.nama_3011 = "Santi Suyanti";      
        penduduk.nik_3011 = "11085";
        penduduk.umur_3011 = 32;      
        penduduk.alamat_3011 = "Magelang";      
        dosen.nidn_3011 = "S085";      
        dosen.gol_3011 = "II"; 
        
        penduduk.tampilDataPenduduk();
        penduduk.totalPendapatanPenduduk();
        dosen.tampilDataDosen();
        dosen.totalPendapatanDosen();
    }
}
