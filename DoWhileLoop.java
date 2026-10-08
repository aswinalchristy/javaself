//easy

// public class DoWhileLoop {
//     public static void main(String[] args) {
//         int i = 1;

//         do {
//             System.out.println(i);
//             i++;
//         } while (i <= 5);
//     }
// }


//medium

// import java.util.Scanner;

// public class DoWhileLoop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num;
//         int sum = 0;

//         do {
//             System.out.print("Enter a number (0 to stop): ");
//             num = sc.nextInt();
//             sum = sum + num;
//         } while (num != 0);

//         System.out.println("Total Sum: " + sum);

//         sc.close();
//     }
// }

//hard


import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- CALCULATOR MENU ---");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Result: " + (num1 / num2));
                        } else {
                            System.out.println("Cannot divide by zero!");
                        }
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Exiting calculator... Goodbye!");
            } else {
                System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}