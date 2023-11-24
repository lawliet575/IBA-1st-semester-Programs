/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem3;



/**
 *
 * @author 27096
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int num=1;
        
        while(num<=50)
        {
            for(int divisor=2 ;divisor<num;divisor++)
            {   
               if (num%divisor==0) 
                System.out.print("");
               else System.out.println(num); 
               
               break;
               
               
            }
            num++;
            
        }   
    }
    
}
