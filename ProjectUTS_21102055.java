/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectuts_21102055;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class ProjectUTS_21102055 {

    public static void main(String[] args) {
        Guru GUR = new Guru();
        Scanner dtIN = new Scanner(System.in);
        
        System.out.print("masukkan id guru : ");
        String ID = dtIN.nextLine();
        GUR.Setidgur(ID);
        
        System.out.print("masukkan nama guru : ");
        String NM = dtIN.nextLine();
        GUR.Setnama(NM);
        
        System.out.print("alamat : ");
        String ALMT = dtIN.nextLine();
        GUR.Setalamat(ALMT);
        
        System.out.print("umur : ");
        String UMR = dtIN.nextLine();
        GUR.Setumur(UMR);
        
        System.out.print("agama : ");
        String AGMA = dtIN.nextLine();
        GUR.setagama(AGMA);
        
        System.out.println("id guru: " + ID);
        System.out.println("nama guru : " + NM);
        System.out.println("alamat guru: " + ALMT);
        System.out.println("umur : " + UMR);
        System.out.println("agama : " + AGMA);
   
    }
}