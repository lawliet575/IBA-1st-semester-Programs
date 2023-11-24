/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percentevenarray;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class Percentevenarray {

    public static double percent(int[] percentarray){
        int even=0;
        for(int i=0;i<percentarray.length;i++)
        {
            if(percentarray[i]%2==0)
                even++;
            
        }
        
        double percentage=(double)even/percentarray.length * 100 ;
        return percentage;
        
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Size");
        int s=input.nextInt();
        int[] arr= new int[s];
        System.out.println("Enter numbers");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        double result=percent(arr);
        System.out.println("Percentage of even numbers is "+result);
    }
    
}
