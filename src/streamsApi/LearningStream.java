package streamsApi;


/*
 * @author adityagupta
 * @date 07/04/25
 */


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LearningStream {

    public static void main(String[] args) {
//        String s1 = "gaurav  h";
//        int[] arr = new int[]{1,2,3,4,5};
//
//        Long c = Arrays.stream(s1.split("")).filter(x -> x.equals("a")).count();
//        System.out.println(s1.chars().filter(x -> x == 'a').count());
//
//        AtomicInteger sum = new AtomicInteger(0);
//        Arrays.stream(arr).map(sum::addAndGet).forEach(System.out::println);

//        findDuplicates();
        filterMostLoginUser();
    }

    public static void filterMostLoginUser(){
        List<String> logs = List.of(
                "alice:202404121230:LOGIN",
                "bob:202404121235:LOGOUT",
                "alice:202404121245:LOGIN",
                "carol:202404121250:LOGIN",
                "bob:202404121255:LOGIN",
                "bob:202404121300:LOGIN"
        );

        String mostLoggedInUser = logs.stream()
                .filter(log -> log.split(":")[2].equals("LOGIN")) // Step 1: Filter LOGINs
                .map(log -> log.split(":")[0])                   // Step 2: Extract userId
                .collect(Collectors.groupingBy(                  // Step 3: Group and count
                        user -> user,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Comparator
                        .comparingLong(Map.Entry<String, Long>::getValue)   // max login count
                        .thenComparing(Map.Entry::getKey))                  // resolve tie lexically
                .map(Map.Entry::getKey)
                .orElse(null); // or use Optional if you prefer

        System.out.println("Most active user: " + mostLoggedInUser);
    }

    public static void findDuplicates(){
        List<String> names = Arrays
                .asList("apple", "banana", "apple", "orange", "banana", "grapes");

        Set<String> seen = new HashSet<>();

        List<String> duplicates = names.stream()
                .filter(name -> !seen.add(name)) // add() returns false if item was already in set
                .collect(Collectors.toList());

        System.out.println(duplicates);
    }


}
