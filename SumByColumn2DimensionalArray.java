
package Arrays;


public class SumByColumn2DimensionalArray {
    
    public static void main(String[] args) {
        
       int[][] arr=new int[5][6];
       
        for(int column=0;column<arr[0].length;column++){
            int total=0;
            for(int row=0;row<arr.length;row++){
            arr[row][column]=(int)(Math.random()*10);
            total+=arr[row][column];   
                
            }
           System.out.println("Sum for column " + column + " is " + total);
        }
  } 
}
