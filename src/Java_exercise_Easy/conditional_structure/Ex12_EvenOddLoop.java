package Java_exercise_Easy.conditional_structure;

public class Ex12_EvenOddLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0){
                System.out.println(i + " - number even");
            } else {
                System.out.println(i + " - number odd");
            }
        }
    }
}
