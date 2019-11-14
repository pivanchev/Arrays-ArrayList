/*
 adding a value 
 */
package Arrays;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;


public class Ex9 {
    
        public static void main(String args[]){    
        
        int[]numbers=new int[]{2,3,4,5,3,6,7};
        
        System.out.println("Original array size: " + numbers.length);
        System.out.println("Contents: " + Arrays.toString(numbers));
        
        numbers=ArrayUtils.add(numbers,2, 3);
        
        
        System.out.println("Size of the array after removing element: " + numbers.length);
        System.out.println("Contens after adding element: " + Arrays.toString(numbers));
        }
}
