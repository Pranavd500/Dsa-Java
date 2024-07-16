// average
/*
 * import static java.lang.Float.sum;
 * import java.util.Scanner;
 * 
 * public class functions {
 * public static void main(String[] args) {
 * int n, count = 1;
 * float xF, averageF, sumF = 0;
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the value of n:");
 * n = sc.nextInt();
 * while (count <= n) {
 * System.out.println("Enter the" + count + "number");
 * xF = sc.nextInt();
 * sumF += xF;
 * ++count;
 * 
 * }
 * averageF = sumF / n;
 * System.out.println("the average sum of " + averageF);
 * 
 * }
 * 
 * }
 */

// print sum of all number odd number from 1 to n;
/*
 * import java.util.Scanner;
 * 
 * class Sum_odd_number {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the number of limit");
 * int l = input.nextInt();
 * int sum = 0;
 * for (int s = 1; s <= l; s++) {
 * if (s % 2 == 1)
 * sum = sum + s;
 * 
 * }
 * System.out.println("sum of the number:" + sum);
 * }
 * }
 */

// write a function which takes in 2 numbers and return ther greater of those
// two
/*
 * import java.util.Scanner;
 * 
 * public class functions {
 * public static void main(String[] args) {
 * int num1, num2, largest;
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the first number");
 * num1 = sc.nextInt();
 * System.out.println("enter the second umber:");
 * num2 = sc.nextInt();
 * if (num1 > num2)
 * largest = num1;
 * else
 * largest = num2;
 * System.out.println("\nLargest=" + largest);
 * }
 * }
 */

// Write a function that takes in the radius as input and returns the
// circumference of a circle.
/*
 * import java.util.Scanner;
 * 
 * public class functions {
 * public static void main(String[] args) {
 * int radius;
 * double circumference;
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the radiusof the circle:");
 * radius = sc.nextInt();
 * circumference = Math.PI * 2 * radius;
 * System.out.println("Circumfernce of the circle is" + circumference);
 * }
 * }
 */

// Write a function that takes in age as input and returns if that person is
// eligible to vote or not. A person of age > 18 is eligible to vote.
/*
 * import java.util.Scanner;
 * 
 * public class functions {
 * public static void main(String[] args) {
 * int age;
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter your age=");
 * age = sc.nextInt();
 * if (age >= 18) {
 * System.out.println("You are eligible for vote.");
 * } else {
 * System.out.println("You are not eligible for vote.");
 * }
 * }
 * }
 */

// Write an infinite loop using do while condition.
/*
 * class functions {
 * 
 * public static void main(String args[]) {
 * do {
 * System.out.println("Hello World");
 * } while (true);
 * }
 * }
 */

// Write a program to enter the numbers till the user wants and at the end it
// should display the count of positive, negative and zeros entered.
/*
 * import java.util.Scanner;
 * 
 * class functions {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * int c_pos = 0, c_neg = 0, c_zero = 0;
 * char choice;
 * do {
 * System.out.print("Enter the number ");
 * int number = input.nextInt();
 * 
 * if (number > 0) {
 * c_pos++;
 * } else if (number < 0) {
 * c_neg++;
 * } else {
 * c_zero++;
 * }
 * 
 * System.out.print("Do you want to Continue y/n? ");
 * choice = input.next().charAt(0);
 * 
 * } while (choice == 'y' || choice == 'Y');
 * 
 * System.out.println("Positive numbers: " + c_pos);
 * System.out.println("Negative numbers: " + c_neg);
 * System.out.println("Zero numbers: " + c_zero);
 * }
 * }
 */

// Two numbers are entered by the user, x and n. Write a function to find the
// value of one number raised to the power of another i.e. xn.
/*
 * public class functions {
 * public static void main(String[] args) {
 * int base = 2;
 * int exponent = 3;
 * int result = 1;
 * for (int i = 0; i < exponent; i++) {
 * result *= base;
 * }
 * System.out.println(base + " raised to the power of " + exponent + " is " +
 * result);
 * }
 * }
 */
// Write a function that calculates the Greatest Common Divisor of 2 numbers.
/*
 * public class functions {
 * public static void main(String[] args) {
 * // x and y are the numbers to find the GCF
 * int x = 12, y = 8, gcd = 1;
 * // running loop form 1 to the smallest of both numbers
 * for (int i = 1; i <= x && i <= y; i++) {
 * // returns true if both conditions are satisfied
 * if (x % i == 0 && y % i == 0)
 * // storing the variable i in the variable gcd
 * gcd = i;
 * }
 * // prints the gcd
 * System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
 * }
 * }
 */

//
// Write a program to print Fibonacci series of n terms where n is input by user
// :
// 0 1 1 2 3 5 8 13 21 .....
// In the Fibonacci series, a number is the sum of the previous 2 numbers that
// came before it.

// Java Program to print Fibonacci series
/*
 * import java.util.*;
 * 
 * public class functions {
 * public static void main(String[] args) {
 * // Take input from the user
 * // Create instance of the Scanner class
 * Scanner sc = new Scanner(System.in);
 * int t1 = 0, t2 = 1;
 * System.out.print("Enter the number of terms: ");
 * int n = sc.nextInt(); // Declare and Initialize the number of terms
 * System.out.println("First " + n + " terms of fibonnaci series: ");
 * // Print the fibonacci series
 * for (int i = 1; i <= n; ++i) {
 * System.out.print(t1 + " ");
 * int sum = t1 + t2;
 * t1 = t2;
 * t2 = sum;
 * }
 * }
 * }
 */