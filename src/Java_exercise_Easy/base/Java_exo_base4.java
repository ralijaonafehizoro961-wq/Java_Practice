package Java_exercise_Easy.base;

import java.util.Scanner;

public class Java_exo_base4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 , n2, somme;
        System.out.print("Entrer a : ");
        n1 = sc.nextInt();
        System.out.print("Entrer b : ");
        n2 = sc.nextInt();
        somme = n1 + n2;
        System.out.println("Somme " + n1 + " + " + n2 + " = " + somme);
    }
}
