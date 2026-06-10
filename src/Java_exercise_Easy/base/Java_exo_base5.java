package Java_exercise_Easy.base;

import java.util.Scanner;

public class Java_exo_base5 {
    public static void main(String[] args) {
        System.out.println("Convertiseur de euros en dollars !");
        double eur, usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer la valeur en euros : ");
        eur = sc.nextDouble();
        usd = eur * 1.10;
        System.out.println(eur + "€ = " + usd + "$");
    }
}
