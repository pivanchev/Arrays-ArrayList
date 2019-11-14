
package Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayList1 {
    
    public static void main(String args[]){
        
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(223);
        numbers.add(13);
        numbers.add( 33);
        numbers.add(23);
        numbers.add(15);
        
        System.out.println("Before sorting: " + numbers);
        
        Collections.sort(numbers);
        
        System.out.println("After sorting: " + numbers);
        
        numbers.remove(3);
        
        System.out.println("After removing 3rd element: " + numbers);
            
        
        }
          
    }
    

