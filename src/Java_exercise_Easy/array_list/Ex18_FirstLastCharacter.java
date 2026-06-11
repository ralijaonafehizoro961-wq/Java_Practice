package Java_exercise_Easy.array_list;

public class Ex18_FirstLastCharacter {
    public static void main(String[] args) {
        String chain = "Hello";
        char first = chain.charAt(0);
        char last = chain.charAt(chain.length() - 1);
        System.out.println("First character : " + first);
        System.out.println("Last character : " + last);
    }
}
