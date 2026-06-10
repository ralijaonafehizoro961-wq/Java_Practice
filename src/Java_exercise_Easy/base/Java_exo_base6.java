package Java_exercise_Easy.base;

import java.util.Scanner;

public class Java_exo_base6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Long, Large, per;
        System.out.print("Entrer la longueur du rectangle : ");
        Long = sc.nextDouble();
        System.out.print("Entrer la largeur du rectangle : ");
        Large = sc.nextDouble();
        per = (Long + Large) * 2;
        System.out.println("""
                Information du rectangle:
                Longueur : """ + Long + """
                
                Largeur : """ + Large + """
                
                Perimetre : """ + per + """
        """);
    }
}
