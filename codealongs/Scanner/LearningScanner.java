package codealongs.Scanner;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int myNumber;
        System.out.println("Please input a number!");
   
        myNumber = sc.nextInt();
        System.out.println("input ave salary");
        double avgSalary = sc.nextDouble();

        System.out.println("Input number is " + myNumber);
        System.out.println(avgSalary);
    }
    
}
