package Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class LettersInString {
    
    public static void main(String args[]){
        
       print(); 
             
    }
    
    public static void print(){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        String name=sc.nextLine();
        
        ArrayList<Character> letters=new ArrayList<>();
        
         for(int i=0;i<name.length();i++){
             if(letters.contains(name.charAt(i))){
                 
         }else{
                 letters.add(name.charAt(i));
                    
        }
             
      
      }
         
         System.out.println("Letters in your name are: " + letters);
    }     

  }