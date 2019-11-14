/*
 reverse an array
 */
package Arrays;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;


public class InverseArray {
    
        public static void main(String args[]){    
        
        int[]numbers=new int[]{1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};
        
        for(int i=numbers.length-1;i>=0;i--){
                System.out.print(" " + numbers[i]);
        
        
        }        
  }      
}
