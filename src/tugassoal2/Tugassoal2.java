/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassoal2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Tugassoal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X;
        System.out.print("Masukkan Nomor : ");
        X=in.nextInt();
        if(X%2==0){
            System.out.println("Input : "+X);
            System.out.println("Output : Genap");
        }else {
            System.out.println("Input :"+X);
            System.out.println("Output : Ganjil");
        }
    
}
}
