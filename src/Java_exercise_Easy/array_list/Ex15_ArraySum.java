package Java_exercise_Easy.array_list;

public class Ex15_ArraySum {
    public static void main(String[] args) {
        int[] tab = {1,5,30,4,86,12,52};
        int sum = 0;
        for (int i : tab){
            sum += i;
        }
        System.out.println("Sum : " + sum);
    }
}
