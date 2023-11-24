/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringsortandremoveduplicate;

import java.util.Scanner;

/**
 *
 * @author Imtiaz
 */
public class Stringsortandremoveduplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("Enter how many Strings you want to input");
         int n=input.nextInt();
        String[] arr= new String[n]; //INPUT
        for(int i=0;i<arr.length;i++)
        { 
            Scanner sc=new Scanner(System.in);
            arr[i]=sc.nextLine();
        }

        for(int i=0;i<arr.length-1;i++) //BUBBLE SORT to SORT STRINGS
        {
               for(int j=0;j<arr.length-i-1;j++)
               {
                   if (arr[j].compareToIgnoreCase(arr[j+1])>0) //BEST THINGY loved it
                   {    
                       String temp=arr[j];
                       arr[j]=arr[j+1];
                       arr[j+1]=temp;  
                   }
               }
        } 
        
       /* for(int i=0;i<arr.length;i++) //OUTPUT sorted array
        {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println(""); */
        
        
        for(int i=0;i<arr.length;i++) //REMOVING DUPLICATE
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i].equalsIgnoreCase(arr[j]))
                    arr[j]="duplicate";
            }
        }
        String result=""; //OUTPUT FINAL RESULT AFTER SORTING AND REMOVING DUPLICATES
        for(String word: arr)                     
        {    
	       if(word != "duplicate") 
             {    
                 result = result + word + " ";
             }		
        }
		
       
        System.out.println(result);
        
        
        
        
        
        
    }
    
}
