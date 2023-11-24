/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finallabtask3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class Finallabtask3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter size for your array");
        int size=0;
        boolean correctinput=true; //TAKING INPUT OF SIZE OF ARRAY
               do{
               try{  size=input.nextInt(); 
                     correctinput=false;
               }
               catch(InputMismatchException ex1){
                   System.out.println("Wrong input plz try again");
                   input.nextLine();
               }
               
                 } while(correctinput);
               
               
        int[] arr=new int[size];
        System.out.println("Input your array");
        
        for(int i=0;i<arr.length;i++){ //TAKING INPUT OF ARRAY
            boolean correctin=true;
               do{
               try{ arr[i]=input.nextInt();
                     correctin=false;
               }
               catch(InputMismatchException ex1){
                   System.out.println("Wrong input plz try again");
                   input.nextLine();
               }
               
                 } while(correctin);
        }
        
       
        findsum(arr,arr.length-1,0);
    }
    
    public static void findsum(int arr[], int index, int sum){
        if(index==0){
            sum=sum+arr[index];
            System.out.println("sum of the array is "+sum);
            return;
    }
        
        sum=sum+arr[index];
        findsum(arr,index-1,sum);
        
    }
    
}
