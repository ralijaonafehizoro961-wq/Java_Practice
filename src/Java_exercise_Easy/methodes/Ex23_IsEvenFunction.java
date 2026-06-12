package Java_exercise_Easy.methodes;

import java.util.Scanner;

public class Ex23_IsEvenFunction {
    public static String IsEven(int a){
        if (a % 2 == 0) {
            return a + " is a number Even";
        } else{
            return a + " is not number Even";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int nb = sc.nextInt();
        System.out.println(IsEven(nb));
    }
}
