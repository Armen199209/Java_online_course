package demo.streams;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Stream_1 {
//    @Test
//    public void regular() {
//
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Alex");
//        names.add("Don");
//        names.add("Alfred");
//        names.add("Natali");
//        names.add("Angel");
//        int count = 0;
//
//        for (int i = 0; i < names.size(); i++) {
//            if (names.get(i).startsWith("A")) {
//                count++;
//            }
//        }
//        System.out.println(count);
//
//    }
//
//    @Test
//    public void regular2() {
//
//        ArrayList<String> names2 = new ArrayList<>();
//        names2.add("Alex");
//        names2.add("Don");
//        names2.add("Alfred");
//        names2.add("Natali");
//        names2.add("Angel");
//
//        Long count2 = names2.stream().filter(s -> s.startsWith("A")).count();
//        System.out.println(count2);
//
//        Stream.of("Alex", "Don", "Alfred", "Natali", "Angel")
//                .filter(s -> s.length() > 4)
//                .limit(1)
//                .forEach(s -> System.out.println(s));
//
//
//    }
//
    @Test
    public void regular3() {
        Stream.of("Alexa", "Don", "Alfred", "Natalia", "Angel")
                .filter(s -> s.endsWith("a"))
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));

        System.out.println("--------------------------------");
        List<String> names3 = Arrays.asList("Alexa", "Don", "Alfred", "Natalia", "Angel");
        names3.stream()
                .filter(s -> s.startsWith("A"))
                .sorted()
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));
    }


    @Test
    public void regular4() {
        System.out.println("--------------------------------------");
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Alex");
        names1.add("Don");
        names1.add("Alfred");
        names1.add("Natali");
        names1.add("Angel");

        List<String> names2 = Arrays.asList("Alexa", "Dona", "Alfred", "Natalia", "Angeli");

        Stream<String> newStream = Stream.concat(names1.stream() , names2.stream()).distinct();
//        newStream.forEach(s -> System.out.println(s));

        boolean isMatch = newStream.anyMatch(s -> s.equalsIgnoreCase("Alfred"));
        Assert.assertTrue(isMatch);

//        newStream.forEach(s -> System.out.println(s));
    }


}
