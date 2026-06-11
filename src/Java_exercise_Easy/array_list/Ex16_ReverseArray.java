package Java_exercise_Easy.array_list;

public class Ex16_ReverseArray {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5};
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.print(tab[i] + " ");
        }
    }
}
