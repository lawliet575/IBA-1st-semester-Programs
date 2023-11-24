/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convert.to.binary.hexa.octa;

import java.util.Scanner;

/**
 *
 * @author Imtiaz
 */
public class ConvertToBinaryHexaOcta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number");
        int n=input.nextInt();
       int i=0;
       int[] arr= new int[100];
       
       while(n!=0)
       {
           arr[i]=n%2;   //use 2 for binary, 8 for octa, 16 for hexa
           n=n/2;
           i++;
       }
       
       for(int j=i+1;j>=0;j--)
       {
           System.out.print(""+arr[j]);
       }
        System.out.println("");
                
    }
    
}
