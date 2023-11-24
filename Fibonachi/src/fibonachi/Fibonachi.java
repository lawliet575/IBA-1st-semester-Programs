/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonachi;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class Fibonachi {

    public static int fibonachi(int n){
        int sum;
        if(n>2)
           sum= fibonachi(n-1)+fibonachi(n-2);
        else if(n==2)
            sum= 1;
        
        else sum=0;
        
        return sum;
    }
    
    public static int factorial(int n){
        if(n>1)
            return factorial(n-1) *n;
        else return 1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
           System.out.println("Input");     
        int n=input.nextInt();
        int x=n;
        System.out.println("Factorial is "+factorial(n));
        System.out.print("0 ");
        for(int i=2;i<=x;i++)
        {
              System.out.print(fibonachi(i)+" ");  
        }
        System.out.println("");
        
    }
    
}
