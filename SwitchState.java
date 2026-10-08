//easy
// import java.util.Scanner;

// public class SwitchState {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter day number (1-7): ");
//         int day = sc.nextInt();

//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid day number! Please enter 1 to 7.");
//         }

//         sc.close();
//     }
// }

//medium


// import java.util.Scanner;

// public class SwitchState {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         double num1 = sc.nextDouble();

//         System.out.print("Enter an operator (+, -, *, /): ");
//         char operator = sc.next().charAt(0);

//         System.out.print("Enter second number: ");
//         double num2 = sc.nextDouble();

//         switch (operator) {
//             case '+':
//                 System.out.println("Result: " + (num1 + num2));
//                 break;
//             case '-':
//                 System.out.println("Result: " + (num1 - num2));
//                 break;
//             case '*':
//                 System.out.println("Result: " + (num1 * num2));
//                 break;
//             case '/':
//                 if (num2 != 0) {
//                     System.out.println("Result: " + (num1 / num2));
//                 } else {
//                     System.out.println("Cannot divide by zero!");
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid operator!");
//         }

//         sc.close();
//     }
// }


//hard

import java.util.Scanner;

public class SwitchState {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------ MENU ------");
        System.out.println("1. Check Positive or Negative");
        System.out.println("2. Check Even or Odd");
        System.out.println("3. Find Square of a Number");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int num1 = sc.nextInt();
                if (num1 >= 0) {
                    System.out.println(num1 + " is Positive.");
                } else {
                    System.out.println(num1 + " is Negative.");
                }
                break;

            case 2:
                System.out.print("Enter a number: ");
                int num2 = sc.nextInt();
                if (num2 % 2 == 0) {
                    System.out.println(num2 + " is Even.");
                } else {
                    System.out.println(num2 + " is Odd.");
                }
                break;

            case 3:
                System.out.print("Enter a number: ");
                int num3 = sc.nextInt();
                System.out.println("Square of " + num3 + " is " + (num3 * num3));
                break;

            case 4:
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}