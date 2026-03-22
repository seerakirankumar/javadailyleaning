package javadailylearning;

import java.util.*;

public class Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //declaration of  a String
        String name="seera";
        System.out.println(name);

        // string concatenation
        String firstname = "seera";
        String lastname = "kiran kumar";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        //String length
        System.out.println(fullname.length());

        //substring()
        System.out.println(firstname.substring(2));

        //charAt()
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));

        }

        //comapare to
        String name1="rohitsharma";
        String name2="rohitsharma";

        if(name1.compareTo(name2)==0){
            System.out.println("two values are equal.");
        }else{
            System.out.println("two values are not equal.");
        }


    }

}
