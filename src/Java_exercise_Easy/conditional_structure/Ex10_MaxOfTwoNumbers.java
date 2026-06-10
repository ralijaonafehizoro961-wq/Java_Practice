package Java_exercise_Easy.conditional_structure;

import java.util.Scanner;

public class Ex10_MaxOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int nb1,nb2;
        System.out.print("Enter a first number : ");
        nb1 = sc.nextInt();
        System.out.print("Enter a Second number : ");
        nb2 = sc.nextInt();
        if (nb1 < nb2){
            System.out.println("The maximum is " + nb2);
        }
        else {
            System.out.println("The maximum is " + nb1);
        }
    }
}
