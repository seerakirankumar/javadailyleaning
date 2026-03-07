package javadailylearning;

// public class Pattern {

//     public static void main(String[] args){
 
//     int m = 5;
//     int n = 6;

//     for(int i=1; i<=m ; i++){
//         for(int j=1; j<=n; j++){
//             System.out.print("*");

//         }
//         System.out.println();
//     }

// }
// }
    

//printing hallow rectangle
public class Pattern {

    public static void main(String[] args){

        int n = 10;
        int m = 12;

        for(int i=1; i<=n; i++ ){
            for(int j=1; j<=m; j++){
                if(i==1 || j==1 || i==10|| j==12){
                    System.out.print("*");
            }
            else{
                System.out.print(" ");
                
            }
           
            }
           System.out.println();

           
        }
 
    
    }
}