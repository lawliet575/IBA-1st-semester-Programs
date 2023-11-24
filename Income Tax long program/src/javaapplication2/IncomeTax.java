/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("1=Single" + "2=Married Filing Jointly" + "3=Married Filing Seperately" + "4=Head of Household");
          System.out.println("Choose a filing status number from above");
          int status = input.nextInt();
          System.out.println("Enter Total Income");
         double income = input.nextDouble();
         
          if (status==1)
          {         if (income >= 0 && income <= 8350)
                     {
                      double taxincome = income*0.1;
                     System.out.println("Your income tax is " + taxincome);
                     }
             else if (income >= 8351 && income <= 33950)
                 {
                      double taxincome = income*0.15;
                     System.out.println("Your income tax is " + taxincome);
                 }
             else if (income >= 33951 && income <= 82250)
                 {
                      double taxincome = income*0.25;
                     System.out.println("Your income tax is " + taxincome);
                 }
             else if (income >= 82251 && income <= 171550)
                 {
                      double taxincome = income*0.28;
                     System.out.println("Your income tax is " + taxincome);
                 }
             else if (income >= 171551 && income <= 372950)
                 {
                      double taxincome = income*0.33;
                     System.out.println("Your income tax is " + taxincome);
                 }
             else if (income>=372951)
                 {
                      double taxincome = income*0.35;
                     System.out.println("Your income tax is " + taxincome);
                 }
          
          }
          
          
          else if (status==2)
          {         if (income >= 0 && income <= 16700)
                     {
                      double taxincome = income*0.1;
                     System.out.println("Your income tax is " + taxincome);
                     }
             else if (income >= 16701 && income <= 67900)
                 {
                      double taxincome = income*0.15;
                     System.out.println("Your income tax is " + taxincome);
                 }
             else if (income >= 67901 && income <= 137050)
                 {
                      double taxincome = income*0.25;
                     System.out.println("Your income tax is " + taxincome);
                 }
             else if (income >= 137051 && income <= 208850)
                 {
                      double taxincome = income*0.28;
                     System.out.println("Your income tax is " + taxincome);
                 }
             else if (income >= 208851 && income <= 372950)
                 {
                      double taxincome = income*0.33;
                     System.out.println("Your income tax is " + taxincome);
                 }
             else if (income>=372951)
                 {
                      double taxincome = income*0.35;
                     System.out.println("Your income tax is " + taxincome);
                 }
          
          }
          
          else if (status==3)
          {         if (income >= 0 && income <= 8350)
                     {
                      double taxincome = income*0.1;
                     System.out.println("Your income tax is " + taxincome);
                     }
             else if (income >= 8351 && income <= 33950)
                 {
                      double taxincome = income*0.15;
                     System.out.println("Your income tax is " + taxincome);
                 }
             else if (income >= 33951 && income <= 68525)
                 {
                      double taxincome = income*0.25;
                     System.out.println("Your income tax is " + taxincome);
                 }
             else if (income >= 68526 && income <= 104425)
                 {
                      double taxincome = income*0.28;
                     System.out.println("Your income tax is " + taxincome);
                 }
             else if (income >= 104426 && income <= 186475)
                 {
                      double taxincome = income*0.33;
                     System.out.println("Your income tax is " + taxincome);
                 }
             else if (income>=186476)
                 {
                      double taxincome = income*0.35;
                     System.out.println("Your income tax is " + taxincome);
                 }
          
          }
          
          else if (status==4)
          {         if (income >= 0 && income <= 11950)
                     {
                      double taxincome = income*0.1;
                     System.out.println("Your income tax is " + taxincome);
                     }
             else if (income >= 11951 && income <= 45500)
                 {
                      double taxincome = income*0.15;
                     System.out.println("Your income tax is " + taxincome);
                 }
             else if (income >= 45501 && income <= 117450)
                 {
                      double taxincome = income*0.25;
                     System.out.println("Your income tax is " + taxincome);
                 }
             else if (income >= 117451 && income <= 190200)
                 {
                      double taxincome = income*0.28;
                     System.out.println("Your income tax is " + taxincome);
                 }
             else if (income >= 190201 && income <= 372950)
                 {
                      double taxincome = income*0.33;
                     System.out.println("Your income tax is " + taxincome);
                 }
             else if (income>=372951)
                 {
                      double taxincome = income*0.35;
                     System.out.println("Your income tax is " + taxincome);
                 }
          
           }
          System.out.println("enter a valid Filing Status number");
          
        
    }
    
}
