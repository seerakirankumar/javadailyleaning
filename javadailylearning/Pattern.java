package javadailylearning;

public class Pattern {

  public static void main(String[] args) {

    int m = 5;
    int n = 6;

    for(int i=1; i<=m ; i++){
    for(int j=1; j<=n; j++){
    System.out.print("*");

    }
    System.out.println();
    }

    }
    

    // printing hallow rectangle

    // int n = 10;
    // int m = 12;

    // for(int i=1; i<=n; i++ ){
    // for(int j=1; j<=m; j++){
    // if(i==1 || j==1 || i==10|| j==12){
    // System.out.print("*");
    // }
    // else{
    // System.out.print(" ");

    // }

    // }
    // System.out.println();

    // }

    // }
    // }

    // printing half pyramid

    // int n = 4;
    // for(int i = 1; i<=n; i++){
    // for(int j=1; j<=i;j++){
    // System.out.print("*");

    // }
    // System.out.println(" ");
    // }
    // //inverted half pyramid
    // int m = 4;
    // for(int i=m; i>=1; i--){
    // for(int j=1;j<=i;j++){
    // System.out.print("*");
    // }
    // System.out.println(" ");
    // }
    // }
    // }

    // inverted half pyramid (rotated by 180 degrees)

    // int t=4;
    // for(int i=1;i<=t;i++){
    // for(int j=i ;j<=t-1; j++){
    // System.out.print(" ");

    // }
    // for(int j=1;j<=i;j++){
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // }
    // }
    // printing the pattern (half pyramid with numbers)

    // int n = 5;
    // for(int i=1;i<=n;i++){
    // for(int j=1;j<=i;j++){
    // System.out.print(j+" ");
    // }
    // System.out.println();

    // }
    // }
    // }

    // //printing the inverted pattern

    // int a = 5;
    // for(int i=1;i<=a;i++){
    // for(int j=1;j<=a-i+1;j++){
    // System.out.print(j+ " ");

    // }
    // System.out.println();
    // }
    // }
    // }

    // printing the pattern (n=5)"floyd triangle"
    // int n=5;
    // int number=1;
    // for(int i=1;i<=n;i++){
    // for(int j=1;j<=i;j++){
    // System.err.print(number+" ");
    // number++;
    // }
    // System.out.println();
    // }

    // }
    // }

    // printing the pattern (0-1 triangle)

    // int y=5;
    // for(int i=1;i<=y;i++){
    // for(int j=1;j<=i;j++){
    // int sum =i+j;
    // if(sum%2 ==0){
    // System.out.print("1");
    // }else{
    // System.out.print("0");
    // }

    // }
    // System.out.println();
    // // }

    // // printing the pattern(butterfly pattern)

    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // int space = 2 * (n - i);
    // for (int j = 1; j <= space; j++) {
    // System.out.print(" ");

    // }
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();

    // }
    // for (int i = n; i >= 1; i--) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // int space = 2 * (n - i);
    // for (int j = 1; j <= space; j++) {
    // System.out.print(" ");

    // }
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();

    // }

    // // printin the pattern n=5(solid rhombus)

    // int x = 5;
    // for (int i = 1; i <= x; i++) {
    // for (int j = 1; j <=x - i; j++) {//for printing the spaces
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= x; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // }
    // }

    // printing the pattern(number pyramid)

    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    //   for (int j = 1; j <= n - i; j++) {
    //     System.out.print(" ");
    //   }

    //   for (int j = 1; j <= i; j++) {
    //     System.out.print(i + " ");
    //   }
    //   System.out.println();
    // }

    // print the pattern(palindromic pattern)

    // int m = 6;
    // for (int i = 1; i <= m; i++) {
    //   for (int j = 1; j <= m - i; j++) {
    //     System.out.print(" ");
    //   }
    //   for (int j = i; j >= 1; j--) {
    //     System.out.print(j);
    //   }
    //   for (int j = 2; j <= i; j++) {
    //     System.out.print(j);
    //   }
    //   System.out.println();
    // }

    // printing the pattern(diamond pattern)

  //   int k = 4;
  //   for (int i = 1; i <= k; i++) {
  //     for (int j = 1; j <= k - i; j++) {
  //       System.out.print(" ");
  //     }
  //     for (int j = 1; j <= 2 * i - 1; j++) {
  //       System.out.print("*");
  //     }
  //     System.out.println();
  //   }
  //   for (int i = k; i >= 1; i--) {
  //     for (int j = 1; j <= k - i; j++) {
  //       System.out.print(" ");
  //     }
  //     for (int j = 1; j <= 2 * i - 1; j++) {
  //       System.out.print("*");
  //     }
  //     System.out.println();
  //   }
  // }
  }