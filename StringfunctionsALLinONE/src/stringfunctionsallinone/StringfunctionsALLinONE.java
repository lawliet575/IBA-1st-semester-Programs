/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringfunctionsallinone;

import java.util.Scanner;

/**
 *
 * @author 27096
 */
public class StringfunctionsALLinONE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Input");
        String data = input.nextLine();
        System.out.println("Enter number 1 for Find and replace, 2 for word counter, 3 for sentences, 4 for articles a,an,the, and 5 for spaces");
        
        int n=input.nextInt();
        
        if (n==1)
        {
            System.out.println("Enter 9 to search for a word OR Enter 0 to replace any word");
            int x=input.nextInt();
            
                 if(x==9)    
              {  System.out.println("Enter the word you want to search in the data");
                 String substring= input.next();
                            if(data.contains(substring))
                            {    
                                System.out.println("Data contains "+substring+" at location "+data.indexOf(substring));
                            }    
                            else System.out.println("Data doesn't contain "+substring);

              }    
                 else if(x==0)
                 {    
                     System.out.println("Enter which word you want to get replaced in the data");
                     String r1=input.nextLine();
                     System.out.println("Enter the word you want to replace");
                     String r2=input.nextLine();
                     String newdata= data.replace(r1,r2);
                     System.out.println(newdata);    
                 }    
   
        }    
        
        else if(n==2)  //word count 
        {
            String[] wordcount = data.split(" ");
            int w= wordcount.length;
            System.out.println("Your data has "+w+" words");
        }
        
        else if(n==3)
        {    
            String[] sentences=data.split("\\.");
            int s=sentences.length;
            System.out.println("Your data has "+s+" sentences");
            
        }    
        
        else if(n==4) //articles a,an,the //FINALLY COMPLETED YET N=4
        {    
           
            String[] finaldata=data.split(" ");
            String word1="a", word2="an" , word3="the";    
                      int a=0, an=0, the=0;
                for(int i=0;i<finaldata.length;i++)
           {
                   if( word1.equalsIgnoreCase(finaldata[i]) )
                   a++;
           }    
           
                for(int j=0;j<finaldata.length;j++)
           {
                   if( word2.equalsIgnoreCase(finaldata[j]) )
                   an++;
           }    
            
                for(int k=0;k<finaldata.length;k++)
           {
                   if( word3.equalsIgnoreCase(finaldata[k]) )
                   the++;
           }    
            
            System.out.println("Your data has "+a+" article named a");
            System.out.println("Your data has "+an+" article named an");
            System.out.println("Your data has "+the+" article named the");
           
 
        }    

        else if(n==5) //slitting on the basis of spaces
        {      
            String[] spaces=data.split(" ");
            int s=spaces.length;
            System.out.println("Yor data has"+s+"spaces");
            
        }   
        
        
        
        
    }
    
}
