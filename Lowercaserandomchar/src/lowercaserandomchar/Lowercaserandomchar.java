/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lowercaserandomchar;

/**
 *
 * @author 27096
 */
public class Lowercaserandomchar {

    
    public static char[] randomcharacters(char[] randchar ){
        int c; 
        for(int i=0;i<randchar.length;i++)
        {     c=(int)(97+Math.random()*26); //FOR RANDOM CHARACTER GENERATION
             randchar[i]=(char)c;
        }     
        return randchar;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        char[] arr=new char[100];
        randomcharacters(arr);
        //arr now has 100 random characters
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        
        for(char i='a';i<'z';i++)
        {    
            int count=0;
            for(int j=0;j<arr.length;j++)
            {  
                
                if(arr[j]==i)
                { 
                    count++;
                }
                
            }
            System.out.print("There are "+count+" characters of "+i);
            System.out.println("");
        }
        
        
        
        
    }
    
}
