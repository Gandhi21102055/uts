/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuts_21102055;

/**
 *
 * @author Acer
 */
public class Guru {
    

    private String IDGUR, NAMA, ALAMAT, UMUR, AGAMA;
    
    public void Setidgur(String idgur){
    this.IDGUR = idgur;
    }
    public void Setnama(String nama){
        this.NAMA = nama;
    }
    public void Setalamat(String alamat){
        this.ALAMAT = alamat;
    }
    public void Setumur(String umur){
        this.UMUR = umur;
    }
    public void setagama(String agama){
        this.AGAMA = agama;
    }
    
  
    public String Getidgur(){
        return this.IDGUR;
    }
    public String Getnama(){
        return this.NAMA;
    }
    public String Getalamat(){
        return this.ALAMAT;
    }
    public String Getumur(){
        return this.UMUR;
    }
    public String Getagama(){
        return this.AGAMA;
    }

}
