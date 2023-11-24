/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3 digit number");
        int p = input.nextInt();
         if (p>=100 && p<1000)
         {
                int d1 = p/100;
                  //int d2 = p%100 /10;
                int d3 = p%10;
              
                if (d1==d3)
                     System.out.println("This number is a palindrome");
                else System.out.println("This number is not a palindrome");
                
         }    
         
         else 
             {
                  System.out.println("Error");
                  System.out.println("Enter a valid 3 digit number");
             }
         
         
         
         
    }
    
}
