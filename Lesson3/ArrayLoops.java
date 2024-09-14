package Lesson3;

public class ArrayLoops {

    public static void main(String[] args) {
        int[] x;

        x = new int[]{1, 2, 3, 4, 5};

        System.out.println(x[0]);

        int y = 1;

        if (y > 0) {
            System.out.println("Positive");
        } else {
            if (y == 0) {
                System.out.println("Zero");
            } else {
                System.out.println("Negative");
            }
        }


        System.out.println("-----------------------------------------------");

        String[] names = {"Anna", "Karen", "Marine", "Hayk", "Vazgen"};
        for (int i = names.length-1; i >= 0; i--) {
            System.out.println(names[i]);

        }

        System.out.println("Test");
        System.out.println("Test");
    }
}
