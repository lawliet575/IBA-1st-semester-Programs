/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hexatodecimal;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class Hexatodecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter hexa digit");
        String ch1=input.next();
        String fch=ch1.toUpperCase();
        char ch=fch.charAt(0);
        System.out.println(ch);
        if(ch>=48 && ch<=57)
            System.out.println(ch);
        else if (ch>='A' && ch<='F')
            System.out.println(ch-55);
        
       
    }
    
    
}
