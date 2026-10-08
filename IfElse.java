// /*Easy: Write a Java program to accept a number and check whether it is even or odd using an if-else statement.*/

// import java.util.Scanner;

// public class IfElse {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//         System.out.println("enter value");
//         int num =sc.nextInt();

//         if(num%2==0){
//             System.out.println("EVEN");
//         }else{
//             System.out.println("ODD");
//         }
//         sc.close();
//     }
// }


/*Medium: Write a Java program to accept a student's mark and display "Pass" if the mark is 40 or above; otherwise display "Fail". */

// import java.util.Scanner;

// public class IfElse {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
         
//         System.out.println("enter your mark");
//         int mark=sc.nextInt();

//         if(mark>=40){
//             System.out.println("PASS");
//         }else{
//             System.out.println("FAIL");
//         }
//         sc.close();
        
//     }
// }


/*Hard: Write a Java program to accept a person's age and check whether the person is eligible or not eligible to vote using if-else. */

import java.util.Scanner;

 public class IfElse {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

        System.out.println("enter your age");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
        sc.close();
    }
}