/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertinginarrayandascending;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class Insertinginarrayandascending {

    public static int[] ordering(int[] orderarray, int size) {
        System.out.println("Enter the element to be inserted"); //TO FIND INDEX
        Scanner in = new Scanner(System.in);
        int insert = in.nextInt();
        int order = 0;
        for (int i = 0; i < size; i++) {
            if (orderarray[i] > insert) {
                order = i; //yaha index agaya
                break;
            }
        }
        
        for (int i = size-1; i >= order; i--) {
            orderarray[i] = orderarray[i-1];
        }

        orderarray[order] = insert;
        return orderarray;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] array = new int[20];
        System.out.println("Enter how many elements you want to enter"); //INPUT
        int s = input.nextInt();
        for (int i = 0; i < s; i++) {
            array[i] = input.nextInt();
        }

        int[] sorted = ordering(array, s); //SORTING

        for (int i = 0; i <= s; i++) //OUTPUT
        {
            System.out.print(sorted[i] + " ");
        }
        System.out.println("");

    }

}
