package javadailylearning;

 public class Pattern {

    public static void main(String[] args){
 
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


//         int n = 10;
//         int m = 12;

//         for(int i=1; i<=n; i++ ){
//             for(int j=1; j<=m; j++){
//                 if(i==1 || j==1 || i==10|| j==12){
//                     System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
                
//             }
           
//             }
//            System.out.println();

           
//         }
 
    
//     }
// }

//printing  half pyramid

//     int n = 4;
//     for(int i = 1; i<=n; i++){
//       for(int j=1; j<=i;j++){
//         System.out.print("*");


//       }
//       System.out.println(" ");
//     }
// //inverted half pyramid
//     int m = 4;
//     for(int i=m; i>=1; i--){
//       for(int j=1;j<=i;j++){
//         System.out.print("*");
//       }
//       System.out.println(" ");
//     }
//    }
// }

//inverted half pyramid (rotated by 180 degrees)

int t=4;
for(int i=1;i<=t;i++){
  for(int j=i ;j<=t-1; j++){
    System.out.print(" ");

  }
  for(int j=1;j<=i;j++){
    System.out.print("*");
  }
  System.out.println();
}
 
    }
  }