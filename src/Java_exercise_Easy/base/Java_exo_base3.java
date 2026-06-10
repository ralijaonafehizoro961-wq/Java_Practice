package Java_exercise_Easy.base;

import java.util.Scanner;

public class Java_exo_base3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer votre nom : ");
        String name = sc.nextLine();
        System.out.println("Bonjour " + name);
    }
}
