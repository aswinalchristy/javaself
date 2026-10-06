

// /*Easy: Write a Java program to accept a number and check whether the number is positive using an if statement. */
// import java.util.Scanner;
// public class IfStatement {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter a number");
//         int a=sc.nextInt();

//         if(a>0){
//             System.out.println("Positive");
//         }
//         sc.close();
//     }
    
// }


/*Medium: Write a Java program to accept a person's age and display "Eligible for driving" if the age is 18 or above using an if statement. */


// import java.util.Scanner;
// public class IfStatement{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter your age");
//         int age=sc.nextInt();

//         if(age>=18){
//             System.out.println("Eligible for driving");
//         }
//         sc.close();
//     }
// }


/*Hard: Write a Java program to accept a student's mark and display "Distinction" if the mark is 75 or above using only an if statement. */


import java.util.Scanner;

public class IfStatement{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter your mark");
    int mark=sc.nextInt();

    if(mark>=75){
        System.out.println("Distinction");
    }
    sc.close();
}
}