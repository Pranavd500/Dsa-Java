// print number in array
/* 
import java.util.*;

public class array {
    public static void main(String args[]) {
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 68;
        marks[2] = 91;
        for (int i = 0; i <= 3; i++) {
            System.out.println(marks[i]);
        }
    }

}
*/
//print number in way user ask for number

import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
