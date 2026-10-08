// /*Easy: Write a Java program to accept a student's mark and display the grade: 90 and above → A, 75 and above → B, 60 and above → C, Below 60 → D.*/

// import java.util.Scanner;
// public class ElseifLadder {
//     public static void main(String[] args){
        
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter mark: ");
//         int mark = sc.nextInt();

//         if (mark >= 90) {
//             System.out.println("Grade: A");
//         } else if (mark >= 75) {
//             System.out.println("Grade: B");
//         } else if (mark >= 60) {
//             System.out.println("Grade: C");
//         } else {
//             System.out.println("Grade: D");
//         }

//         sc.close();
//     }
// }
    
//medium

// import java.util.Scanner;

// public class ElseifLadder {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter mark: ");
//         int mark = sc.nextInt();

//         if (mark >= 90 && mark <= 100) {
//             System.out.println("Grade: A");
//         } else if (mark >= 75 && mark <= 89) {
//             System.out.println("Grade: B");
//         } else if (mark >= 60 && mark <= 74) {
//             System.out.println("Grade: C");
//         } else if (mark >= 40 && mark <= 59) {
//             System.out.println("Grade: D");
//         } else {
//             System.out.println("Grade: F");
//         }

//         sc.close();
//     }
// }


//hard

import java.util.Scanner;

public class ElseifLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        double bill = 0;

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = (100 * 1.5) + ((units - 100) * 2.5);
        } else if (units <= 300) {
            bill = (100 * 1.5) + (100 * 2.5) + ((units - 200) * 4.0);
        } else {
            bill = (100 * 1.5) + (100 * 2.5) + (100 * 4.0) + ((units - 300) * 6.0);
        }

        System.out.println("Total Electricity Bill: " + bill);

        sc.close();
    }
}