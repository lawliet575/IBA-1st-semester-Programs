/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumofreciprocals;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class Sumofreciprocals {
    
    public static double Sumto(int n, double sum){
        
       if(n==0) //BASE CASE
           return sum;
       
       sum=  sum + 1/Sumto(n-1,sum); //RECURSION
       return sum; 
       
           
        
    }

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter parameter");
        int n=input.nextInt();
        double sum=1;
        System.out.println("Sum of reciprocals are "+Sumto(n,sum));
        
    }
    
}
