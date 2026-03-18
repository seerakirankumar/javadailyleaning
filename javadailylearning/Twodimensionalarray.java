package javadailylearning;
import java.util.*;

public class Twodimensionalarray{
public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int row =sc.nextInt();
    int cols=sc.nextInt();
    
    int matrix[][]= new int[row][cols];
    for(int i=0;i<row;i++){
        for(int j=0;j<cols;j++){
            matrix[i][j]=sc.nextInt();

        }

    }
    int x=sc.nextInt();
    for(int i=0;i<row;i++){
        for(int j=0;j<cols;j++){
            if(matrix[i][j]==x){
                System.out.print("X found at the location ("+i+","+j+")");
            }
          
        }
        System.out.println();
    }
    
}
    
}
