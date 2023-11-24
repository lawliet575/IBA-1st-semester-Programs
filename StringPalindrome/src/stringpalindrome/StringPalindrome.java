
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringpalindrome;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class StringPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string"); //checking string pallindrome
        String str= input.next();
        
        int length=str.length();
        String rev= "";
        for(int i=length-1;i>=0;i--)
        {  rev=rev+str.charAt(i);
        }
        
        if(str.equals(rev))
            System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
        
      
     //       if (  str.charAt(i)==str.charAt(length-i-1)  )
       //     {
        //        System.out.println("palindrome"); break;
       //     }   
     //       else System.out.println("not a palindrome"); break;
    
        
     
     
        
                
    }
    
}
