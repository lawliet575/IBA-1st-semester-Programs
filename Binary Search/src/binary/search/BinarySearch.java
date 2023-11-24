/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binary.search;

import java.util.Scanner;

/**
 *
 * @author Imtiaz
 */
public class BinarySearch {

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
        System.out.println("Enter which number you want to search");
        int key=input.nextInt();
        System.out.println("The index of your searched number "+key+" is "+binarysearch(arr,key)); 
            
        
    }
    
    public static int binarysearch(int[] list, int key){
     int left=0;
        int right= list.length-1;
        while(left<=right)
        {    
              int middle=(left+right)/2;          
              if(key<list[middle])
              {    
                  right=middle-1;
              }    
              else if(key>list[middle])
              {    
                  left=middle+1;
              }
              else return middle;
        }   
        return -1;
    }
    
}
