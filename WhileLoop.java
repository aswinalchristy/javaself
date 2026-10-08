//easy 

// public class WhileLoop {
//     public static void main(String[] args) {
//         int i = 1;

//         while (i <= 10) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }

//medium

// import java.util.Scanner;

// public class WhileLoop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter N: ");
//         int n = sc.nextInt();

//         int sum = 0;
//         int i = 1;

//         while (i <= n) {
//             sum = sum + i;
//             i++;
//         }

//         System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);

//         sc.close();
//     }
// }


//hard

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        System.out.println("Sum of digits of " + num + " is: " + sum);

        sc.close();
    }
}