/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorting.numbers.min.to.max;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class SortingNumbersMinToMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter how many numbers you want to input");
         int n=input.nextInt();
        int[] a= new int[n]; //INPUT
        int x=1;
        for(int k=0;k<a.length;k++)
        { 
            System.out.println("Enter digit"+" "+ x);
            a[k]=input.nextInt();
            x++;
        }
        
        
        
        for (int i=0;i<a.length-1;i++) //SORTING
        {
            for (int j=i+1;j<a.length;j++)
            {
                  if ( a[i]>a[j] )
                   {
                       int temp=a[i];
                       a[i]=a[j];
                       a[j]=temp;
                   }
            }
            
        }
        
        
        for(int t=0;t<a.length;t++) //OUTPUT
        {
            System.out.print(a[t]+" ");
        }
        
        System.out.println("");
    }
    
}
