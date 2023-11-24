/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble.sort;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to input");
         int n=input.nextInt();
        int[] arr= new int[n]; //INPUT
        int x=1;
        for(int k=0;k<arr.length;k++)
        { 
            System.out.println("Enter digit"+" "+ x);
            arr[k]=input.nextInt();
            x++;
        }
        
        for(int i=0;i<arr.length-1;i++) //BUBBLE SORT
        {
               for(int j=0;j<arr.length-i-1;j++)
               {
                   if (arr[j]>arr[j+1])
                   {    
                       int temp=arr[j];
                       arr[j]=arr[j+1];
                       arr[j+1]=temp;  
                   }
               }
        }   
        for(int t=0;t<arr.length;t++) //OUTPUT
        {
            System.out.print(arr[t]+" ");
        }
        
        System.out.println("");
        
    }
    
}
