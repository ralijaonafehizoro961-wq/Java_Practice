package Java_exercise_Easy.methodes;

import java.util.Scanner;

public class Ex21_GreetingFunction {
    public static String hello(String name){
        return "Hello " + name;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your name : ");
        String name = sc.nextLine();
        System.out.println(hello(name));
    }
}
