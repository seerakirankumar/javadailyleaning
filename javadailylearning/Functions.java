
package javadailylearning;
import java.util.*;
public class Functions {
    



    
    // public static void sumOfTwoNumbers(int a,int b){
    //     int sum = a+b;
    //     System.out.println(sum);
    //     return ;

        
    //     }
    //     public static void main(String[] args){
    //         Scanner sc = new Scanner(System.in);
    //         int a= sc.nextInt();
    //         int b=sc.nextInt();

    //        sumOfTwoNumbers(a, b);


    // average of three numbers

    // public static int avgOfThreeNumbers(int a,int b,int c){
    //     int avg = a+b+c/3;
    //     System.out.println(avg);
    //     return avg;
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     int c=sc.nextInt();
    //     int avg = avgOfThreeNumbers(a,b,c);
    //     System.out.println("average of three numbers: "+avg);
    // }
    

    //using function printing 1 to n odd numbers
     public static void noOfOddNumbers(int a){
    
        for(int i=1;i<=a;i++){
            if(i%2!=0){
                System.out.println(i);
                return ; 
            }

        }

     }
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int b= sc.nextInt();
        noOfOddNumbers(b);

    
            
        }}

    


    

