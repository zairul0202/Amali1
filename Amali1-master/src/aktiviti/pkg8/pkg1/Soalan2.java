/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktiviti.pkg8.pkg1;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class Soalan2 {
    public static void main(String args[]){
        
        int kecil, saiz, i;
        int tatasusunan[] = new int[50];
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Bilangan markah : ");
        saiz = scan.nextInt();
        
        System.out.println("Masukkan senarai markah anda : ");
        for(i=0; i<saiz; i++){
            tatasusunan[i] = scan.nextInt();
        }
        
        System.out.print("Carian markah yang paling rendah ....\n\n");
        
        kecil = tatasusunan[0];
        
        for(i=0; i<saiz; i++){
            if(kecil > tatasusunan[i]){
                kecil = tatasusunan[i];
            }
        }
        
        System.out.println("Markah paling rendah = " + kecil);
    }
}
