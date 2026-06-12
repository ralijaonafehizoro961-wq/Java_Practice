package Java_exercise_Easy.methodes;

import java.util.Scanner;

public class Ex22_AbsoluteValue {
    public static int abs(int a){
        if (a > 0){
            return a;
        } else {
            return -a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int nb = sc.nextInt();
        int abs = abs(nb);
        System.out.println("The Absolute Value of " + nb + " is " + abs);
    }

}
