/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
          System.out.println("Enter Weight in Kilograms");
          double weight = input.nextDouble();
          System.out.println("Enter Height in meters");
          double height = input.nextDouble();
          
            double BMI = weight/Math.pow(height,2);
            
             if (BMI >= 30.0 )
                 //BMI <= 18.5 && BMI < 25
                 System.out.println("Obese");    
             else if(BMI >= 25.0)
                  System.out.println("Overweight");
             else if(BMI >= 18.5)
                  System.out.println("Normal");
             else System.out.println("Underweight");
             
                 
                 
             
        
    }
    
}
