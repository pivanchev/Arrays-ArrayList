/*
sum values of an array
*/

package Arrays;


public class SumOfArrayElements {
    
    public static void main(String args[]){
        
        int my_array[]={1,4,6,3,123,3};
        int sum=0;
        for(int i:my_array)
            sum+=i;
             
        System.out.println("The sum is: " + sum);
    }
    
}
