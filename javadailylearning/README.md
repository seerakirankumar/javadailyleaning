# javadailyleaning


## Introduction to Java

Java is a popular **object-oriented programming language** used to build web applications, mobile apps, enterprise software, and desktop programs.
It was developed by **James Gosling at Sun Microsystems in 1995** and is now maintained by Oracle.

One of the main features of Java is **"Write Once, Run Anywhere" (WORA)**. This means Java programs can run on any system that has the **Java Virtual Machine (JVM)** installed.

Java is widely used because it is **secure, platform-independent, and easy to learn for beginners**.

---

## Topics Covered 

* What is Java
* History of Java
* Features of Java
* Installing JDK
* Writing the first Java program
* Understanding the basic structure of a Java program

---

## First Java Program

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

### Explanation

* `public class Main` → Defines the class.
* `main()` → Entry point of the Java program.
* `System.out.println()` → Used to print output on the console.

---

## Output

```
Hello, Java!
```

---

## Conclusion

On Day 1, I learned the **basic introduction to Java**, how to install Java, and how to write and run a simple Java program.


## Introduction

Conditional statements in Java are used to make decisions in a program. They allow the program to execute different blocks of code depending on whether a specified condition is **true** or **false**.

These statements help in controlling the flow of execution and are commonly used in real-world programs such as grading systems, login verification, and menu selection.

---

## Types of Conditional Statements in Java

### 1. if Statement

The `if` statement is used to execute a block of code only when a condition is true.

**Syntax**

```java
if(condition){
    // code to execute
}
```

**Example**

```java
int age = 20;

if(age >= 18){
    System.out.println("You are eligible to vote");
}
```

---

### 2. if-else Statement

The `if-else` statement is used when there are two possible outcomes. If the condition is true, one block runs; otherwise another block runs.

**Syntax**

```java
if(condition){
    // code if condition is true
}else{
    // code if condition is false
}
```

**Example**

```java
int marks = 40;

if(marks >= 35){
    System.out.println("Pass");
}else{
    System.out.println("Fail");
}
```

---

### 3. else-if Ladder

The `else-if` ladder is used when there are multiple conditions to check.

**Example**

```java
int marks = 75;

if(marks >= 90){
    System.out.println("Grade A");
}else if(marks >= 75){
    System.out.println("Grade B");
}else if(marks >= 50){
    System.out.println("Grade C");
}else{
    System.out.println("Fail");
}
```

---

### 4. switch Statement

The `switch` statement is used to select one block of code from multiple options based on a variable value.

**Example**

