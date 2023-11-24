/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bread.jam.bread;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class BreadJamBread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Input");
        String tempmsg=input.nextLine();
        String lowcase= tempmsg.toLowerCase();
        if(lowcase.contains("breadjambread"))
            System.out.println("yes");
        else System.out.println("no");
        
        
        
    }
    
}
