/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excercise.pkg1;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class Trianglesum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row");
        int maxr = input.nextInt();
        
        for (int row=1;row<=maxr;row++)
        {
          int sum=0;
                        for(int col=1;col<=row;col++)
                        {
                            sum=sum+col;
                            if(col==row)
                            System.out.print(col);
                            else System.out.print(col+"+");
                        } 
                
            System.out.println("="+sum);    
            System.out.println(""); 
        }    
    }
    
}
