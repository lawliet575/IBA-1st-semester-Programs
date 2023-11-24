/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Imtiaz
 */
public class Firstprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter digit 2");
        int d2 = input.nextInt();
        System.out.println("Enter digit 3");
        int d3 = input.nextInt();
        System.out.println("Enter digit 4");
        int d4 = input.nextInt();
        System.out.println("Enter digit 5");
        int d5 = input.nextInt();
        System.out.println("Enter digit 6");
        int d6 = input.nextInt();
        System.out.println("Enter digit 7");
        int d7 = input.nextInt();
        System.out.println("Enter digit 8");
        int d8 = input.nextInt();
        System.out.println("Enter digit 9");
        int d9 = input.nextInt();
        System.out.println("Enter digit 10");
        int d10 = input.nextInt();
        
        int d2f = d2*2;
        int d3f = d3*3;
        int d4f = d4*4;
        int d5f = d5*5;
        int d6f = d6*6;
        int d7f = d7*7;
        int d8f = d8*8;
        int d9f = d9*9;
        int d10f = d10*10;
        
        int sum = d2f+d3f+d4f+d5f+d6f+d7f+d8f+d9f+d10f;
        int sumf = sum%11;
        int d1 =11-sumf;
        
        System.out.println("The 10 digit ISBN number in the format");
        System.out.println("d10,d9,d8,d7,d6,d5,d4,d3,d2,d1 is ");
        System.out.println("" +d10+d9+d8+d7+d6+d5+d4+d3+d2+d1);
        
    }
    
}
