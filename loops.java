//hello world for loop

/*class loops {
    public static void main(String[] args)

    {
        for (int counter = 0; counter < 100; counter = counter + 1) {
            System.out.println("Hello World");
        }

    }
}*/

//for loop 1 to 10 

/*class loops {
    public static void main(String[] args) {
        for (int counter = 0; counter < 11; counter++) {
            System.out.println(counter + " ");
        }
    }
}*/

// while loop

/* 
class loops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 11) {
            System.out.println(i);
            i = i + 1;
        }
    }
} */

// do while loop
/* 
class loops {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i = i + 1;

        } while (i < 11);
    }
}
*/

//sum using for loop

/* 
import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }

} */

//multiplication using loops

import java.util.Scanner;

class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i * n);
        }

    }
}