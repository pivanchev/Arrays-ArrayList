
package Arrays;
import java.util.Arrays;
import java.lang.Math;



public class ArrayRandomNumberTo100 {
    
    public static void main(String args[]){
        
        double[] list=new double[100];
      
        for(int i=0;i<list.length;i++){
            list[i]=Math.random()*100;
        }
        for(int i=0;i<list.length;i++){
            System.out.println(list[i] + " ");
        }
        
    } 
}
