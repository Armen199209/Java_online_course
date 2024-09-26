package demo;

import java.util.ArrayList;

public class CoreJava {
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        int[] arr2 = {7, 8, 9};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<String> arr4 = new ArrayList<String>();

        arr1[0] = 0;
        arr1[1] = 1;
        arr1[2] = 2;
        arr1[3] = 3;

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println("----------------------------");
        for (int s : arr2) {
            System.out.println(s);
        }

        System.out.println("----------------------------");

        for (int j = 0; j < arr1.length; j++) {
            System.out.println(arr1[j]);
        }


        System.out.println("----------------------------");

        for (int value : arr3) {
            if (value % 2 == 0) {
                System.out.println(value);
            } else {
                System.out.println(value + " is not multiple of 2");
            }
        }

        System.out.println("----------------------------");

        arr4.add("test1");
        arr4.add("test2");
        arr4.add("test3");

        System.out.println(arr4.get(0));
        System.out.println(arr4.contains("test3"));


        String s = "Rahul Shetty Academy";
        String[] s1 = s.split("Shetty");
        System.out.println(s1[0]);
        System.out.println(s1[1].trim());


        System.out.println("----------------------------");

        CoreJava v = new CoreJava();
        System.out.println(v.getData());

    }


    public String getData() {
        return "hello world";
    }


}
