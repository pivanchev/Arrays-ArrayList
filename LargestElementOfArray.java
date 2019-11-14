
package Arrays;


public class LargestElementOfArray {
    public static void main(String[] args) {
        
        int[] arr=new int[]{3,5,7,2,88,4};
        
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
            
            
        }
        System.out.println(max);
    }
}
