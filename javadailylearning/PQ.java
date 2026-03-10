package javadailylearning;
import java.util.*;

// //PQ day 2
 public class PQ{
    public void main(String[] args) {
    Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b =sc.nextInt();

      int operation = sc.nextInt();

      switch(operation){
         case 1 : System.out.println(a+b);
         break;

         case 2 : System.out.println(a-b);
         break;

         case 3 : System.out.println(a*b);
         break;

         case 4 :System.out.println(a/b);
         break;

         case 5 :System.out.println(a%b);
         break;

         default:System.out.println("invalid cradentials");
   

      }
   }
}

//printing the months 1-12
public class PQ{
    public void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    int month = sc.nextInt();
    switch(month){

        case 1 :System.out.println("january");
        break;
         case 2 :System.out.println("feb");
        break;
         case 3 :System.out.println("march");
        break;
         case 4 :System.out.println("april");
        break;
         case  5:System.out.println("may");
        break;
         case 6:System.out.println("june");
        break;
         case 7 :System.out.println("july");
        break;
         case 8 :System.out.println("aug");
        break;
         case 9 :System.out.println("sep");
        break;

         case 10 :System.out.println("oct");
        break;
         case 11:System.out.println("nov");
        break;
         case 12:System.out.println("dec");
        break;
         
        default:System.out.println("invalid month number entered");
    

    }

// //DAY 3 PQ

// //using loops(printing the first n even numbers)
//  package javadailylearning;


// import java.util.*;

public class PQ{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();



    for(int i=0; i<n; i++){

        if(i%2 == 0){
            System.out.println(i + " ");

        }
    }
   }
}

// //
   
// // make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// /*  If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.
// (Hint : use do-while loop but think & understand why)*/

public class PQ{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int input = sc.nextInt();

if(input == 1){
    System.out.println("Enter your marks :");
    int marks = sc.nextInt();

    if(marks >= 90){
        System.out.println("This is Good");
    }
    else if(marks >=60 && marks<=80){
        System.out.println("this is also good");

    }
    else if(marks >= 0 && marks<= 59){
        System.out.println("this good as well");
    }
    else{
        System.out.println("you enterd invalid marks !! renter the correct marks");
    }

if(input != 0){
    System.out.println("your not able to check the marks");
}

}
}
}

