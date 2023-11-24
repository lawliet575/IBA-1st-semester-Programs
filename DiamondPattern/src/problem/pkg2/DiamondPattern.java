/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem.pkg2;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class DiamondPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Input");
        int line= input.nextInt();
        
        for(int r=1;r<=line;r++) //line change
        { 
            for(int c=1;c<=line-r;c++) //leftvala triangle for *
            {    
                System.out.print(" ");  
            }   
            for(int i=1;i<=r;i++) //mid vala triangle for numbers
            {
                System.out.print(i);
            }
            for (int j=r-1;j>0;j--) //backward triangle numbers
            {  
                System.out.print(j);
            }           
            
            
            
            
            System.out.println("");  
        }    
        
    }
    
}
