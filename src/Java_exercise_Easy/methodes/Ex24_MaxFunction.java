package Java_exercise_Easy.methodes;

import java.util.Scanner;

public class Ex24_MaxFunction {
    public static String max(int a, int b){
        if (a > b) {
            return "The maximum is : " + a;
        } else {
            return "The maximum is : " + b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int nb1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int nb2 = sc.nextInt();
        System.out.println(max(nb1,nb2));
    }
}
