# javadailyleaning
# Java Daily Learning - Day 1

## Introduction to Java

Java is a popular **object-oriented programming language** used to build web applications, mobile apps, enterprise software, and desktop programs.
It was developed by **James Gosling at Sun Microsystems in 1995** and is now maintained by Oracle.

One of the main features of Java is **"Write Once, Run Anywhere" (WORA)**. This means Java programs can run on any system that has the **Java Virtual Machine (JVM)** installed.

Java is widely used because it is **secure, platform-independent, and easy to learn for beginners**.

---

## Topics Covered (Day 1)

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
# Day 2 – Conditional Statements in Java

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
