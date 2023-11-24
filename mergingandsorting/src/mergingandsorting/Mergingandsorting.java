/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mergingandsorting;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class Mergingandsorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter size for array number 1"); //INPUT
         int n=input.nextInt();
        int[] arr1= new int[n]; 
        int x=1;
        for(int k=0;k<arr1.length;k++)
        { 
            System.out.println("Enter digit"+" "+ x);
            arr1[k]=input.nextInt();
            x++;
        }
        System.out.println("Enter size for array number 2");
         int p=input.nextInt();
        int[] arr2= new int[p]; //INPUT
        int o=1;
        for(int k=0;k<arr2.length;k++)
        { 
            System.out.println("Enter digit"+" "+ o);
            arr2[k]=input.nextInt();
            o++;
        }
        int[] arr3= new int[arr1.length+arr2.length];       
        int i=0, j=0, k=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                arr3[k]=arr1[i];
                        i++; k++;
            }
            else 
            {
                arr3[k]=arr2[j];
                        j++; k++;
            }
        }
        
        if(i==arr1.length)
        {
               while(j<arr2.length)
           {
               arr3[k]=arr2[j]; j++; k++;
           }
        }
        else if(j==arr2.length)
        {
             while(i<arr1.length)
           {
               arr3[k]=arr1[i]; i++; k++;
           }
        }
        for(int t=0;t<arr3.length;t++) //OUTPUT
        {
            System.out.print(arr3[t]+" ");
        }
        System.out.println("");
        
        
    }
    
}
