package Lesson4;

import java.sql.SQLOutput;

public class Lesson4 {
    public static void main(String[] args) {
        System.out.println(" 1. Print numbers from 1 to 15");
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n 2. Print even numbers from 1 to 20");
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n 3. Print * symbols using given numbers");
        int n = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\n\n 4. Print * symbols using given numbers");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\n\n 5. Create an array with number 1-11");
        int[] array = new int[11];
        for (int i = 0, k = 1; i < array.length; i++, k++) {
            array[i] = k;
            System.out.print(k + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }


        System.out.println("\n\n 6. Create an array with even numbers form -10 to 10");
        int[] a = new int[11];
        int k = -10;
        for (int i = 0; i < a.length; i++) {
            a[i] = k;
            System.out.print(a[i] + " ");
            k += 2;

        }


        System.out.println("\n\n 7. Given an array. print count of odd element");
        int[] b = {0, 1, 2, 5, 67, 8, 7, 9, -9};
        int oddCount = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 != 0) {
                System.out.print(b[i] + " ");
                oddCount++;
            }
        }
        System.out.println("\nCount of odd numbers: " + oddCount);


        System.out.println("\n\n 8. Given an array. print elements from -10 to 5");
        for (int i : b) {
            if (i >= -10 && i <= 5) {
                System.out.print(i + " ");
            }
        }


        System.out.println("\n\n 9. Given an array. print elements which can be divided  3 or 4");
        for (int i : b) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\n 10. Given an array. print count of even elements");
        int evenNumbers = 0;
        for (int i : b) {
            if (i % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.println("The even numbers count will be " + evenNumbers);


        System.out.println("\n\n 11. Given an array. print sum of elements");
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum = sum + b[i];

        }
        System.out.print(sum + " ");


        System.out.println("\n\n 12. Given an array. print sum of positive elements");
        int sumOfPositiveElements = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] >= 0) {
                sumOfPositiveElements += b[i];
            }
        }
        System.out.print(sumOfPositiveElements + " ");


        System.out.println("\n\n 13. Given an array. print multiplication of positive elements");
        int mult = 1;
        for (int i = 0; i < b.length; i++) {
            if (i > 0) {
                mult *= b[i];
            }
        }
        System.out.println(mult);


        System.out.println("\n\n 14. Find maximal element from array");
        int maxValue = b[0];
        for (int i = 0; i < b.length; i++) {
            if (maxValue < b[i]) {
                maxValue = b[i];
            }
        }
        System.out.println(maxValue);


        System.out.println("\n\n 15. Find minimal element from array");
        int minValue = b[0];
        for (int i = 0; i < b.length; i++) {
            if (b[i] < minValue){
                minValue =b[i];
            }
        }
        System.out.println(minValue);




    }


}



