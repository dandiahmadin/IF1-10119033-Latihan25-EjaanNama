/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119033.latihan25.ejaannama;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi ejaan sebuah nama
 */
public class IF110119033Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    
    static String nama;
    
    static void inputNama() {
        System.out.print("Masukan nama depan anda untuk di eja : ");
        Scanner scanner = new Scanner (System.in);
        nama = scanner.next();
    }
    
    static void tampilEjaan() {
        System.out.println("\nEjaan untuk \""+nama+"\" adalah : ");
        int num = 1;
        for (char ejaan : nama.toCharArray()){
            System.out.println("Huruf ke-" + num + " : " + ejaan);
            num++;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        inputNama();
        tampilEjaan();
        
    }
    
}
