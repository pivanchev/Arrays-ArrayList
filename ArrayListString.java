
package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListString {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String userWord;
        ArrayList<String> words=new ArrayList<String>();
        System.out.println("Enter word: ");
        userWord=sc.nextLine();
        
        while(!userWord.equals("stop")){
            words.add(userWord);
            
             System.out.println("Enter word: ");
             userWord=sc.nextLine();
            
        }
    }     
}
