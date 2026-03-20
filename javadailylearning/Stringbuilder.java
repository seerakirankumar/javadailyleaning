package javadailylearning;
import java.util.*;


public class Stringbuilder {
    public static void main(String args[]){
         // declaration of string builder
        StringBuilder sb = new StringBuilder("hello");


        //get a character from index
        System.out.println(sb.charAt(0));

        //set a charcter at index
        sb.setCharAt(2, 'k');
        System.out.println(sb);
        //insert a Charcter at Some Index
        sb.insert(0,'y');
        System.out.println(sb);
        
        //reversing a string
        for(int i=0;i<sb.length()/2;i++){
            int  front=i;
            int back=sb.length()-1-i;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front,backchar);
            sb.setCharAt(back, frontchar);
   
    
        }
        System.out.println(sb);
        //


    }
    
}
