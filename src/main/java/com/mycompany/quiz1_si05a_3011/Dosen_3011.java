/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz1_si05a_3011;

/**
 *
 * @author Lenovo
 */
public class Dosen_3011 extends Penduduk_3011{
    private String nidn_3011;
    private String gol_3011;
    int gajiPokok_3011;
    
    
    public void totalPendapatanDosen(double pendapatan){
        pendapatan = gajiPokok_3011 + gol_3011 ;
        System.out.println(pendapatan);
    }
    
    public void tampilDataDosen(){
        tampilDataPenduduk();
        System.out.println("Jumlah Gaji Pokok   : " + gajiPokok_3022);
        System.out.println("Jumlah Golongan     : " + gol_3011);
    }   
}
