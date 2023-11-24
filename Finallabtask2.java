/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finallabtask2;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class Finallabtask2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Input your string");
        String str= input.next();
        if(str.length()==2 && str.charAt(0)==str.charAt(1)){
            System.out.println(str.charAt(0));  
        }
        int findex=0;
        for(int i=1;i<str.length();i++){ //FINDIND INDEX OF FIRST LETTER FOR SUBSTRING
            if(str.charAt(0)==str.charAt(i))
                findex=i;
        }
        int temp=0;
        String secondletter= str.substring(findex);
        temp=str.length()-1-findex;
        String firstletter= str.substring(0,temp+1);
        
        if(firstletter.equalsIgnoreCase(secondletter)){
            System.out.println(firstletter);
        }
        
        
        
        
        
    }
    
}
