
package Arrays;

public class Ex1 {
    
    static byte[] grades=new byte[5];
    
    public static void main(String args[]){
        grades[0]=75;
        grades[1]=50;
        grades[2]=55;
        grades[3]=0;
        grades[4]=92;
        
        for(int i=0;i<grades.length;i++){
            System.out.println(grades[i]);
        }
       // System.out.println(grades[0]);
    }
    
    
}