/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package removing.odd.integers;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class RemovingOddIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter any number");
        int n=input.nextInt();
        String a=n+"";
        // String b="";
        //System.out.println(a);
        for(int i=0;i<a.length();i++)
        {                    
             char y=a.charAt(i);
             if(y%2==0)
                 System.out.print(y);
               
        }
        
        System.out.println("");
        
        
  }
    
}
