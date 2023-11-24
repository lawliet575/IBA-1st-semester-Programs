/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HCF;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class HCF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PROGRAM TO INPUT 2 NUMBERS AND OUTPUTTING HCF(HIGHEST COMMON FACTOR)
        Scanner input = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter number 1");
        n1 = input.nextInt();
        System.out.println("Enter number 2");
        n2 = input.nextInt();
        int gcd = 1 ; 
        int x = 1 ; //checking through x
        do {
            if((n1%x==0 && n2%x==0))
                gcd=x ;
            x++;
        } while(x<=n1 && x<=n2);
        System.out.println(gcd);
       
    }
    
}
