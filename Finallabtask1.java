/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finallabtask1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class Finallabtask1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       int[][] arr=new int[3][3];
        System.out.println("Enter numbers for 5x5 matrix");
        
       for(int i=0;i<arr.length;i++){ //TAKING INPUT have to do exception handling
           for(int j=0;j<arr[0].length;j++){
               
               boolean correctinput=true;
               do{
               try{  arr[i][j]=input.nextInt(); 
                     correctinput=false;
               }
               catch(InputMismatchException ex1){
                   System.out.println("Wrong input plz try again");
                   input.nextLine();
               }
               
                 } while(correctinput);
              
           }
       }
       
       int saddle=0;
       for(int i=0;i<arr.length;i++){ // CHECKING evry number of every ROW AND COLUMN FOR SADDLE POINT
           for(int j=0;j<arr[0].length;j++){
               int num=arr[i][j];
               if( checkforsaddlepoint(arr,i,j,num) ){
                   System.out.print(num+" ");
                   saddle++;
               }  
           }
       }
       
       if(saddle==0){
           System.out.println("No saddle points");
       }
  
    }
    
    
    public static boolean checkforsaddlepoint(int[][] arr, int crow, int ccol,int num){
        for(int i=0;i<arr.length;i++){ //column check for greatest |
            if(arr[i][ccol]>num)
                return false;       
        }
        for(int j=0;j<arr[0].length;j++){ //row check for least value --
            if(arr[crow][j]<num)
                return false;
        }
        
        return true;
    }
    
}
