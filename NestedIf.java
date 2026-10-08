//easy
// import java.util.Scanner;

// public class NestedIf {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter age: ");
//         int age = sc.nextInt();

//         System.out.print("Do you have a ticket? (true/false): ");
//         boolean hasTicket = sc.nextBoolean();

//         if (age >= 18) {
//             if (hasTicket) {
//                 System.out.println("Entry Allowed!");
//             } else {
//                 System.out.println("Entry Denied: You need a ticket.");
//             }
//         } else {
//             System.out.println("Entry Denied: You must be at least 18 years old.");
//         }

//         sc.close();
//     }
// }


//medium

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark: ");
        int mark = sc.nextInt();

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        if (mark >= 40) {
            if (attendance >= 75.0) {
                System.out.println("Result: Passed and Eligible for Exam Certificate!");
            } else {
                System.out.println("Result: Passed, but Ineligible due to low attendance.");
            }
        } else {
            System.out.println("Result: Failed.");
        }

        sc.close();
    }
}


//hard

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter monthly salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter credit score: ");
        int creditScore = sc.nextInt();

        if (age >= 21) {
            if (salary >= 30000) {
                if (creditScore >= 700) {
                    System.out.println("Loan Approved!");
                } else {
                    System.out.println("Loan Rejected: Credit score must be at least 700.");
                }
            } else {
                System.out.println("Loan Rejected: Monthly salary must be at least 30,000.");
            }
        } else {
            System.out.println("Loan Rejected: Age must be at least 21.");
        }

        sc.close();
    }
}



