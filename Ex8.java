/*
remove a specific value
 */

package Arrays;
import java.lang.Object;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;





public class Ex8 {
    
    public static void main(String args[]){    
        
        int[]numbers=new int[]{2,3,4,5,3,6,7};
        
        System.out.println("Original array size: " + numbers.length);
        System.out.println("Contents: " + Arrays.toString(numbers));
        
        numbers=ArrayUtils.remove(numbers,1);
        
        System.out.println("Size of the array after removing element: " + numbers.length);
        System.out.println("Contens after removing element: " + Arrays.toString(numbers));
        
        
        
    }
}