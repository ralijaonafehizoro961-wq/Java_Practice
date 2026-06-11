package Java_exercise_Easy.methodes;

import java.util.Scanner;

public class Ex19_SquareFunction {
    public static int square(int a){
        return a * a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        int sq = square(x);
        System.out.println("Square " + x + " = " + sq);
    }
}
