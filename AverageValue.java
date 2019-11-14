/*
average value of array elements
*/
package Arrays;


public class AverageValue {
    
    public static void main(String args[]){
        
        int[] values = new int[]{23,44,50,68,44,26};
        int sum=0;
        
        for(int i=0;i<values.length;i++)
            sum+=sum+values[i];
            double average=sum/values.length;
            
            System.out.println("Average value of the arrey is: " + average);
        
        
    
    }      
}
