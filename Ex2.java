
package Arrays;


public class Ex2 {
    
    public static void main(String args[]){
        
        int[][] grades=new int[3][3];
        int[][] grades1={{2,4,5},{3,6,8},{2,6,4}};
        
        for(int i=0;i<grades1.length;i++){
            for(int j=0;j<grades1.length;j++){
                
                System.out.print(grades1[i][j]);
                 
            }
            
            System.out.println();
        }
     
        
    }
    
}