```java
int day = 1;

switch(day){
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

---

## Advantages of Conditional Statements

* Helps in **decision making** in programs.
* Improves **program control flow**.
* Makes programs **dynamic and interactive**.
* Used in many real-world applications such as **grading systems, login systems, and menu-driven programs**.

---

## Conclusion

Conditional statements are an important part of Java programming. They allow developers to control the program's behavior based on conditions and are essential for building logical and interactive applications.
Looping Statements in Java
Introduction

Looping statements in Java are used to execute a block of code repeatedly until a specific condition is satisfied. They help reduce code repetition and make programs more efficient.

Java provides several types of loops that allow developers to perform repetitive tasks easily.

Types of Looping Statements in Java
1. for Loop

The for loop is used when the number of iterations is known in advance.

Syntax

for(initialization; condition; update){
    // code to execute
}

Example

for(int i = 0; i < 5; i++){
    System.out.println(i);
}

Explanation

Initialization: int i = 0

Condition: i < 5

Update: i++

The loop runs until the condition becomes false.

2. while Loop

The while loop executes a block of code as long as the condition is true.

Syntax

while(condition){
    // code
}

Example

int i = 0;

while(i < 5){
    System.out.println(i);
    i++;
}

Explanation

The condition is checked before execution of the loop body.

If the condition is false initially, the loop will not execute.

3. do-while Loop

The do-while loop executes the code block at least once, even if the condition is false.

Syntax

do{
    // code
}while(condition);

Example

int i = 0;

do{
    System.out.println(i);
    i++;
}while(i < 5);

Explanation

The loop body runs first.

The condition is checked after execution.

Loop Control Statements
break

The break statement is used to terminate the loop immediately.

Example

for(int i = 0; i < 5; i++){
    if(i == 3){
        break;
    }
    System.out.println(i);
}
continue

The continue statement skips the current iteration and moves to the next iteration.

Example

for(int i = 0; i < 5; i++){
    if(i == 2){
        continue;
    }
    System.out.println(i);
}
Conclusion

Looping statements in Java are essential for performing repetitive tasks efficiently. The three main loops — for, while, and do-while — help programmers control program flow and reduce redundant code.

If you want, I can also give a more professional GitHub README version (with emojis, formatting, and examples) that looks better in repositories.

//PATTERN PRINTING (*)

Half Pyramid Pattern

A Half Pyramid Pattern prints stars (*) in the shape of a right-angled triangle.
The number of stars increases in each row.

Example Output
*
* *
* * *
* * * *
* * * * *
Logic

Use an outer loop to control the number of rows.

Use an inner loop to print stars in each row.

For every row i, print i stars.

Java Code
public class HalfPyramid {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
Time Complexity

O(n²)

2. Reversed Half Pyramid Pattern

A Reversed Half Pyramid Pattern prints stars in decreasing order.
The number of stars decreases in each row.

Example Output
* * * * *
* * * *
* * *
* *
*
Logic

The outer loop controls rows.

The inner loop prints stars.

For every row i, print n - i + 1 stars.

Java Code
public class ReverseHalfPyramid {
    public static void main(String[] args) {
        int n = 5;

        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
Time Complexity

O(n²)

//
Java Daily Practice – Today’s Progress

Today I practiced several basic Java programming problems to improve my understanding of logic building, loops, conditions, and string manipulation. These exercises helped me strengthen my problem-solving skills and coding confidence.

✅ Topics Practiced

ASCII Values – Learned how to work with character encoding and convert characters to their ASCII values.

Department Details Program – Practiced handling input and displaying structured information.

IPL Finals Problem – Worked with conditional statements and logical comparisons.

ASCII Art – Used loops and print statements to generate patterns and shapes.

Form the Table – Implemented loops to generate multiplication tables.

Formation Programs – Practiced pattern logic and nested loops.

Sum of Two Numbers – Implemented basic arithmetic operations with user input.

Simple Calculator – Built a basic calculator using conditional statements.

Concatenate Two Strings – Learned how to combine strings in Java.

Convert Minutes – Practiced mathematical conversions and output formatting.

🚀 What I Learned

Improved understanding of Java syntax and basic programming concepts.

Strengthened logical thinking and problem-solving skills.

Gained more confidence in using loops, conditions, and user input handling.

📌 Consistent daily practice is helping me build a strong foundation in Java programming.


//The 0-1 Triangle prints a triangular pattern using only 0s and 1s.

The value printed depends on the sum of row and column indices:

If (row + column) is even → print 1

If (row + column) is odd → print 0

For n = 5, the output will be:

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1



//The 0-1 Triangle prints a triangular pattern using only 0s and 1s.

The value printed depends on the sum of row and column indices:

If (row + column) is even → print 1

If (row + column) is odd → print 0

For n = 5, the output will be:

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
//13-03-2026
1. Number Pyramid Pattern

The Number Pyramid Pattern prints numbers in a pyramid shape.
Each row prints the same number multiple times, and spaces are used to align the pyramid.

Example Output:

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5


Concepts used:

Nested for loops

Space formatting

Basic pattern logic

2. Palindromic Number Pattern

The Palindromic Pattern prints numbers in a pyramid where the numbers read the same forward and backward.

Example Output:

     1
    212
   32123
  4321234
 543212345
65432123456


Concepts used:

Nested loops

Reverse and forward printing

Palindrome logic

3. Diamond Star Pattern

The Diamond Pattern prints stars (*) in the shape of a diamond.
It is created by combining an upper pyramid and a lower inverted pyramid.

Example Output:

   *
  ***
 *****
*******
*******
 *****
  ***
   *


Concepts used:

Nested loops

Space alignment

Pyramid and inverted pyramid patterns

Conclusion

These pattern programs help beginners practice:

Loops

Nested loops

Logic building in Java

Practicing pattern problems improves coding skills and logical thinking.

<<<<<<<<<<Functions in Java>>>>>>>>>>

A function (method) in Java is a block of code that performs a specific task. It helps make the program organized, reusable, and easier to understand.

Instead of writing the same code multiple times, we can create a function and call it whenever needed.

Syntax
returnType functionName(parameters) {
    // code
}
Example
public class Example {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println(result);
    }
}
<<<<<<<<<<<<<<<<Time Complexity>>>>>>>>>>>>>>>>>>>

Time Complexity describes how the running time of an algorithm increases as the input size grows.
It is usually expressed using Big-O notation.

Example:

for(int i = 0; i < n; i++) {
    System.out.println(i);
}

Time Complexity: O(n)

<<<<<<<<<<<<<<Space Complexity>>>>>>>>>>>>>>>>>>

Space Complexity measures the amount of memory used by an algorithm.

Example:

int sum = 0;
for(int i = 0; i < n; i++) {
    sum += i;
}

Space Complexity: O(1) (constant memory)


<<<<<<<<<<<<ARRAYS IN JAVA>>>>>>>>>>>>

Arrays in Programming
📌 What is an Array?

An array is a data structure used to store multiple values of the same data type in a single variable.
Instead of creating separate variables, arrays help organize data efficiently.

🔹 Example (Java)
int[] numbers = {10, 20, 30, 40, 50};
System.out.println(numbers[0]); // Output: 10
🔹 Key Features

Stores multiple elements in one variable

Elements are accessed using index (0-based)

Fixed size (in most languages like Java)

Faster access using index
<<<<<2D Arrays in Java>>>>>

A 2D array (two-dimensional array) in Java is used to store data in a tabular form (rows and columns). It is also called a matrix.

🧠 Declaration
int[][] arr;
🏗️ Initialization
int[][] arr = new int[3][3]; // 3 rows and 3 columns
✍️ Initialization with Values
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
🔄 Accessing Elements
System.out.println(arr[0][1]); // Output: 2

First index → Row

Second index → Column

🔁 Traversing 2D Array
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}


📌 Java Strings – Basic Concepts
🔹 What is a String?

A String in Java is used to store text. It is a sequence of characters like names, sentences, or any textual data.

🔹 String Initialization

Strings are created by assigning text values. They are widely used to store user input, names, and messages in programs.


🔹 String Concatenation

Concatenation means joining multiple strings into one.
It is commonly used to combine first name and last name into a full name.

🔹 String Length

The length of a string tells how many characters it contains, including spaces.
This is useful when you need to loop through a string or validate input size.

🔹 Substring

A substring is a part of a string.
It allows you to extract specific portions of text from a larger string.

🔹 charAt()

This is used to access a single character from a string at a specific position.
It is helpful when processing strings character by character.

🔹 compareTo()

This method is used to compare two strings:

If both are equal → result is 0

If not equal → result is positive or negative

It is useful for sorting and checking equality.

🔹 Looping Through a String

You can go through each character of a string one by one.
This is useful for tasks like counting characters, checking patterns, or modifying text.

✅ Summary

Strings are used to store text data

Concatenation joins strings

Length gives total characters

Substring extracts parts of text

charAt accesses individual characters

compareTo compares two strings