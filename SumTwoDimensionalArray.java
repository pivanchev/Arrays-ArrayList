
package Arrays;
import java.util.Scanner;


public class SumTwoDimensionalArray {
    
    public static void main(String[] args) {
        int[][] arr=new int[5][5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter " + arr.length + " rows and " + arr[0].length + " columns: ");
        
        int total=0;
        for(int row=0;row<arr.length;row++){
            for(int column=0;column<arr[row].length;column++){
                arr[row][column]=sc.nextInt();
                total+=arr[row][column];
                
            }
            System.out.println(total);
        }
        
        System.out.println(total);
    }
    
}
